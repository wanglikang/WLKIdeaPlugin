//// This is a generated file. Not intended for manual editing.
//package com.wlk.ideaplugin.apexsupport.language;
//
//import org.jetbrains.annotations.*;
//import com.intellij.lang.ASTNode;
//import com.intellij.psi.PsiElement;
//import com.intellij.psi.PsiElementVisitor;
//import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexNamedElementImpl;
//import com.wlk.ideaplugin.apexsupport.language.gen.psi.*;
//import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexPsiImplUtil;
//import com.intellij.navigation.ItemPresentation;
//
//public class ApexCommonNamedElementImpl extends ApexNamedElementImpl implements ApexQualifiedName {
//
//  public ApexCommonNamedElementImpl(@NotNull ASTNode node) {
//    super(node);
//  }
//
//  public void accept(@NotNull ApexVisitor visitor) {
//    visitor.visitQualifiedName(this);
//  }
//
//  @Override
//  public void accept(@NotNull PsiElementVisitor visitor) {
//    if (visitor instanceof ApexVisitor) accept((ApexVisitor)visitor);
//    else super.accept(visitor);
//  }
//
//  @Override
//  public String getKey() {
//    return ApexPsiImplUtil.getKey(this);
//  }
//
//  @Override
//  public String getValue() {
//    return ApexPsiImplUtil.getValue(this);
//  }
//
//  @Override
//  public String getName() {
//    return ApexPsiImplUtil.getName(this);
//  }
//
//  @Override
//  public PsiElement setName(String newName) {
//    return ApexPsiImplUtil.setName(this, newName);
//  }
//
//  @Override
//  public PsiElement getNameIdentifier() {
//    return ApexPsiImplUtil.getNameIdentifier(this);
//  }
//
//  @Override
//  public ItemPresentation getPresentation() {
//    return ApexPsiImplUtil.getPresentation(this);
//  }
//
//}
