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

public class ApexLiteralImpl extends ASTWrapperPsiElement implements ApexLiteral {

  public ApexLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexBooleanLiteral getBooleanLiteral() {
    return findChildByClass(ApexBooleanLiteral.class);
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
  public ApexNumberLiteral getNumberLiteral() {
    return findChildByClass(ApexNumberLiteral.class);
  }

  @Override
  @Nullable
  public ApexStringLiteral getStringLiteral() {
    return findChildByClass(ApexStringLiteral.class);
  }

}
