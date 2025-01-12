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

public class ApexBreakStatementImpl extends ASTWrapperPsiElement implements ApexBreakStatement {

  public ApexBreakStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitBreakStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
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
