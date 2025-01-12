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

public class ApexCreatorImpl extends ASTWrapperPsiElement implements ApexCreator {

  public ApexCreatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitCreator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexArguments getArguments() {
    return findChildByClass(ApexArguments.class);
  }

  @Override
  @Nullable
  public ApexArrayCreatorRest getArrayCreatorRest() {
    return findChildByClass(ApexArrayCreatorRest.class);
  }

  @Override
  @NotNull
  public ApexCreatedName getCreatedName() {
    return findNotNullChildByClass(ApexCreatedName.class);
  }

  @Override
  @Nullable
  public ApexMapCreatorRest getMapCreatorRest() {
    return findChildByClass(ApexMapCreatorRest.class);
  }

  @Override
  @Nullable
  public ApexSetCreatorRest getSetCreatorRest() {
    return findChildByClass(ApexSetCreatorRest.class);
  }

}
