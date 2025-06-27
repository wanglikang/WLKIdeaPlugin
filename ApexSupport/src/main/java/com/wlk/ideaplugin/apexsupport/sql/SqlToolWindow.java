package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileTypes.FileTypes;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.EditorTextField;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * SQL工具窗口主类
 * 功能：创建包含SQL编辑器和结果展示区的工具窗口
 * 调用时机：当用户打开工具窗口时由IDE框架自动调用
 */
public class SqlToolWindow implements ToolWindowFactory {
    private static final Logger LOG = Logger.getInstance(SqlToolWindow.class);
    private ResultViewer resultViewer;
    private JLabel executionTimeLabel;
    
    /**
     * 创建工具窗口内容
     * @param project 当前项目
     * @param toolWindow 工具窗口实例
     * 调用时机：工具窗口首次打开或项目重新加载时
     */
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        // 初始化结果查看器
        resultViewer = new ResultViewer();
        
        // 创建主面板
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // 创建EditorTextField
        EditorTextField editorField = new EditorTextField("select ID,Name from Account limit 10", project, FileTypes.PLAIN_TEXT);
        editorField.setOneLineMode(false);
        editorField.setPreferredSize(new Dimension(600, 200));
        
        // 创建工具栏面板
        JPanel toolbarPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // 添加运行按钮
        JButton runButton = new JButton("运行SQL");
        
        // 添加耗时显示标签
        executionTimeLabel = new JLabel("耗时: 0ms");
        executionTimeLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        
        // 添加参数选择下拉框
        JComboBox<String> optionComboBox = new com.intellij.openapi.ui.ComboBox<>(new String[]{"boe","prod", "bp-prod", "bp-boe"});
        optionComboBox.setSelectedItem("json");
        optionComboBox.setToolTipText("选择输出格式");
        
        runButton.addActionListener(e -> {
            try {
                resultViewer.clear();
                String selectedOption = (String) optionComboBox.getSelectedItem();
                String sql = editorField.getDocument().getText();
                executeSqlWithOption(project, sql, selectedOption);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        toolbarPanel.add(runButton);
        toolbarPanel.add(new JLabel("输出格式:"));
        toolbarPanel.add(optionComboBox);
        toolbarPanel.add(executionTimeLabel);
        
        // 创建可调整的分割面板
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, editorField, resultViewer);
        splitPane.setResizeWeight(0.5);
        splitPane.setOneTouchExpandable(true);
        
        // 组装UI
        mainPanel.add(toolbarPanel, BorderLayout.NORTH);
        mainPanel.add(splitPane, BorderLayout.CENTER);
        
        // 将主面板添加到工具窗口
        Content content = ContentFactory.getInstance().createContent(mainPanel, "", false);
        toolWindow.getContentManager().addContent(content);
    }
    
    private void executeSqlWithOption(Project project, String sql, String option) throws IOException {
        String env = "boe";
        if (option != null && !option.isEmpty()) {
            env  = option;
        }
        
        resultViewer.clear();
        resultViewer.showLoading(true);
        
        long startTime = System.currentTimeMillis();
        
        String finalEnv = env;
        ProgressManager.getInstance().run(new Task.Backgroundable(project, "执行SQL查询") {
            @Override
            public void run(@NotNull ProgressIndicator indicator) {
                indicator.setText("正在执行SQL查询...:"+sql);
                SqlRunner.executeSqlStringAsync(sql, finalEnv)
                    .thenAccept(result -> {
                        indicator.setText("执行SOQL结束");
                        LOG.warn("命令运行结果为："+result);
                        // 4. 显示结果
                        ApplicationManager.getApplication().invokeLater(() -> {
                            resultViewer.showLoading(false);
                            resultViewer.displayResult(result);
                            long endTime = System.currentTimeMillis();
                            executionTimeLabel.setText("耗时: " + (endTime - startTime) + "ms");
                        });
                    })
                    .exceptionally(e -> {
                        indicator.setText("执行SOQL异常");
                        ApplicationManager.getApplication().invokeLater(() -> {
                            resultViewer.showLoading(false);
                            StackTraceElement[] stackTrace = e.getStackTrace();
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                String string = stackTraceElement.toString();
                                LOG.warn("stackTraceElement:" + string);
                            }
                            Messages.showErrorDialog( e.getMessage(), "SQL执行错误");
                        });
                        return null;
                    });
            }
        });
    }
}