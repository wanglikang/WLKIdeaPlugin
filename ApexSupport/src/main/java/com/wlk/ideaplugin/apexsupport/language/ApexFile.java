package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class ApexFile extends PsiFileBase {

    public ApexFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ApexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ApexFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Apex File";
    }

}
