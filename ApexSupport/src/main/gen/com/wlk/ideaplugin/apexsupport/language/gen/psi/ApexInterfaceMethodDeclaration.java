//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexInterfaceMethodDeclaration extends PsiElement {

  @NotNull
  ApexFormalParameters getFormalParameters();

  @Nullable
  ApexQualifiedNameList getQualifiedNameList();

  @Nullable
  ApexType_ getType_();

  @NotNull
  PsiElement getArrayDefine();

  @NotNull
  PsiElement getIdentifier();

}
