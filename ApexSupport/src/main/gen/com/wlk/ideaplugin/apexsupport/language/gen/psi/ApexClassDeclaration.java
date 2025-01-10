// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexClassDeclaration extends PsiElement {

  @NotNull
  ApexClassBody getClassBody();

  @Nullable
  ApexClassDeclaration getClassDeclaration();

  @NotNull
  ApexClassName getClassName();

  @Nullable
  ApexClassOrInterfaceModifier getClassOrInterfaceModifier();

  @Nullable
  ApexImportDeclaration getImportDeclaration();

  @Nullable
  ApexTypeDeclaration getTypeDeclaration();

  @Nullable
  ApexTypeList getTypeList();

  @Nullable
  ApexTypeParameters getTypeParameters();

  @Nullable
  ApexType_ getType_();

}
