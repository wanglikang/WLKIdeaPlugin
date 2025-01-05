//自动生成的语法分析器
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
  public ApexFloatingPointLiteral getFloatingPointLiteral() {
    return findChildByClass(ApexFloatingPointLiteral.class);
  }

  @Override
  @Nullable
  public ApexIntegerLiteral getIntegerLiteral() {
    return findChildByClass(ApexIntegerLiteral.class);
  }

  @Override
  @Nullable
  public ApexStringLiteral getStringLiteral() {
    return findChildByClass(ApexStringLiteral.class);
  }

}
