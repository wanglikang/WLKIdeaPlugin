// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexWhenValue extends PsiElement {

  @Nullable
  ApexId getId();

  @Nullable
  ApexTypeRef getTypeRef();

  @NotNull
  List<ApexWhenLiteral> getWhenLiteralList();

}
