//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexCompilationUnit extends PsiElement {

  @NotNull
  List<ApexImportDeclaration> getImportDeclarationList();

  @Nullable
  ApexPackageDeclaration getPackageDeclaration();

  @NotNull
  List<ApexTypeDeclaration> getTypeDeclarationList();

}
