package com.wlk.ideaplugin.apexsupport.feature.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.wlk.ideaplugin.apexsupport.language.ApexFile;
import org.jetbrains.annotations.NotNull;

public class DeployAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // TODO: Implement SF CLI deploy command execution
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabledAndVisible(
            e.getData(CommonDataKeys.PSI_FILE) instanceof ApexFile
        );
    }
}
