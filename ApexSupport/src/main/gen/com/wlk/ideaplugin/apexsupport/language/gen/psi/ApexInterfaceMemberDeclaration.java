//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexInterfaceMemberDeclaration extends PsiElement {

  @Nullable
  ApexAnnotationTypeDeclaration getAnnotationTypeDeclaration();

  @Nullable
  ApexClassDeclaration getClassDeclaration();

  @Nullable
  ApexConstDeclaration getConstDeclaration();

  @Nullable
  ApexEnumDeclaration getEnumDeclaration();

  @Nullable
  ApexGenericInterfaceMethodDeclaration getGenericInterfaceMethodDeclaration();

  @Nullable
  ApexInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  ApexInterfaceMethodDeclaration getInterfaceMethodDeclaration();

}
