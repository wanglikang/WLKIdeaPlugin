package com.wlk.ideaplugin.apexsupport.language;


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class ApexFileType extends LanguageFileType {

    public static final ApexFileType INSTANCE = new ApexFileType();

    private ApexFileType() {
        super(ApexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Apex File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Apex language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cls";
    }

    @Override
    public Icon getIcon() {
        return ApexIcon.FILE;
    }

}
