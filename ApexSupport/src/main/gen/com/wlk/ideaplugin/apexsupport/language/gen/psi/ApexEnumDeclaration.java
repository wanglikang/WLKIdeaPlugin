//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexEnumDeclaration extends PsiElement {

  @Nullable
  ApexEnumBodyDeclarations getEnumBodyDeclarations();

  @Nullable
  ApexEnumConstants getEnumConstants();

  @Nullable
  ApexTypeList getTypeList();

  @NotNull
  PsiElement getIdentifier();

}
