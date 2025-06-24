package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.fileTypes.FileTypes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.EditorTextField;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * SQL编辑器组件
 * 功能：提供SQL编辑区域，支持语法高亮和文件保存
 * 调用时机：当工具窗口初始化时创建实例
 */
public class SqlEditor extends EditorTextField {
    private final Project project;
    
    /**
     * 构造函数
     * @param project 当前项目实例
     * 调用时机：工具窗口初始化时
     */
    public SqlEditor(@NotNull Project project) {
        super(project, FileTypes.PLAIN_TEXT);
        this.project = project;
        setFontInheritedFromLAF(false);
        setFont(JBUI.Fonts.create("Monospaced", 14));
    }
    
    /**
     * 保存SQL内容到指定文件
     * @param filePath 文件保存路径
     * 调用时机：用户点击保存按钮时
     */
    public void saveToFile(String filePath) {
        try {
            WriteAction.run(() -> {
                VirtualFile file = LocalFileSystem.getInstance().refreshAndFindFileByPath(filePath);
                if (file == null) {
                    file = LocalFileSystem.getInstance().createChildFile(null, file,filePath);
                }
                file.setBinaryContent(getText().getBytes(StandardCharsets.UTF_8));
            });
        } catch (IOException e) {
            Messages.showErrorDialog(project, "保存SQL失败: " + e.getMessage(), "错误");
        }
    }
}