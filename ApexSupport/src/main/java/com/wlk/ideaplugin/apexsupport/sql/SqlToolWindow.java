package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.fileTypes.FileTypes;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.testFramework.LightVirtualFile;
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
        // 初始化SQL编辑器 - 不再添加到工具窗口
        sqlEditor = new SqlEditor(project);
        
        // 初始化结果查看器
        resultViewer = new ResultViewer();
        
        // 创建主面板，仅包含结果查看器
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(resultViewer, BorderLayout.CENTER);
        
        // 将结果查看器添加到工具窗口
        Content content = ContentFactory.getInstance().createContent(mainPanel, "", false);
        toolWindow.getContentManager().addContent(content);
        
        // 将SQL编辑器添加到编辑器区域
        ApplicationManager.getApplication().invokeLater(() -> {
            // 创建虚拟文件用于编辑器
            VirtualFile virtualFile = new LightVirtualFile("SOQL_Query.soql", FileTypes.PLAIN_TEXT, sqlEditor.getText());
            
            
            // 使用FileEditorManager打开编辑器
            Editor editor = FileEditorManager.getInstance(project).openTextEditor(
                    new OpenFileDescriptor(project, virtualFile), true);

            // 设置编辑器内容
//            Editor editor = FileEditorManager.getInstance(project).getSelectedTextEditor();
            if (editor != null) {
                ApplicationManager.getApplication().runWriteAction(()->{
                    editor.getDocument().setText(sqlEditor.getText());
                });
//                Application.runWriteAction()
//                editor.getDocument().setText(sqlEditor.getText());
                
                // 创建包含按钮和编辑器的面板
                JPanel editorPanel = new JPanel(new BorderLayout());
                
                // 创建工具栏面板并添加按钮
                JPanel toolbarPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                JButton runButton = new JButton("运行SQL");
                runButton.addActionListener(e -> {
                    try {
                        resultViewer.clear();
                        executeSql(project,virtualFile);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
                toolbarPanel.add(runButton);
                LOG.info("将工具栏添加到顶部");

                // 将工具栏添加到顶部
                editorPanel.add(toolbarPanel, BorderLayout.NORTH);
                
                // 获取编辑器组件并添加到中心
                JComponent editorComponent = editor.getContentComponent();
                editorPanel.add(editorComponent, BorderLayout.CENTER);
                LOG.info("获取编辑器组件并添加到中心");

                // 替换编辑器组件
                LOG.info("开始替换编辑器组件");
                editor.getComponent().remove(editorComponent);
                editor.getComponent().add(editorPanel);
                LOG.info("替换编辑器成功");
            }else{
                LOG.warn("找不到编辑器");
            }
        });
    }
    
    /**
     * 执行SQL查询
     * @param project 当前项目
     * 调用时机：用户点击运行按钮时
     */
    private void executeSql(Project project,VirtualFile virtualFile) throws IOException {
        // 1. 获取SQL文本
        // 确保使用编辑器中的最新内容
        // String sql = VfsUtilCore.loadText(virtualFile);// 对于已经保存的文件，可以用这种方式
        Document document = FileDocumentManager.getInstance().getDocument(virtualFile);// 对于未保存的文件，可以用这种方式
        String sql = document.getText();
        LOG.warn("待执行的soql："+sql);
        
         // 清空表格内容并显示loading
         resultViewer.clear();
         resultViewer.showLoading(true);
         
        // 2. 显示执行状态
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