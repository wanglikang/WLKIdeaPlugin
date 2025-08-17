package com.wlk.ideaplugin.apexsupport.feature.toolwindows;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ApexToolWindowFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentManager contentManager = toolWindow.getContentManager();
        
        // 创建第一个tab
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Tab 1 Content"));
        Content content1 = ContentFactory.getInstance().createContent(panel1, "Tab 1", false);
        
        // 创建第二个tab
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Tab 2 Content"));
        Content content2 = ContentFactory.getInstance().createContent(panel2, "Tab 2", false);
        
        // 添加所有tab到内容管理器
        contentManager.addContent(content1);
        contentManager.addContent(content2);
    }
}
