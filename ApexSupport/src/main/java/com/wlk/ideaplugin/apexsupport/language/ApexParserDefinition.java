package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.IncorrectOperationException;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
import com.wlk.ideaplugin.apexsupport.language.parser.antlr4.Antlr4PsiElement;
import com.wlk.ideaplugin.apexsupport.language.psi.impl.ApexNamedElementImpl;
import com.wlk.ideaplugin.apexsupport.util.ApexPsiConstants;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApexParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ApexLanguage.INSTANCE);

    public static Map<String, TokenIElementType> tokenName2TokenElementType = new HashMap<>();
    public static  Map<Integer,TokenIElementType> tokenIndex2TokenElementType = new HashMap<>();

    static {
        //需要提前声明一下，避免后续用到lexer的时候，找不到token的定义
        PSIElementTypeFactory.defineLanguageIElementTypes(ApexLanguage.INSTANCE, ApexLexer.tokenNames, ApexParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(ApexLanguage.INSTANCE);
        List<RuleIElementType> ruleIElementTypes = PSIElementTypeFactory.getRuleIElementTypes(ApexLanguage.INSTANCE);

        for (TokenIElementType tokenIElementType : tokenIElementTypes) {
            tokenName2TokenElementType.put(tokenIElementType.getDebugName(), tokenIElementType);
            tokenIndex2TokenElementType.put(tokenIElementType.getANTLRTokenType(), tokenIElementType);
        }
    }

    @NotNull
    @Override
    //创建词法分析器
    public Lexer createLexer(Project project) {
        System.out.println(tokenName2TokenElementType);
//        return new ANTLRLexerAdaptor(ApexLanguage.INSTANCE, new ApexLexer(null));
        return ApexWrapperLexer.getNewInstance();
    }

    @NotNull
    @Override
    // 创建语法解析器
    public PsiParser createParser(final Project project) {
        return new ANTLRParserAdaptor(ApexLanguage.INSTANCE,new ApexParser(null)){
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                long startTime = System.currentTimeMillis();
                ApexParser parser1 = (ApexParser) parser;
                ApexParser.ApexFileContext apexFileContext = parser1.apexFile();
                long endTime = System.currentTimeMillis();
                System.out.println("Parse execution time: " + (endTime - startTime) + "ms");

                return apexFileContext;
            }
        };
    }

    @NotNull
    @Override
    // 注释的token
    public TokenSet getCommentTokens() {
        // 获取注释的token 类型，可以在文法中忽略这些token
        return ApexPsiConstants.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return ApexPsiConstants.STRING;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return ApexPsiConstants.WHITESPACE;
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
        // 这里的node，都是语法层面的 内容，即 parser.g4中定义的语法元素
//        System.out.println("createElement:" + node+",type:"+node.getClass().getSimpleName()+" -> "+node.getElementType().getDebugName() );
//        System.out.println(node.getText());
        IElementType elementType = node.getElementType();
        if(elementType instanceof TokenIElementType tokenIElementType){
            System.out.println();
        }

        if(elementType instanceof TokenIElementType tokenIElementType){
            int antlrTokenType = tokenIElementType.getANTLRTokenType();
            if(antlrTokenType == ApexLexer.Identifier){
//                ASTWrapperPsiElement astWrapperPsiElement = new ASTWrapperPsiElement(node);
                ApexNamedElementImpl apexNamedElement    = new ApexNamedElementImpl(node) {
                    @Override
                    public @Nullable PsiElement getNameIdentifier() {
                        PsiElement psi = node.getPsi();
                        return psi;
                    }

                    @Override
                    public PsiElement setName(@NlsSafe @NotNull String name) throws IncorrectOperationException {
                        return this;
                    }
                };
                return apexNamedElement;
            }
        }
        return new Antlr4PsiElement(node);
    }

}