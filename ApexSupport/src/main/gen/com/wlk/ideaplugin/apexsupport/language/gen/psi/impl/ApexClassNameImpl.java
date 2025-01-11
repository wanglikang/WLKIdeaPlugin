// This is a generated file. Not intended for manual editing.
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
import com.intellij.navigation.ItemPresentation;

public class ApexClassNameImpl extends ApexCommonNamedElementImpl implements ApexClassName {

  public ApexClassNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitClassName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  public String getKey() {
    return ApexPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return ApexPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return ApexPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return ApexPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return ApexPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return ApexPsiImplUtil.getPresentation(this);
  }

}
