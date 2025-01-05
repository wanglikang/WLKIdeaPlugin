//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexLastFormalParameter extends PsiElement {

  @NotNull
  ApexType_ getType_();

  @NotNull
  ApexVariableDeclaratorId getVariableDeclaratorId();

  @NotNull
  List<ApexVariableModifier> getVariableModifierList();

}
