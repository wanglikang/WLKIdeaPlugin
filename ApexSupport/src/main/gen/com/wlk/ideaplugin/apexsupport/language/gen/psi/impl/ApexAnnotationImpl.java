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

public class ApexAnnotationImpl extends ASTWrapperPsiElement implements ApexAnnotation {

  public ApexAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexAnnotationName getAnnotationName() {
    return findNotNullChildByClass(ApexAnnotationName.class);
  }

  @Override
  @Nullable
  public ApexElementValue getElementValue() {
    return findChildByClass(ApexElementValue.class);
  }

  @Override
  @Nullable
  public ApexElementValuePairs getElementValuePairs() {
    return findChildByClass(ApexElementValuePairs.class);
  }

}
