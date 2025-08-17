package com.wlk.ideaplugin.apexsupport.feature.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class CompareAction extends AnAction {
    public CompareAction() {
        super("Compare with org");
    }
    
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // TODO: Implement SF CLI compare command execution
    }
}