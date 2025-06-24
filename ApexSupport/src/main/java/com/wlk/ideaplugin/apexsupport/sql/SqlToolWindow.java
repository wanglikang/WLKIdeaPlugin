package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * SQL工具窗口主类
 * 功能：创建包含SQL编辑器和结果展示区的工具窗口
 * 调用时机：当用户打开工具窗口时由IDE框架自动调用
 */
public class SqlToolWindow implements ToolWindowFactory {
    private SqlEditor sqlEditor;
    private ResultViewer resultViewer;
    
    /**
     * 创建工具窗口内容
     * @param project 当前项目
     * @param toolWindow 工具窗口实例
     * 调用时机：工具窗口首次打开或项目重新加载时
     */
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        // 初始化SQL编辑器
        sqlEditor = new SqlEditor(project);
        
        // 初始化结果查看器
        resultViewer = new ResultViewer();
        
        // 创建主面板，使用边框布局
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(sqlEditor, BorderLayout.CENTER);
        
        // 添加运行按钮
        JButton runButton = new JButton("运行SQL");
        runButton.addActionListener(e -> executeSql(project));
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(runButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // 将主面板添加到工具窗口
        Content content = ContentFactory.getInstance().createContent(mainPanel, "", false);
        toolWindow.getContentManager().addContent(content);
    }
    
    /**
     * 执行SQL查询
     * @param project 当前项目
     * 调用时机：用户点击运行按钮时
     */
    private void executeSql(Project project) {
        try {
            // 1. 创建临时文件保存SQL
            Path tempFile = Files.createTempFile("apex_sql_", ".sql");
            sqlEditor.saveToFile(tempFile.toString());
            
            // 2. 显示执行状态
            ProgressManager.getInstance().run(new Task.Backgroundable(project, "执行SQL查询") {
                @Override
                public void run(@NotNull ProgressIndicator indicator) {
                    indicator.setText("正在执行SQL查询...");
                    
                    // 3. 异步执行SQL
                    SqlRunner.executeSqlAsync(project, tempFile.toString())
                        .thenAccept(result -> {
                            // 4. 显示结果
                            ApplicationManager.getApplication().invokeLater(() -> {
                                resultViewer.displayResult(result);
                            });
                        })
                        .exceptionally(e -> {
                            ApplicationManager.getApplication().invokeLater(() -> {
                                Messages.showErrorDialog("执行SQL失败: " + e.getMessage(), "SQL执行错误");
                            });
                            return null;
                        });
                }
            });
        } catch (IOException e) {
            Messages.showErrorDialog("创建临时文件失败: " + e.getMessage(), "文件错误");
        }
    }
}