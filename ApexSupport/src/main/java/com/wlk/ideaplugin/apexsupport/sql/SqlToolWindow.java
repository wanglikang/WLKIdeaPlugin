package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Document;
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
        JPanel toolbarPanel = new JPanel(new BorderLayout());
        JButton runButton = new JButton("运行SQL");
        runButton.addActionListener(e -> {
            try {
                resultViewer.clear();
                executeSql(project, editorField.getDocument());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        toolbarPanel.add(runButton, BorderLayout.CENTER);
        
        // 组装UI
        mainPanel.add(toolbarPanel, BorderLayout.NORTH);
        mainPanel.add(editorField, BorderLayout.CENTER);
        mainPanel.add(resultViewer, BorderLayout.SOUTH);
        
        // 将主面板添加到工具窗口
        Content content = ContentFactory.getInstance().createContent(mainPanel, "", false);
        toolWindow.getContentManager().addContent(content);
    }
    
    private void executeSql(Project project, Document document) throws IOException {
        String sql = document.getText();
        LOG.warn("待执行的soql："+sql);
        
        resultViewer.clear();
        resultViewer.showLoading(true);
        
        ProgressManager.getInstance().run(new Task.Backgroundable(project, "执行SQL查询") {
            @Override
            public void run(@NotNull ProgressIndicator indicator) {
                indicator.setText("正在执行SQL查询...:"+sql);
                // 3. 异步执行SQL
                SqlRunner.executeSqlStringAsync(sql)
                    .thenAccept(result -> {
                        indicator.setText("执行SOQL结束");
                        LOG.warn("命令运行结果为："+result);
                        // 4. 显示结果
                        ApplicationManager.getApplication().invokeLater(() -> {
                            resultViewer.showLoading(false);
                            resultViewer.displayResult(result);
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
                            Messages.showErrorDialog("执行SQL失败: " + e.getMessage(), "SQL执行错误");
                        });
                        return null;
                    });
            }
        });
    }
}