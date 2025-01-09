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
import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexPsiImplUtil;

public class ApexEnhancedForControlImpl extends ASTWrapperPsiElement implements ApexEnhancedForControl {

  public ApexEnhancedForControlImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitEnhancedForControl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexExpression getExpression() {
    return findNotNullChildByClass(ApexExpression.class);
  }

  @Override
  @NotNull
  public ApexType_ getType_() {
    return findNotNullChildByClass(ApexType_.class);
  }

  @Override
  @NotNull
  public ApexVariableDeclaratorId getVariableDeclaratorId() {
    return findNotNullChildByClass(ApexVariableDeclaratorId.class);
  }

  @Override
  @NotNull
  public List<ApexVariableModifier> getVariableModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ApexVariableModifier.class);
  }

}
