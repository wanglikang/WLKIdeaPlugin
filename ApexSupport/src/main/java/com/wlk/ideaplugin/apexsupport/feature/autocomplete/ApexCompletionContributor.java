package com.wlk.ideaplugin.apexsupport.feature.autocomplete;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.wlk.ideaplugin.apexsupport.language.ApexParserDefinition;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

public class ApexCompletionContributor extends CompletionContributor {

    ApexCompletionContributor() {

        TokenIElementType tokenIElementType = ApexParserDefinition.tokenIndex2TokenElementType.get(ApexLexer.Identifier);
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(tokenIElementType),
                //  这里的psiElement 应该是最底层的标识符那种的element
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
