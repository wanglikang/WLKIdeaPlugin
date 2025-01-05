//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexClassBodyDeclaration extends PsiElement {

  @Nullable
  ApexBlock getBlock();

  @Nullable
  ApexMemberDeclaration getMemberDeclaration();

  @NotNull
  List<ApexModifier> getModifierList();

}
