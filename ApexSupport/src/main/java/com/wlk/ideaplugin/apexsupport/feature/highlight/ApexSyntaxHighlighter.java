package com.wlk.ideaplugin.apexsupport.feature.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ApexSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey CLASS = createTextAttributesKey("CLASS", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STATIC = createTextAttributesKey("STATIC", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INSTANCE_METHOD = createTextAttributesKey("INSTANCE_METHOD", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey TYPENAME = createTextAttributesKey("TYPENAME", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey VALUE = createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] STATIC_KEYS = new TextAttributesKey[]{STATIC};
    private static final TextAttributesKey[] INSTANCE_METHOD_KEYS = new TextAttributesKey[]{INSTANCE_METHOD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] CLASS_KEYS = new TextAttributesKey[]{CLASS};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] TYPENAME_KEYS = new TextAttributesKey[]{TYPENAME};

    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    static {
        //需要提前声明一下，避免后续用到lexer的时候，找不到token的定义
        PSIElementTypeFactory.defineLanguageIElementTypes(ApexLanguage.INSTANCE, ApexLexer.tokenNames, ApexParser.ruleNames);
    }
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ANTLRLexerAdaptor(ApexLanguage.INSTANCE,new ApexLexer(null));
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
//        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
//            return BAD_CHAR_KEYS;
//        }
        int antlrTokenType = ((TokenIElementType) tokenType).getANTLRTokenType();
        List<TokenIElementType> tokenIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(ApexLanguage.INSTANCE);
        for (TokenIElementType tokenIElementType : tokenIElementTypes) {
            int tokenIndex = tokenIElementType.getANTLRTokenType();
            if( antlrTokenType != tokenIndex){
                continue;
            }

            System.out.println("高亮:"+tokenIElementType);

            switch (tokenIndex){
//                case ApexParser.RULE_classBody:  return  CLASS_KEYS;
                case ApexLexer.STATIC,ApexLexer.PUBLIC,ApexLexer.VOID:  return  KEYWORD_KEYS;
//                case ApexLexer.RULE_modifier:  return  STATIC_KEYS;
                case ApexLexer.Identifier:  return  IDENTIFIER_KEYS;
                case ApexLexer.COMMENT,
                     ApexLexer.DOC_COMMENT,
                     ApexLexer.LINE_COMMENT:  return  COMMENT_KEYS;
                default:  break;
            }
        }
        return EMPTY_KEYS;

    }

}
