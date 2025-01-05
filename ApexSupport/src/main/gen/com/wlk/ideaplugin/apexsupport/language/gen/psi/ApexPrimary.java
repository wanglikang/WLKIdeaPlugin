//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexPrimary extends PsiElement {

  @Nullable
  ApexArguments getArguments();

  @Nullable
  ApexExplicitGenericInvocationSuffix getExplicitGenericInvocationSuffix();

  @Nullable
  ApexLiteral getLiteral();

  @Nullable
  ApexNonWildcardTypeArguments getNonWildcardTypeArguments();

  @Nullable
  ApexType_ getType_();

  @Nullable
  PsiElement getIdentifier();

}
