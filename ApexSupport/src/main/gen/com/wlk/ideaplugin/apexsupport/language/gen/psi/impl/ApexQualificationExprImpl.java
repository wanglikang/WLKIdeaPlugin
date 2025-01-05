//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.*;

public class ApexQualificationExprImpl extends ApexExprImpl implements ApexQualificationExpr {

  public ApexQualificationExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitQualificationExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexExpr getExpr() {
    return findNotNullChildByClass(ApexExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
