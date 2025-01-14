package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;
import com.wlk.ideaplugin.apexsupport.language.parser.ApexParser;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexFile;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenSets;
import org.jetbrains.annotations.NotNull;

public class ApexParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ApexLanguage.INSTANCE);

    @NotNull
    @Override
    //创建词法分析器
    public Lexer createLexer(Project project) {
        return new ApexLexerAdapter();
    }

    @NotNull
    @Override
    // 注释的token
    public TokenSet getCommentTokens() {
        // 获取注释的token 类型，可以在文法中忽略这些token
        return ApexTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    // 创建语法解析器
    public PsiParser createParser(final Project project) {
        return new ApexParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new ApexFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return ApexTypes.Factory.createElement(node);
    }

}