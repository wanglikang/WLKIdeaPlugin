// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexInterfaceMethodDeclaration extends PsiElement {

  @NotNull
  ApexFormalParameters getFormalParameters();

  @NotNull
  ApexId getId();

  @NotNull
  List<ApexModifier> getModifierList();

  @Nullable
  ApexTypeRef getTypeRef();

}
