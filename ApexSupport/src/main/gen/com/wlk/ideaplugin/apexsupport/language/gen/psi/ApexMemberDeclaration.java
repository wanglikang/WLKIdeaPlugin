//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ApexMemberDeclaration extends PsiElement {

  @Nullable
  ApexClassDeclaration getClassDeclaration();

  @Nullable
  ApexFieldDeclaration getFieldDeclaration();

  @Nullable
  ApexMethodDeclaration getMethodDeclaration();

}
