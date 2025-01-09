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

public class ApexAnnotationTypeElementRestImpl extends ASTWrapperPsiElement implements ApexAnnotationTypeElementRest {

  public ApexAnnotationTypeElementRestImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApexVisitor visitor) {
    visitor.visitAnnotationTypeElementRest(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApexAnnotationMethodOrConstantRest getAnnotationMethodOrConstantRest() {
    return findChildByClass(ApexAnnotationMethodOrConstantRest.class);
  }

  @Override
  @Nullable
  public ApexAnnotationTypeDeclaration getAnnotationTypeDeclaration() {
    return findChildByClass(ApexAnnotationTypeDeclaration.class);
  }

  @Override
  @Nullable
  public ApexClassDeclaration getClassDeclaration() {
    return findChildByClass(ApexClassDeclaration.class);
  }

  @Override
  @Nullable
  public ApexEnumDeclaration getEnumDeclaration() {
    return findChildByClass(ApexEnumDeclaration.class);
  }

  @Override
  @Nullable
  public ApexInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(ApexInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public ApexType_ getType_() {
    return findChildByClass(ApexType_.class);
  }

}
