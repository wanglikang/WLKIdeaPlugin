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

public class ApexConstructorDeclarationImpl extends ASTWrapperPsiElement implements ApexConstructorDeclaration {

  public ApexConstructorDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitConstructorDeclaration(this);
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
  public ApexClassBodyDeclaration getClassBodyDeclaration() {
    return findChildByClass(ApexClassBodyDeclaration.class);
  }

  @Override
  @NotNull
  public ApexFormalParameters getFormalParameters() {
    return findNotNullChildByClass(ApexFormalParameters.class);
  }

  @Override
  @Nullable
  public ApexModifier getModifier() {
    return findChildByClass(ApexModifier.class);
  }

  @Override
  @NotNull
  public ApexQualifiedName getQualifiedName() {
    return findNotNullChildByClass(ApexQualifiedName.class);
  }

}
