// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
import com.intellij.navigation.ItemPresentation;

public interface ApexQualifiedName extends ApexNamedElement {

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
