package com.wlk.ideaPlugin.qldebugger.window;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.*;

import com.alibaba.fastjson.JSONObject;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationAction;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.JBColor;
import com.intellij.ui.JBSplitter;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.components.JBTextArea;
import com.wlk.ideaPlugin.qldebugger.persistence.MyData;
import com.wlk.ideaPlugin.qldebugger.persistence.QLTestConfigSetting2;
import com.wlk.ideaPlugin.qldebugger.util.QlExpressUtil;
import org.jetbrains.annotations.NotNull;

/**
 * @author 奈昕
 * @date 2023/9/24 13:19:14
 */
public class QlPanel {

    private final JPanel qlMainPanel = new JPanel();
    private JTextArea paramText;
    private JTextArea resultText;
    private JTextArea qlExpressField;

    //private QLTestConfigSetting instance;
    private QLTestConfigSetting2 instance2;

    private String lastEditKey = "lastEditKey";
    private JButton loadButton;

    private JButton saveAsButton;
    private JEditorPane saveAsEdit;


    private JBScrollPane expressPanel;

    private JBPanel configPanel;

    private  ComboBox<String> configSelect;

    public QlPanel() {

        //qlMainPanel.setLayout(new GridLayout(2, 1));
        qlMainPanel.setLayout(new BorderLayout());

        configPanel = new JBPanel();
        //上方的下拉框选项
        configPanel.setLayout(new FlowLayout(FlowLayout.LEFT));


        loadButton = new JButton("load");
        saveAsEdit = new JEditorPane();
        saveAsEdit.setText("保存配置项1");

        saveAsButton = new JButton("另存为");
        paramText = new JBTextArea();
        qlExpressField = new JBTextArea();
        resultText = new JBTextArea();

        //configPanel.add(configSelect);
        configPanel.add(loadButton);
        configPanel.add(saveAsEdit);
        configPanel.add(saveAsButton);
        //qlMainPanel.add("configPanel", configPanel);
        qlMainPanel.add(configPanel,BorderLayout.NORTH);
        JBScrollPane paramsPanel = new JBScrollPane(paramText);
        qlExpressField.setEditable(true);

        resultText.setText("结果:");
        JBScrollPane resultPanel = new JBScrollPane(resultText);

        JBSplitter jbSplitter1 = new JBSplitter();
        JBSplitter jbSplitter2 = new JBSplitter();
        jbSplitter1.setFirstComponent(paramsPanel);
        expressPanel = new JBScrollPane(qlExpressField);
        jbSplitter1.setSecondComponent(expressPanel);
        jbSplitter1.setSplitterProportionKey("splitKey1");
        jbSplitter2.setFirstComponent(jbSplitter1);
        jbSplitter2.setSecondComponent(resultPanel);
        jbSplitter2.setSplitterProportionKey("splitKey2");

        //qlMainPanel.add("content", jbSplitter2);
        qlMainPanel.add(jbSplitter2,BorderLayout.CENTER);


    }

    public void initWithToolWindows(ToolWindow toolWindow){

        QLTestConfigSetting2 instance2 = ApplicationManager.getApplication().getService(QLTestConfigSetting2.class);
        System.out.println("getInstance");
        MyData myData = instance2.getMyData();
        Set<String> configKeys = myData.paramsMap.keySet();
        HashSet<String> allSettings = Sets.newHashSet(configKeys);
        allSettings.remove("lastEditKey");
        configSelect = new ComboBox<>(allSettings.toArray(new String[] {}));
        configStoredCache(myData);

        addListener(toolWindow, myData, configSelect);
    }

    private void  configStoredCache( MyData myData){
        Map<String, String> expressMap = myData.getExpressMap();
        Map<String, String> paramsMap = myData.getParamsMap();
        Set<String> configKeys = myData.getParamsMap().keySet();
        String lastEditKey = myData.getLastEditKey();
        //JSONObject lastEditConfig = configJsonContent.getJSONObject("lastEditKey");
        String paramsInText = null;
        String express = null;
        if (lastEditKey != null) {
            paramsInText = paramsMap.get(lastEditKey);
            express = expressMap.get(lastEditKey);
        }
        configPanel.add(configSelect,0);
        if (paramsInText == null) {
            JSONObject defaultParam  = new JSONObject();
            defaultParam.put("a", 1);
            defaultParam.put("b", 2);
            paramsInText = defaultParam.toJSONString();
        }

        paramText.setText(paramsInText);

        if (express == null) {
            express = "a+b";
        }
        qlExpressField.setText(express);
    }

    private void addListener(ToolWindow toolWindow,  MyData myData, ComboBox<String> configSelect) {
        paramText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String text = paramText.getText();
                String formatParam = text;
                try {
                    JSONObject jsonObject = JSONObject.parseObject(text);
                    formatParam = JSONObject.toJSONString(jsonObject, true);
                    Color background = paramText.getBackground();
                } catch (Exception ex) {
                    Color background = paramText.getBackground();
                    paramText.setBackground(new JBColor(new Color(229, 36, 36), new Color(5, 229, 229)));
                    NotificationGroupManager.getInstance().getNotificationGroup("qlNotify")
                        .createNotification("QLDebugger", "参数错误，请确认是合法的json"+ex.getMessage(), NotificationType.ERROR)
                        .addAction(new NotificationAction("知晓，继续修改") {
                            @Override
                            public void actionPerformed(@NotNull AnActionEvent e, @NotNull Notification notification) {
                                System.out.println("点击了一下");
                                notification.expire();
                                paramText.setBackground(background);

                            }
                        }).notify(toolWindow.getProject());
                }
                paramText.setText(formatParam);
                super.focusLost(e);

            }
        });

        qlExpressField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                List<String> errorList = Lists.newArrayList();
                super.keyPressed(e);
                Color background = resultText.getBackground();
                try {
                    char keyChar = e.getKeyChar();
                    if (keyChar == '\n' || keyChar == '\t') {
                        String paramStr = paramText.getText();
                        String express = qlExpressField.getText();
                        Object result = QlExpressUtil.runWithParams(express, JSONObject.parseObject(paramStr),
                            errorList);
                        resultText.setText("实时结果:\n" + String.valueOf(result));
                    }
                } catch (Exception ex) {
                    resultText.setBackground(new JBColor(new Color(229, 36, 36), new Color(5, 229, 229)));
                    resultText.setText("错误:" + ex.getMessage());
                    resultText.setBackground(background);
                }
            }
        });

        saveAsButton.addActionListener(t -> {
            String editParam = paramText.getText();
            String expressEdit = qlExpressField.getText();
            String configKey = saveAsEdit.getText();
            //instance.addConfig(configKey, editParam, expressEdit);
            myData.setLastEditKey(configKey);
            myData.getParamsMap().put(configKey,editParam);
            myData.getExpressMap().put(configKey,expressEdit);
            System.out.println("保存了设置：" + configKey);
            configSelect.addItem(configKey);
        });

        loadButton.addActionListener(t->{
            Object selectedItem = configSelect.getSelectedItem();
            if(selectedItem != null) {
                String configKey = selectedItem.toString();
                Map<String, String> expressMap = myData.getExpressMap();
                Map<String, String> paramsMap = myData.getParamsMap();
                String paramsInConfig = paramsMap.get(configKey);
                String expressInConfig = expressMap.get(configKey);
                qlExpressField.setText(expressInConfig);
                paramText.setText(paramsInConfig);
                lastEditKey = configKey;
            }

        });
    }

    public JPanel getQlMainPanel() {

        return qlMainPanel;
    }


    public void onClose(){
        //instance.getConfigJsonContent().put("lastEditKey",lastEditKey);
        instance2.getMyData().setLastEditKey(lastEditKey);
    }

}
