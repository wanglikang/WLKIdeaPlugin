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
%eof{  return;

%eof}

%{
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

%}

// micros 宏定义，不能递归定义，不能循环依赖
CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

// 先自定义一下注释
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*
// 先自定义一下注释

%state WAITING_VALUE

%%
// 在 flex里，主要是定义符合正则表达式的词法元素，即token

/* keywords */
// YYINITIAL 是一个预定义 词法状态，代表了词法分析器的初始扫描状态
<YYINITIAL> "public"          { yybegin(YYINITIAL); return ApexTypes.PUBLIC; }
<YYINITIAL> "without"         { yybegin(YYINITIAL); return ApexTypes.WITHOUT; }
<YYINITIAL> "sharing"         { yybegin(YYINITIAL); return ApexTypes.SHARING; }
<YYINITIAL> "class"           { yybegin(YYINITIAL); return ApexTypes.CLASS; }



<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return ApexTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return ApexTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return ApexTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return ApexTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
