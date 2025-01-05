//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexStatement extends PsiElement {

  @Nullable
  ApexApexDbExpression getApexDbExpression();

  @Nullable
  ApexBlock getBlock();

  @Nullable
  ApexStatement getStatement();

  @Nullable
  ApexStatementExpression getStatementExpression();

  @Nullable
  PsiElement getIdentifier();

}
