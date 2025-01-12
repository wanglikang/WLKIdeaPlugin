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

public class ApexWhenLiteralImpl extends ASTWrapperPsiElement implements ApexWhenLiteral {

  public ApexWhenLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitWhenLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexIntegerLiteral getIntegerLiteral() {
    return findChildByClass(ApexIntegerLiteral.class);
  }

  @Override
  @Nullable
  public ApexLongLiteral getLongLiteral() {
    return findChildByClass(ApexLongLiteral.class);
  }

  @Override
  @Nullable
  public ApexStringLiteral getStringLiteral() {
    return findChildByClass(ApexStringLiteral.class);
  }

  @Override
  @Nullable
  public ApexId getId() {
    return findChildByClass(ApexId.class);
  }

  @Override
  @Nullable
  public ApexWhenLiteral getWhenLiteral() {
    return findChildByClass(ApexWhenLiteral.class);
  }

}
