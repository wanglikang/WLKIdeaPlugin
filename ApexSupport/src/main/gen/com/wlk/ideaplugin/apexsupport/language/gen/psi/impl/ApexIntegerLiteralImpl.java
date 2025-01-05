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

public class ApexIntegerLiteralImpl extends ASTWrapperPsiElement implements ApexIntegerLiteral {

  public ApexIntegerLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitIntegerLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDecIntegerLiteral() {
    return findChildByType(DECINTEGERLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getDecLongLiteral() {
    return findChildByType(DECLONGLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getHexIntegerLiteral() {
    return findChildByType(HEXINTEGERLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getHexLongLiteral() {
    return findChildByType(HEXLONGLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getOctIntegerLiteral() {
    return findChildByType(OCTINTEGERLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getOctLongLiteral() {
    return findChildByType(OCTLONGLITERAL);
  }

}
