package com.wlk.ideaplugin.apexsupport.feature.autoreference;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.wlk.ideaplugin.apexsupport.util.ApexUtil;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ApexReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    ApexReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        System.out.println("ApexReference constructor:"+element.getText()+";"+textRange.toString());
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<ApexNamedElement> properties = ApexUtil.findProperties(project, key);
        List<ResolveResult> results = new ArrayList<>();
        for (ApexNamedElement property : properties) {
            results.add(new PsiElementResolveResult(property));
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
//        List<ApexQualifiedName> properties = ApexUtil.findProperties(project);
        List<LookupElement> variants = new ArrayList<>();
//        for (final ApexQualifiedName namedElement : properties) {
//            if (namedElement.getKey() != null && !namedElement.getKey().isEmpty()) {
//                variants.add(LookupElementBuilder
//                        .create(namedElement).withIcon(ApexIcon.FILE)
//                        .withTypeText(namedElement.getContainingFile().getName())
//                );
//            }
//        }
        return variants.toArray();
    }

}
