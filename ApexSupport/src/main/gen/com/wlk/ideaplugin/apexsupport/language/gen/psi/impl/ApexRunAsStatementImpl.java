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

public class ApexRunAsStatementImpl extends ASTWrapperPsiElement implements ApexRunAsStatement {

  public ApexRunAsStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitRunAsStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexBlock getBlock() {
    return findNotNullChildByClass(ApexBlock.class);
  }

  @Override
  @Nullable
  public ApexExpressionList getExpressionList() {
    return findChildByClass(ApexExpressionList.class);
  }

  @Override
  @Nullable
  public ApexParExpression getParExpression() {
    return findChildByClass(ApexParExpression.class);
  }

  @Override
  @Nullable
  public ApexStatement getStatement() {
    return findChildByClass(ApexStatement.class);
  }

  @Override
  @Nullable
  public ApexTriggerBlockMember getTriggerBlockMember() {
    return findChildByClass(ApexTriggerBlockMember.class);
  }

}
