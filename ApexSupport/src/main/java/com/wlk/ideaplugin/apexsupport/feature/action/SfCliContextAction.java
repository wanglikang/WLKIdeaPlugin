package com.wlk.ideaplugin.apexsupport.feature.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.wlk.ideaplugin.apexsupport.language.ApexFile;
import org.jetbrains.annotations.NotNull;

public class SfCliContextAction extends AnAction {
    @Override
    public void update(@NotNull AnActionEvent e) {
        // Only show for .cls files
        boolean visible = e.getData(CommonDataKeys.PSI_FILE) instanceof ApexFile;
        e.getPresentation().setVisible(visible);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

    }
}