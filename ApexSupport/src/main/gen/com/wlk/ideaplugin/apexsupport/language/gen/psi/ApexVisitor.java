// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;

public class ApexVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull ApexProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull ApexNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
