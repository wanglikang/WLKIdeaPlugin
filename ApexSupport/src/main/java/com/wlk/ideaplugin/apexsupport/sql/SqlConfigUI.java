package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * SQL插件配置界面
 */
public class SqlConfigUI implements Configurable {
    private JPanel panel;
    private JTextField sfCliPathField;
    private JComboBox<String> outputFormatCombo;
    private JSpinner timeoutSpinner;
    
    private final Project project;
    private final SqlConfig config;
    
    public SqlConfigUI(Project project) {
        this.project = project;
        this.config = SqlConfig.getInstance(project);
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
        panel.add(new JLabel("SF CLI Path:"));
        sfCliPathField = new JTextField(config.getSfCliPath());
        panel.add(sfCliPathField);
        
        // 添加输出格式配置组件
        panel.add(new JLabel("Default Output Format:"));
        outputFormatCombo = new JComboBox<>(new String[]{"json", "csv", "table"});
        outputFormatCombo.setSelectedItem(config.getDefaultOutputFormat());
        panel.add(outputFormatCombo);
        
        // 添加超时时间配置组件
        panel.add(new JLabel("Query Timeout (seconds):"));
        timeoutSpinner = new JSpinner(new SpinnerNumberModel(config.getQueryTimeout(), 1, 300, 1));
        panel.add(timeoutSpinner);
        
        return panel;
    }

    @Override
    public boolean isModified() {
        return !sfCliPathField.getText().equals(config.getSfCliPath()) 
                || !outputFormatCombo.getSelectedItem().equals(config.getDefaultOutputFormat())
                || !timeoutSpinner.getValue().equals(config.getQueryTimeout());
    }

    @Override
    public void apply() {
        config.setSfCliPath(sfCliPathField.getText());
        config.setDefaultOutputFormat((String) outputFormatCombo.getSelectedItem());
        config.setQueryTimeout((Integer) timeoutSpinner.getValue());
    }
}