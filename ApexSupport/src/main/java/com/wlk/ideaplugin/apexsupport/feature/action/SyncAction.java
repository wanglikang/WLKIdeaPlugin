package com.wlk.ideaplugin.apexsupport.feature.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class SyncAction extends AnAction {
    public SyncAction() {
        super("Synchronize from org");
    }
    
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // TODO: Implement SF CLI sync command execution
    }
}