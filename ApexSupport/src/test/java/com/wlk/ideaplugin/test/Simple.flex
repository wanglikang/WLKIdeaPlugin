// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.wlk.ideaplugin.apexsupport.language.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;
import com.intellij.psi.TokenType;

%%

%class ApexLexer
%implements FlexLexer
%public // 使生成的ApexLexer 为public的class
%final  // 使生成的ApexLexer为final的class
//%abstract


// 设置读入文件的编码
%unicode // 或 %16bit
//%7bit
//%full  或 %8bit
//%caseless 或 %ignorecase

%function advance   // 兼容 com.intellij.lexer.FlexLexer 接口中的advance方法，使得兼容到idea的插件系统里
%type IElementType      //应该就是对应 function 所定义的方法都返回值
//%yylexthrow


%line   // 打开行计数，后续可以变量yyline 存取输入的当前行号
%column // 可以使用 yycolumn 来获取当前列号
%char   // 使用 yychar  可以返回读取到的字符个数
%debug
//%standalone

%eof{  return;

%eof}

%{


// 在自测期间，未了避免整体的项目代码报错，mock一下Lexer接口中的方法，开始////////////
//  void yybegin(int state){}
//  int yystate(){return 1;}
  public int getTokenStart(){return 1;}
  public int getTokenEnd(){return 1;}
//  IElementType advance() {return null;}
  public void reset(CharSequence buf, int start, int end, int initialState){return ;}
// 在自测期间，未了避免整体的项目代码报错，mock一下Lexer接口中的方法，开始////////////



//在这之间，可以定义一些java的中间变量，方法
  private static String zzToPrintable(CharSequence str) {
      // jflex 内置的 zzToPrintable 和 yytext 返回的结果不匹配，使用grammar-kit 的插件，会报错
      // 因此才自定义个本方法，兼容一下
      return str.toString();
  }
  // 看看能不能覆盖原来的内容。，，不能覆盖，会生成两个方法，然后就报错了
//   private static String zzToPrintable(String str) {
//      return str;
//   }

	StringBuffer string = new StringBuffer();

	private IElementType symbol(String typeNamw) {
		return ApexTypes.createElementTypeByName(typeNamw, yyline+1, yycolumn+1);
	}

	// 这个方法，以后再用
	private IElementType symbol(String typeNamw, Object value) {
        return ApexTypes.createElementTypeByName(typeNamw, yyline+1, yycolumn+1,value);
	}

	/**
	* assumes correct representation of a long value for
	* specified radix in scanner buffer from <code>start</code>
	* to <code>end</code>
	*/
	private long parseLong(int start, int end, int radix) {
		long result = 0;
		long digit;

		for (int i = start; i < end; i++) {
		  digit  = Character.digit(yycharat(i),radix);
		  result*= radix;
		  result+= digit;
		}

		return result;
	}
%}

// micros 宏定义，不能递归定义，不能循环依赖
// 示例里面自带的宏定义//////////
CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
// 示例里面自带的宏定义//////////

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} |
          {DocumentationComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/*" "*"+ [^/*] ~"*/"

/* identifiers */
Identifier = [:jletter:][:jletterdigit:]*

/* integer literals */
DecIntegerLiteral = 0 | [1-9][0-9]*
DecLongLiteral    = {DecIntegerLiteral} [lL]

HexIntegerLiteral = 0 [xX] 0* {HexDigit} {1,8}
HexLongLiteral    = 0 [xX] 0* {HexDigit} {1,16} [lL]
HexDigit          = [0-9a-fA-F]

OctIntegerLiteral = 0+ [1-3]? {OctDigit} {1,15}
OctLongLiteral    = 0+ 1? {OctDigit} {1,21} [lL]
OctDigit          = [0-7]

/* floating point literals */
FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}? [fF]
DoubleLiteral = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?

FLit1    = [0-9]+ \. [0-9]*
FLit2    = \. [0-9]+
FLit3    = [0-9]+
Exponent = [eE] [+-]? [0-9]+

/* string and character literals */
StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]


%state WAITING_VALUE
%state STRING, CHARLITERAL

%%
// 在 flex里，主要是定义符合正则表达式的词法元素，即token

/* keywords */
// YYINITIAL 是一个预定义 词法状态，代表了词法分析器的初始扫描状态

<YYINITIAL> {

  /* keywords */
  "abstract"                     { return symbol("ABSTRACT"); }
  "boolean"                      { return symbol("BOOLEAN"); }
  "break"                        { return symbol("BREAK"); }
  "byte"                         { return symbol("BYTE"); }
  "case"                         { return symbol("CASE"); }
  "catch"                        { return symbol("CATCH"); }
  "char"                         { return symbol("CHAR"); }
  "class"                        { return symbol("CLASS"); }
  "const"                        { return symbol("CONST"); }
  "continue"                     { return symbol("CONTINUE"); }
  "do"                           { return symbol("DO"); }
  "double"                       { return symbol("DOUBLE"); }
  "else"                         { return symbol("ELSE"); }
  "extends"                      { return symbol("EXTENDS"); }
  "final"                        { return symbol("FINAL"); }
  "finally"                      { return symbol("FINALLY"); }
  "float"                        { return symbol("FLOAT"); }
  "for"                          { return symbol("FOR"); }
  "default"                      { return symbol("DEFAULT"); }
  "implements"                   { return symbol("IMPLEMENTS"); }
  "import"                       { return symbol("IMPORT"); }
  "instanceof"                   { return symbol("INSTANCEOF"); }
  "int"                          { return symbol("INT"); }
  "interface"                    { return symbol("INTERFACE"); }
  "long"                         { return symbol("LONG"); }
  "native"                       { return symbol("NATIVE"); }
  "new"                          { return symbol("NEW"); }
  "goto"                         { return symbol("GOTO"); }
  "if"                           { return symbol("IF"); }
  "public"                       { return symbol("PUBLIC"); }
  "short"                        { return symbol("SHORT"); }
  "super"                        { return symbol("SUPER"); }
  "switch"                       { return symbol("SWITCH"); }
  "synchronized"                 { return symbol("SYNCHRONIZED"); }
  "package"                      { return symbol("PACKAGE"); }
  "private"                      { return symbol("PRIVATE"); }
  "protected"                    { return symbol("PROTECTED"); }
  "transient"                    { return symbol("TRANSIENT"); }
  "return"                       { return symbol("RETURN"); }
  "void"                         { return symbol("VOID"); }
  "static"                       { return symbol("STATIC"); }
  "while"                        { return symbol("WHILE"); }
  "this"                         { return symbol("THIS"); }
  "throw"                        { return symbol("THROW"); }
  "throws"                       { return symbol("THROWS"); }
  "try"                          { return symbol("TRY"); }
  "volatile"                     { return symbol("VOLATILE"); }
  "strictfp"                     { return symbol("STRICTFP"); }

  /* boolean literals */
  "true"                         { return symbol("BOOLEAN_LITERAL", Boolean.valueOf(true)); }
  "false"                        { return symbol("BOOLEAN_LITERAL", Boolean.valueOf(false)); }

  /* null literal */
  "null"                         { return symbol("NULL_LITERAL"); }


  /* separators */
  "("                            { return symbol("LPAREN"); }
  ")"                            { return symbol("RPAREN"); }
  "{"                            { return symbol("LBRACE"); }
  "}"                            { return symbol("RBRACE"); }
  "["                            { return symbol("LBRACK"); }
  "]"                            { return symbol("RBRACK"); }
  ";"                            { return symbol("SEMICOLON"); }
  ","                            { return symbol("COMMA"); }
  "."                            { return symbol("DOT"); }

  /* operators */
  "="                            { return symbol("EQ"); }
  ">"                            { return symbol("GT"); }
  "<"                            { return symbol("LT"); }
  "!"                            { return symbol("NOT"); }
  "~"                            { return symbol("COMP"); }
  "?"                            { return symbol("QUESTION"); }
  ":"                            { return symbol("COLON"); }
  "=="                           { return symbol("EQEQ"); }
  "<="                           { return symbol("LTEQ"); }
  ">="                           { return symbol("GTEQ"); }
  "!="                           { return symbol("NOTEQ"); }
  "&&"                           { return symbol("ANDAND"); }
  "||"                           { return symbol("OROR"); }
  "++"                           { return symbol("PLUSPLUS"); }
  "--"                           { return symbol("MINUSMINUS"); }
  "+"                            { return symbol("PLUS"); }
  "-"                            { return symbol("MINUS"); }
  "*"                            { return symbol("MULT"); }
  "/"                            { return symbol("DIV"); }
  "&"                            { return symbol("AND"); }
  "|"                            { return symbol("OR"); }
  "^"                            { return symbol("XOR"); }
  "%"                            { return symbol("MOD"); }
  "<<"                           { return symbol("LSHIFT"); }
  ">>"                           { return symbol("RSHIFT"); }
  ">>>"                          { return symbol("URSHIFT"); }
  "+="                           { return symbol("PLUSEQ"); }
  "-="                           { return symbol("MINUSEQ"); }
  "*="                           { return symbol("MULTEQ"); }
  "/="                           { return symbol("DIVEQ"); }
  "&="                           { return symbol("ANDEQ"); }
  "|="                           { return symbol("OREQ"); }
  "^="                           { return symbol("XOREQ"); }
  "%="                           { return symbol("MODEQ"); }
  "<<="                          { return symbol("LSHIFTEQ"); }
  ">>="                          { return symbol("RSHIFTEQ"); }
  ">>>="                         { return symbol("URSHIFTEQ"); }

  /* string literal */
  \"                             { yybegin(STRING); string.setLength(0); }

  /* character literal */
  \'                             { yybegin(CHARLITERAL); }

  /* numeric literals */

  {DecIntegerLiteral}            { return symbol("INTEGER_LITERAL", Integer.parseInt(yytext().toString())); }
  {DecLongLiteral}               { return symbol("INTEGER_LITERAL", Long.parseLong(yytext().toString().substring(0,yylength()-1))); }

  {HexIntegerLiteral}            { return symbol("INTEGER_LITERAL", Integer.valueOf((int) parseLong(2, yylength(), 16))); }
  {HexLongLiteral}               { return symbol("INTEGER_LITERAL", Long.valueOf(parseLong(2, yylength()-1, 16))); }

  {OctIntegerLiteral}            { return symbol("INTEGER_LITERAL", Integer.valueOf((int) parseLong(0, yylength(), 8))); }
  {OctLongLiteral}               { return symbol("INTEGER_LITERAL", Long.valueOf((parseLong(0, yylength()-1, 8)))); }

  {FloatLiteral}                 { return symbol("FLOATING_POINT_LITERAL", Float.parseFloat(yytext().toString().substring(0,yylength()-1))); }
  {DoubleLiteral}                { return symbol("FLOATING_POINT_LITERAL", Double.parseDouble(yytext().toString())); }
  {DoubleLiteral}[dD]            { return symbol("FLOATING_POINT_LITERAL", Double.parseDouble((yytext().toString().substring(0,yylength()-1)))); }

  /* comments */
  {Comment}                      { /* ignore */ }

  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }

  /* identifiers */
  {Identifier}                   { return symbol("IDENTIFIER", yytext().toString()); }
}

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return ApexTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return ApexTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return ApexTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return ApexTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
