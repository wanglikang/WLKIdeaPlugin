package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class ApexReferenceContributor extends PsiReferenceContributor {

    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        System.out.println("添加了代码引用的实现类：ApexReferenceContributor");
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression.class),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element,
                                                                           @NotNull ProcessingContext context) {
                        System.out.println("待引用的元素是:"+element.getText());
                        System.out.println("待引用的原始元素是:"+element.getOriginalElement());
                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
                        String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
                            TextRange property = new TextRange(0, value.length() + 1);
                            return new PsiReference[]{new ApexReference(element, property)};
//                        }
                    }
                });
    }

}
