package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;
import org.jetbrains.annotations.NotNull;

public class ApexCompletionContributor extends CompletionContributor {

    ApexCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(ApexTypes.QUALIFIED_NAME),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        System.out.println("ApexCompletionContributor.addCompletions....");
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }

}
