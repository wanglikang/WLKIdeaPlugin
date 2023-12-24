package com.wlk.ideaPlugin.qldebugger.factory;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManagerEvent;
import com.intellij.ui.content.ContentManagerListener;
import com.wlk.ideaPlugin.qldebugger.window.QlPanel;
import org.jetbrains.annotations.NotNull;

/**
 * @author 奈昕
 * @date 2023/9/24 10:28:47
 */
public class QlExpressToolWindowFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        System.out.println("createToolWindowContent");
        QlPanel qlPanel = new QlPanel();
        qlPanel.initWithToolWindows(toolWindow);

        Content content = ContentFactory.getInstance().createContent(qlPanel.getQlMainPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
        toolWindow.getContentManager().addContentManagerListener(new ContentManagerListener(){

            @Override
            public void contentRemoved(@NotNull ContentManagerEvent event) {
                    qlPanel.onClose();
                ContentManagerListener.super.contentRemoved(event);
            }
        });
    }
}
