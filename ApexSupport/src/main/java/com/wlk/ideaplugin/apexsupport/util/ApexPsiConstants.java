package com.wlk.ideaplugin.apexsupport.util;

import com.google.common.collect.Sets;
import com.intellij.psi.tree.TokenSet;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexLexer;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;

import java.util.Set;

public class ApexPsiConstants {

    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.COMMENT,ApexLexer.DOC_COMMENT,ApexLexer.LINE_COMMENT);

    public static final Set<Integer> NamedElementType = Sets.newHashSet(ApexLexer.TESTMETHOD);

    public static final TokenSet WHITESPACE = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.WS);
    public static final TokenSet IDENTIFIERS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE, ApexLexer.Identifier);
    public static final TokenSet KEY_WORDS = PSIElementTypeFactory.createTokenSet(ApexLanguage.INSTANCE,
            ApexLexer.ABSTRACT, ApexLexer.AFTER,
            ApexLexer.BEFORE, ApexLexer.BREAK,
            ApexLexer.CATCH, ApexLexer.CLASS,
            ApexLexer.CONTINUE, ApexLexer.DELETE,
            ApexLexer.DO, ApexLexer.ELSE,
            ApexLexer.ENUM, ApexLexer.EXTENDS,
            ApexLexer.FINAL, ApexLexer.FINALLY,
            ApexLexer.FOR, ApexLexer.GET,
            ApexLexer.GLOBAL, ApexLexer.IF,
            ApexLexer.IMPLEMENTS, ApexLexer.INHERITED,
            ApexLexer.INSERT, ApexLexer.INSTANCEOF,
            ApexLexer.INTERFACE, ApexLexer.MERGE,
            ApexLexer.NEW, ApexLexer.NULL, ApexLexer.ON,
            ApexLexer.OVERRIDE, ApexLexer.PRIVATE,
            ApexLexer.PROTECTED, ApexLexer.PUBLIC,
            ApexLexer.RETURN,
            ApexLexer.SYSTEMRUNAS,
            ApexLexer.SHARING,
            ApexLexer.STATIC,
            ApexLexer.SUPER,ApexLexer.THIS,
            ApexLexer.SWITCH,
            ApexLexer.TESTMETHOD,

            ApexLexer.THROW,
            ApexLexer.TRANSIENT,
            ApexLexer.TRIGGER,
            ApexLexer.TRY,
            ApexLexer.UNDELETE,
            ApexLexer.UPDATE,
            ApexLexer.UPSERT,
            ApexLexer.VIRTUAL,
            ApexLexer.VOID,
            ApexLexer.WEBSERVICE,
            ApexLexer.WHEN,
            ApexLexer.WHILE,
            ApexLexer.WITH, ApexLexer.WITHOUT,
            ApexLexer.LIST, ApexLexer.SET, ApexLexer.MAP
    );

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



}
