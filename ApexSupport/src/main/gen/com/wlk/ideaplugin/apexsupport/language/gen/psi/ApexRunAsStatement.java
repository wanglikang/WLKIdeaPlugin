// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexRunAsStatement extends PsiElement {

  @NotNull
  ApexBlock getBlock();

  @Nullable
  ApexExpressionList getExpressionList();

  @Nullable
  ApexParExpression getParExpression();

  @Nullable
  ApexStatement getStatement();

  @Nullable
  ApexTriggerBlockMember getTriggerBlockMember();

}
