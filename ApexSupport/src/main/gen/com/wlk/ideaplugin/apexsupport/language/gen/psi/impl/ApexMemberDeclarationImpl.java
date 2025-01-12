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

public class ApexMemberDeclarationImpl extends ASTWrapperPsiElement implements ApexMemberDeclaration {

  public ApexMemberDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitMemberDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexConstructorDeclaration getConstructorDeclaration() {
    return findChildByClass(ApexConstructorDeclaration.class);
  }

  @Override
  @Nullable
  public ApexEnumDeclaration getEnumDeclaration() {
    return findChildByClass(ApexEnumDeclaration.class);
  }

  @Override
  @Nullable
  public ApexFieldDeclaration getFieldDeclaration() {
    return findChildByClass(ApexFieldDeclaration.class);
  }

  @Override
  @Nullable
  public ApexInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(ApexInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public ApexPropertyDeclaration getPropertyDeclaration() {
    return findChildByClass(ApexPropertyDeclaration.class);
  }

}
