// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.*;
import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexPsiImplUtil;

public class ApexDotMethodCallImpl extends ASTWrapperPsiElement implements ApexDotMethodCall {

  public ApexDotMethodCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitDotMethodCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexAnyId getAnyId() {
    return findNotNullChildByClass(ApexAnyId.class);
  }

  @Override
  @Nullable
  public ApexExpressionList getExpressionList() {
    return findChildByClass(ApexExpressionList.class);
  }

}
