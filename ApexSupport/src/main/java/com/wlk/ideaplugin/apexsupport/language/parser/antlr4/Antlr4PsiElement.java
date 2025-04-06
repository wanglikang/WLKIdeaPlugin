package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;


public class Antlr4PsiElement extends ASTWrapperPsiElement implements PsiElement {

    public Antlr4PsiElement(@NotNull ASTNode node) {
        super(node);
    }
    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        System.out.println("Antlr4PsiElement accept");
        super.accept(visitor);
    }
}
