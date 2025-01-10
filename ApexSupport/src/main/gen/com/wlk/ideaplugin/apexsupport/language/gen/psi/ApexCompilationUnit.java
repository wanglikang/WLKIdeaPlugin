// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexCompilationUnit extends PsiElement {

  @NotNull
  List<ApexImportDeclaration> getImportDeclarationList();

  @NotNull
  List<ApexTypeDeclaration> getTypeDeclarationList();

}
