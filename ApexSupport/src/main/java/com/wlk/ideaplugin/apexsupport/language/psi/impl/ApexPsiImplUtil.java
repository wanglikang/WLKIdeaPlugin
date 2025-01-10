package com.wlk.ideaplugin.apexsupport.language.psi.impl;


import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexQualifiedName;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexElementFactory;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ApexPsiImplUtil {
//
    public static String getKey(ApexQualifiedName element) {

        ASTNode keyNode = element.getNode().findChildByType(ApexTypes.QUALIFIED_NAME);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to Apex spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(ApexQualifiedName element) {
        ASTNode valueNode = element.getNode().findChildByType(ApexTypes.QUALIFIED_NAME);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
//
    public static String getName(ApexQualifiedName element) {
        return getKey(element);
    }
    public static PsiElement setName(ApexQualifiedName element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(ApexTypes.QUALIFIED_NAME);
        if (keyNode != null) {
            ApexNamedElement property = ApexElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }
    public static PsiElement getNameIdentifier(ApexNamedElement element) {
        ASTNode keyNode = element.getNode().findChildByType(ApexTypes.QUALIFIED_NAME);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final ApexQualifiedName element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return element.getIcon(0);
            }
        };
    }
}
