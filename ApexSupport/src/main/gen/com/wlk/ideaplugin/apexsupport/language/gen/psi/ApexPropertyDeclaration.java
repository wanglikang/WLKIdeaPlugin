// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexPropertyDeclaration extends PsiElement {

  @Nullable
  ApexClassBodyDeclaration getClassBodyDeclaration();

  @NotNull
  ApexId getId();

  @Nullable
  ApexModifier getModifier();

  @NotNull
  List<ApexPropertyBlock> getPropertyBlockList();

  @NotNull
  ApexTypeRef getTypeRef();

}
