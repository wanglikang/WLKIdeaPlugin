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

public class ApexStatementImpl extends ASTWrapperPsiElement implements ApexStatement {

  public ApexStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexBlock getBlock() {
    return findChildByClass(ApexBlock.class);
  }

  @Override
  @Nullable
  public ApexBreakStatement getBreakStatement() {
    return findChildByClass(ApexBreakStatement.class);
  }

  @Override
  @Nullable
  public ApexContinueStatement getContinueStatement() {
    return findChildByClass(ApexContinueStatement.class);
  }

  @Override
  @Nullable
  public ApexDeleteStatement getDeleteStatement() {
    return findChildByClass(ApexDeleteStatement.class);
  }

  @Override
  @Nullable
  public ApexDoWhileStatement getDoWhileStatement() {
    return findChildByClass(ApexDoWhileStatement.class);
  }

  @Override
  @Nullable
  public ApexForStatement getForStatement() {
    return findChildByClass(ApexForStatement.class);
  }

  @Override
  @Nullable
  public ApexInsertStatement getInsertStatement() {
    return findChildByClass(ApexInsertStatement.class);
  }

  @Override
  @Nullable
  public ApexMergeStatement getMergeStatement() {
    return findChildByClass(ApexMergeStatement.class);
  }

  @Override
  @Nullable
  public ApexRunAsStatement getRunAsStatement() {
    return findChildByClass(ApexRunAsStatement.class);
  }

  @Override
  @Nullable
  public ApexSwitchStatement getSwitchStatement() {
    return findChildByClass(ApexSwitchStatement.class);
  }

  @Override
  @Nullable
  public ApexThrowStatement getThrowStatement() {
    return findChildByClass(ApexThrowStatement.class);
  }

  @Override
  @Nullable
  public ApexTryStatement getTryStatement() {
    return findChildByClass(ApexTryStatement.class);
  }

  @Override
  @Nullable
  public ApexUndeleteStatement getUndeleteStatement() {
    return findChildByClass(ApexUndeleteStatement.class);
  }

  @Override
  @Nullable
  public ApexUpdateStatement getUpdateStatement() {
    return findChildByClass(ApexUpdateStatement.class);
  }

  @Override
  @Nullable
  public ApexUpsertStatement getUpsertStatement() {
    return findChildByClass(ApexUpsertStatement.class);
  }

  @Override
  @Nullable
  public ApexWhileStatement getWhileStatement() {
    return findChildByClass(ApexWhileStatement.class);
  }

}
