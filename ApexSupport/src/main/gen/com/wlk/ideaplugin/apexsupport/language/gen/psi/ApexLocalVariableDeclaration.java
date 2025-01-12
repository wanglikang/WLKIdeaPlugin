// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexLocalVariableDeclaration extends PsiElement {

  @NotNull
  List<ApexModifier> getModifierList();

  @NotNull
  ApexTypeRef getTypeRef();

  @NotNull
  ApexVariableDeclarators getVariableDeclarators();

}
