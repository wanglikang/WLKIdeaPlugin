package com.wlk.ideaplugin.apexsupport.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class ApexNamedElementImpl extends ASTWrapperPsiElement implements ApexNamedElement {

    public ApexNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
