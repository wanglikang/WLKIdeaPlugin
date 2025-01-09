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
import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexPsiImplUtil;

public class ApexExprArrIndexExprImpl extends ApexExprImpl implements ApexExprArrIndexExpr {

  public ApexExprArrIndexExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitExprArrIndexExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ApexExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ApexExpression.class);
  }

}
