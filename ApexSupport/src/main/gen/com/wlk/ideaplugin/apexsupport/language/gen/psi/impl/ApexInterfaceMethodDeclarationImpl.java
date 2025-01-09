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

public class ApexInterfaceMethodDeclarationImpl extends ASTWrapperPsiElement implements ApexInterfaceMethodDeclaration {

  public ApexInterfaceMethodDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitInterfaceMethodDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexFormalParameters getFormalParameters() {
    return findNotNullChildByClass(ApexFormalParameters.class);
  }

  @Override
  @Nullable
  public ApexQualifiedNameList getQualifiedNameList() {
    return findChildByClass(ApexQualifiedNameList.class);
  }

  @Override
  @Nullable
  public ApexType_ getType_() {
    return findChildByClass(ApexType_.class);
  }

  @Override
  @NotNull
  public PsiElement getArrayDefine() {
    return findNotNullChildByType(ARRAY_DEFINE);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
