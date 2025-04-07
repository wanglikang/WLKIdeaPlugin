package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
import com.wlk.ideaplugin.apexsupport.language.parser.antlr4.Antlr4PsiElement;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexFile;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ApexParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ApexLanguage.INSTANCE);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(ApexLanguage.INSTANCE, ApexLexer.tokenNames, ApexParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(ApexLanguage.INSTANCE);
        List<RuleIElementType> ruleIElementTypes = PSIElementTypeFactory.getRuleIElementTypes(ApexLanguage.INSTANCE);
    }

    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.COMMENT,ApexLexer.DOC_COMMENT,ApexLexer.LINE_COMMENT);

    public static final TokenSet WHITESPACE = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.WS);
    public static final TokenSet IDENTIFIERS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.Identifier);

    public static final TokenSet STRING = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE,
            ApexLexer.StringLiteral,
            ApexLexer.NumberLiteral);

    public static final TokenSet LITERALS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE,
            ApexLexer.StringLiteral,
            ApexLexer.TimeLiteral,
            ApexLexer.DateTimeLiteral,
            ApexLexer.LongLiteral,
            ApexLexer.BooleanLiteral,
            ApexLexer.IntegerLiteral,
            ApexLexer.NumberLiteral);


    @NotNull
    @Override
    //创建词法分析器
    public Lexer createLexer(Project project) {
        ANTLRLexerAdaptor antlrLexerAdaptor = new ANTLRLexerAdaptor(ApexLanguage.INSTANCE,new ApexLexer(null));
        return antlrLexerAdaptor;
    }

    @NotNull
    @Override
    // 创建语法解析器
    public PsiParser createParser(final Project project) {
        ANTLRParserAdaptor antlrParserAdaptor = new ANTLRParserAdaptor(ApexLanguage.INSTANCE,new ApexParser(null)){
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                ApexParser parser1 = (ApexParser) parser;
                return parser1.apexFile();
            }
        };
        return antlrParserAdaptor;
    }



    @NotNull
    @Override
    // 注释的token
    public TokenSet getCommentTokens() {
        // 获取注释的token 类型，可以在文法中忽略这些token
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return WHITESPACE;
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
        return new Antlr4PsiElement(node);
    }

}