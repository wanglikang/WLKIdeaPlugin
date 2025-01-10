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

public class ApexClassDeclarationImpl extends ASTWrapperPsiElement implements ApexClassDeclaration {

  public ApexClassDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitClassDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexClassBody getClassBody() {
    return findNotNullChildByClass(ApexClassBody.class);
  }

  @Override
  @Nullable
  public ApexClassDeclaration getClassDeclaration() {
    return findChildByClass(ApexClassDeclaration.class);
  }

  @Override
  @NotNull
  public ApexClassName getClassName() {
    return findNotNullChildByClass(ApexClassName.class);
  }

  @Override
  @Nullable
  public ApexClassOrInterfaceModifier getClassOrInterfaceModifier() {
    return findChildByClass(ApexClassOrInterfaceModifier.class);
  }

  @Override
  @Nullable
  public ApexImportDeclaration getImportDeclaration() {
    return findChildByClass(ApexImportDeclaration.class);
  }

  @Override
  @Nullable
  public ApexTypeDeclaration getTypeDeclaration() {
    return findChildByClass(ApexTypeDeclaration.class);
  }

  @Override
  @Nullable
  public ApexTypeList getTypeList() {
    return findChildByClass(ApexTypeList.class);
  }

  @Override
  @Nullable
  public ApexTypeParameters getTypeParameters() {
    return findChildByClass(ApexTypeParameters.class);
  }

  @Override
  @Nullable
  public ApexType_ getType_() {
    return findChildByClass(ApexType_.class);
  }

}
