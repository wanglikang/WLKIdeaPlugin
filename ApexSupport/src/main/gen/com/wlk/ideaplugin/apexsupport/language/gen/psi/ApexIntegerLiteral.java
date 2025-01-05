//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexIntegerLiteral extends PsiElement {

  @Nullable
  PsiElement getDecIntegerLiteral();

  @Nullable
  PsiElement getDecLongLiteral();

  @Nullable
  PsiElement getHexIntegerLiteral();

  @Nullable
  PsiElement getHexLongLiteral();

  @Nullable
  PsiElement getOctIntegerLiteral();

  @Nullable
  PsiElement getOctLongLiteral();

}
