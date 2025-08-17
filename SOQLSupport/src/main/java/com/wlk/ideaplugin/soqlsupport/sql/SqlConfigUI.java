package com.wlk.ideaplugin.soqlsupport.sql;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.project.Project;
import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBScrollPane;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * SQL插件配置界面
 */
public class SqlConfigUI implements Configurable {
    private static final Logger LOG = Logger.getInstance(SqlConfigUI.class);
    private JPanel panel;
    private JTextField sfCliPathField;
    private JComboBox<String> outputFormatCombo;
    private JSpinner timeoutSpinner;
    private JButton refreshEnvironmentsButton;
    private JButton addEnvironmentButton;
    private JButton removeEnvironmentButton;
    private JList<String> environmentsList;
    private DefaultListModel<String> environmentsListModel;
    
    private final Project project;
    private final SqlConfig config;
    // 0: 还未初始化
    // 1: 初始化中
    // 2: 初始化完成
    // -x: 初始化失败，重试中
    AtomicInteger refreshStatus = new AtomicInteger(0);
    public SqlConfigUI(Project project) {
        this.project = project;
        this.config = SqlConfig.getInstance(project);
        this.environmentsListModel = new DefaultListModel<>();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Apex SQL Settings";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // 添加SF CLI路径配置组件
        panel.add(createLabeledComponent("SF CLI Path:", sfCliPathField = new JTextField(config.getSfCliPath())));
        
        // 添加输出格式配置组件
        panel.add(createLabeledComponent("Default Output Format:", 
                outputFormatCombo = new JComboBox<>(new String[]{"json", "csv", "table"})));
        outputFormatCombo.setSelectedItem(config.getDefaultOutputFormat());
        
        // 添加超时时间配置组件
        panel.add(createLabeledComponent("Query Timeout (seconds):", 
                timeoutSpinner = new JSpinner(new SpinnerNumberModel(config.getQueryTimeout(), 1, 300, 1))));
        
        // 添加环境列表配置组件
        panel.add(new JLabel("Environments:"));
        
        // 环境列表和控制按钮
        JPanel environmentsPanel = new JPanel(new BorderLayout());
        environmentsList = new JBList<>(environmentsListModel);
        updateEnvironmentsList();
        JScrollPane listScrollPane = new JBScrollPane(environmentsList);
        listScrollPane.setPreferredSize(new Dimension(300, 120));
        
        // 按钮面板
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1, 0, 5));
        refreshEnvironmentsButton = new JButton("Refresh");
        addEnvironmentButton = new JButton("Add");
//        removeEnvironmentButton = new JButton("Remove");
        
        // 添加按钮事件监听
        refreshEnvironmentsButton.addActionListener(e -> refreshEnvironments());
        addEnvironmentButton.addActionListener(e -> addEnvironment());
//        removeEnvironmentButton.addActionListener(e -> removeSelectedEnvironment());
        
        buttonsPanel.add(refreshEnvironmentsButton);
        buttonsPanel.add(addEnvironmentButton);
        buttonsPanel.add(removeEnvironmentButton);
        
        environmentsPanel.add(listScrollPane, BorderLayout.CENTER);
        environmentsPanel.add(buttonsPanel, BorderLayout.EAST);
        
        panel.add(environmentsPanel);
        
        return panel;
    }
    
    // 辅助方法：创建带标签的组件
    private JPanel createLabeledComponent(String labelText, JComponent component) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(labelText), BorderLayout.NORTH);
        panel.add(component, BorderLayout.CENTER);
        return panel;
    }
    
    // 更新环境列表
    private void updateEnvironmentsList() {
        environmentsListModel.clear();
        for (String env : config.getEnvironments()) {
            environmentsListModel.addElement(env);
        }
    }
    
    // 刷新环境列表
    private void refreshEnvironments() {
        // 这里可以实现从SF CLI获取最新环境列表的逻辑
        // 例如调用ShellCommandRunner来获取org列表
        // 为了演示，这里简单地添加一些示例环境
        List<String> sampleEnvironments = new ArrayList<>();
        if(refreshStatus.get() > 0){
            return;
        }
        refreshStatus.set(1);
        List<String> command = List.of( "/usr/local/bin/sf", "org", "list","--json");
        List<String> selectOrgItem  = new ArrayList<>();
        ShellCommandRunner.executeSqlStringAsync(command ).thenAccept(resultStr->{
            JsonObject jsonObject = JsonParser.parseString(resultStr).getAsJsonObject();
            JsonObject result = jsonObject.getAsJsonObject("result");
            Set<Map.Entry<String, JsonElement>> entries = result.entrySet();
            Set<String> orgSet = new HashSet<>();
            for (Map.Entry<String, JsonElement> entry : entries) {
                JsonArray someOrgArr = entry.getValue().getAsJsonArray();
                for (JsonElement orgInfoEle : someOrgArr) {
                    JsonObject orgInfo = orgInfoEle.getAsJsonObject();
                    String alias = orgInfo.get("alias").getAsString();
                    orgSet.add(alias);
                }
            }

            selectOrgItem.addAll(orgSet);
            if(selectOrgItem.size() > 0){
                // 更新下拉框选项
                environmentsListModel.removeAllElements();
            }
            selectOrgItem.forEach(item->environmentsListModel.addElement(item));

            // 将组织列表保存到配置中
            config.setEnvironments(selectOrgItem);

            refreshStatus.set(2);
        }).exceptionally(exp->{
            refreshStatus.set(-2);
            LOG.error(exp.getMessage(),exp);
            return null;
        });

        
        // 更新配置和UI
        config.setEnvironments(sampleEnvironments);
        updateEnvironmentsList();
    }
    
    // 添加新环境
    private void addEnvironment() {
        String env = JOptionPane.showInputDialog(panel, "Enter environment name:");
        if (env != null && !env.trim().isEmpty()) {
            List<String> environments = new ArrayList<>(config.getEnvironments());
            if (!environments.contains(env)) {
                environments.add(env);
                config.setEnvironments(environments);
                updateEnvironmentsList();
            }
        }
    }
    
//    // 删除选中的环境
//    private void removeSelectedEnvironment() {
//        int selectedIndex = environmentsList.getSelectedIndex();
//        if (selectedIndex >= 0) {
//            List<String> environments = new ArrayList<>(config.getEnvironments());
//            environments.remove(selectedIndex);
//            config.setEnvironments(environments);
//            updateEnvironmentsList();
//        }
//    }

    @Override
    public boolean isModified() {
        ListModel<String> model = environmentsList.getModel();
        Set<String> envSet  = new HashSet<>();
        for (int i = 0; i < model.getSize(); i++) {
            String elementAt = model.getElementAt(i);
            envSet.add(elementAt);
        }
        Set<String> environments = Sets.newHashSet(config.getEnvironments());

        return !sfCliPathField.getText().equals(config.getSfCliPath())
                || !outputFormatCombo.getSelectedItem().equals(config.getDefaultOutputFormat())
                || !timeoutSpinner.getValue().equals(config.getQueryTimeout())
                ||  !envSet.equals(environments);
    }

    @Override
    public void apply() {
        config.setSfCliPath(sfCliPathField.getText());
        config.setDefaultOutputFormat((String) outputFormatCombo.getSelectedItem());
        config.setQueryTimeout((Integer) timeoutSpinner.getValue());
    }
    
    @Override
    public void reset() {
        sfCliPathField.setText(config.getSfCliPath());
        outputFormatCombo.setSelectedItem(config.getDefaultOutputFormat());
        timeoutSpinner.setValue(config.getQueryTimeout());
        updateEnvironmentsList();
    }
}