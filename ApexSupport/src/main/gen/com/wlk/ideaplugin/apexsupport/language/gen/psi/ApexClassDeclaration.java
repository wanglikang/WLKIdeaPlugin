//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexClassDeclaration extends PsiElement {

  @NotNull
  ApexClassBody getClassBody();

  @Nullable
  ApexTypeList getTypeList();

  @Nullable
  ApexTypeParameters getTypeParameters();

  @Nullable
  ApexType_ getType_();

  @NotNull
  PsiElement getIdentifier();

}
