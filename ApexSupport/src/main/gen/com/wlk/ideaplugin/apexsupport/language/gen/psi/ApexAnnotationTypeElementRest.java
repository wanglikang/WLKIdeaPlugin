//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexAnnotationTypeElementRest extends PsiElement {

  @Nullable
  ApexAnnotationMethodOrConstantRest getAnnotationMethodOrConstantRest();

  @Nullable
  ApexAnnotationTypeDeclaration getAnnotationTypeDeclaration();

  @Nullable
  ApexClassDeclaration getClassDeclaration();

  @Nullable
  ApexEnumDeclaration getEnumDeclaration();

  @Nullable
  ApexInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  ApexType_ getType_();

}
