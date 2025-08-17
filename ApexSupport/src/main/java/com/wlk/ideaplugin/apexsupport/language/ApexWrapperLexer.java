package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lexer.LexerBase;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 包装一下，用于返回lexer实例，避免每次都手动new ，还得写static的代码
public class ApexWrapperLexer {
    public static Map<String,TokenIElementType> tokenName2TokenElementType = new HashMap<>();
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
    public static LexerBase getNewInstance(){
        return new ANTLRLexerAdaptor(ApexLanguage.INSTANCE, new ApexLexer(null)){

        };
    }
}
