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
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ApexParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ApexLanguage.INSTANCE);

//    public static TokenIElementType ID;
    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(ApexLanguage.INSTANCE, ApexLexer.tokenNames, ApexParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(ApexLanguage.INSTANCE);
//        ID = tokenIElementTypes.get(JarlLexer.RULE);
    }

    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.COMMENT,ApexLexer.DOC_COMMENT,ApexLexer.LINE_COMMENT);

    public static final TokenSet WHITESPACE = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.WS);

    public static final TokenSet STRING = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.StringLiteral, ApexLexer.NumberLiteral);


    @NotNull
    @Override
    //创建词法分析器
    public Lexer createLexer(Project project) {
        ANTLRLexerAdaptor antlrLexerAdaptor = new ANTLRLexerAdaptor(ApexLanguage.INSTANCE,new ApexLexer(null));
        return antlrLexerAdaptor;
//        return new Antlr4LexerAdapter();
//        return new ApexLexerAdapter();
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
//        System.out.println("ApexParserDefinition.createParser:"+project.getName());
//        return new Antlr4ParserAdapter();
//        return new com.wlk.ideaplugin.apexsupport.language.gen.ApexParser();
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
        System.out.println("ApexParserDefinition.createFile:"+viewProvider.getVirtualFile().getPath());
        return new ApexFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        //TODO 需要修改为antlr4的
        System.out.println("ApexParserDefinition.createElement:"+node.getText());
//        return ApexTypes.Factory.createElement(node);
        return new Antlr4PsiElement(node);
    }

}