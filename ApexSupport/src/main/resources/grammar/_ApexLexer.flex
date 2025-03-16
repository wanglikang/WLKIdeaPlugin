package com.wlk.ideaplugin.apexsupport.language.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.io.BufferedReader;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;

%%

%{
  public _ApexLexer() {
    this((java.io.Reader)null);
  }
%}

%{
  	StringBuilder string = new StringBuilder();
    StringBuilder SOQL_SB = new StringBuilder();

	/**
	* '#+' stride demarking start/end of raw string/byte literal
	*/
	private int zzShaStride = -1;

	/**
	* Dedicated storage for starting position of some previously successful
	* match
	*/
	private int zzPostponedMarkedPos = -1;

	/**
	* Dedicated nested-comment level counter
	*/
	private int zzNestedCommentLevel = 0;

	IElementType imbueBlockComment() {
	    assert(zzNestedCommentLevel == 0);
	    yybegin(YYINITIAL);

	    zzStartRead = zzPostponedMarkedPos;
	    zzPostponedMarkedPos = -1;

	    if (yylength() >= 3) {
	        if (yycharat(2) == '!') {
	            return INNER_BLOCK_DOC_COMMENT;
	        } else if (yycharat(2) == '*' && (yylength() == 3 || yycharat(3) != '*' && yycharat(3) != '/')) {
	            return OUTER_BLOCK_DOC_COMMENT;
	        }
	    }

	    return BLOCK_COMMENT;
	}

      //在这之间，可以定义一些java的中间变量，方法
      private static String zzToPrintable(CharSequence str) {
          // jflex 内置的 zzToPrintable 和 yytext 返回的结果不匹配，使用grammar-kit 的插件，会报错
          // 因此才自定义个本方法，兼容一下
          return str.toString();
      }
%}

%public
%class _ApexLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_]+[a-zA-Z0-9_]*
//SINGLEQUOTESTRINGLITERAL=\'[\w\u4e00-\u9fff][\w\u4e00-\u9fff]+\'
// SINGLEQUOTESTRINGLITERAL 无法简单通过正则定义，需要使用状态进行定义，，这里只是占位一下

DATELITERAL=[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]
TIMELITERAL=[0-9][0-9]:[0-9][0-9]:[0-9][0-9][\.\d+]?[z|[[+-][0-9]+[:\d+]?]]
DATETIMELITERAL=[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]t[0-9][0-9]:[0-9][0-9]:[0-9][0-9][\.\d+]?[z|[[+-][0-9]+[:\d+]?]]
INTEGERLITERALPATTERN=[0-9]+
LONGLITERALPATTERN=[0-9]+[lL]
NUMBERLITERALPATTERN=[0-9]*\.[0-9]+[dD]
//BooleanLiteral=false|true
BOOLEAN_LITERNAL=false|true

WS=[ \t\n\x0B\f\r]
//TRADITIONAL_COMMENT="/"*[^*]~\*"/"|"/"\*\*+"/"
//DOCUMENTATION_COMMENT="/"\*\*([^*]|\*+[^/*])*\*+"/"

//               加了空格的单行注释
/* string and character literals */
StringCharacter = [^\r\n\"\\\']
SingleCharacter = [^\r\n\'\\]
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
LINE_COMMENT = "//" {InputCharacter}* {LineTerminator}?
//LINE_COMMENT="//"[^\r\n\t]*

// 忽略关键字的大小写
%ignorecase
%s IN_BLOCK_COMMENT
%s STRING

// 用于解析SOQL的词法状态
%s SOQL_START_STATUS
%s SOQL_STATUS

// 由于 数组下标和 SOQL都是以 [ 开头的，因此，新加一个状态用以区分
%s ARRAY_INDEX_STATUS

//%s IN_LIFETIME_OR_CHAR
%debug
%%
<YYINITIAL> {
  {WHITE_SPACE}                    { return WHITE_SPACE; }

  "select"                       { return SELECT;}
  "abstract"                       { return ABSTRACT; }
  "after"                          { return AFTER; }
  "before"                         { return BEFORE; }
  "break"                          { return BREAK; }
  "catch"                          { return CATCH; }
  "class"                          { return CLASS; }
  "continue"                       { return CONTINUE; }
  "delete"                         { return DELETE; }
  "do"                             { return DO; }
  "else"                           { return ELSE; }
  "enum"                           { return ENUM; }
  "extends"                        { return EXTENDS; }
  "final"                          { return FINAL; }
  "finally"                        { return FINALLY; }
  "for"                            { return FOR; }
//  "get"                            { return GET; }
  "global"                         { return GLOBAL; }
  "if"                             { return IF; }
  "implements"                     { return IMPLEMENTS; }
  "inherited"                      { return INHERITED; }
  "insert"                         { return INSERT; }
  "instanceof"                     { return INSTANCEOF; }
  "interface"                      { return INTERFACE; }
  "merge"                          { return MERGE; }
  "new"                            { return NEW; }
  "null"                           { return NULL; }
  "on"                             { return ON; }
  "override"                       { return OVERRIDE; }
  "private"                        { return PRIVATE; }
  "protected"                      { return PROTECTED; }
  "public"                         { return PUBLIC; }
  "return"                         { return RETURN; }
  "system.runas"                   { return SYSTEMRUNAS; }
//  "set"                            { return SET; }
  "sharing"                        { return SHARING; }
  "static"                         { return STATIC; }
// "super"                          { return SUPER; }
  "switch"                         { return SWITCH; }
  "testmethod"                     { return TESTMETHOD; }
//  "this"                           { return THIS; }
  "throw"                          { return THROW; }
  "transient"                      { return TRANSIENT; }
  "trigger"                        { return TRIGGER; }
  "try"                            { return TRY; }
  "undelete"                       { return UNDELETE; }
  "update"                         { return UPDATE; }
  "upsert"                         { return UPSERT; }
  "virtual"                        { return VIRTUAL; }
  "void"                           { return VOID; }
  "webservice"                     { return WEBSERVICE; }
  "when"                           { return WHEN; }
  "while"                          { return WHILE; }
  "with"                           { return WITH; }
  "without"                        { return WITHOUT; }
//  "list"                           { return LIST; }
//  "map"                            { return MAP; }

  "("                              { return LPAREN; }
  ")"                              { return RPAREN; }
  "{"                              { return LBRACE; }
  "}"                              { return RBRACE; }
  "["								{ return LBRACK;}
//  "["								{ yybegin(SOQL_START_STATUS);}	            // SOQL 的开始关键词
  "]"								{ return RBRACK; }
  ";"                              { return SEMI; }
  ","                              { return COMMA; }
  "."                              { return DOT; }
  "="                              { return ASSIGN; }
  ">"                              { return GT; }
  "<"                              { return LT; }
  "!"                              { return BANG; }
  "~"                              { return TILDE; }
  "?."                             { return QUESTIONDOT; }
  "?"                              { return QUESTION; }
  ":"                              { return COLON; }
  "=="                             { return EQUAL; }
  "==="                            { return TRIPLEEQUAL; }
  "!="                             { return NOTEQUAL; }
  "<>"                             { return LESSANDGREATER; }
  "!=="                            { return TRIPLENOTEQUAL; }
  "&&"                             { return AND; }
  "||"                             { return OR; }
  "??"                             { return COAL; }
  "++"                             { return INC; }
  "--"                             { return DEC; }
  "+"                              { return ADD; }
  "-"                              { return SUB; }
  "*"                              { return MUL; }
  "/"                              { return DIV; }
  "&"                              { return BITAND; }
  "|"                              { return BITOR; }
  "^"                              { return CARET; }
  "=>"                             { return MAPTO; }
  "+="                             { return ADD_ASSIGN; }
  "-="                             { return SUB_ASSIGN; }
  "*="                             { return MUL_ASSIGN; }
  "/="                             { return DIV_ASSIGN; }
  "&="                             { return AND_ASSIGN; }
  "|="                             { return OR_ASSIGN; }
  "^="                             { return XOR_ASSIGN; }
  "<<="                            { return LSHIFT_ASSIGN; }
  ">>="                            { return RSHIFT_ASSIGN; }
  ">>>="                           { return URSHIFT_ASSIGN; }
  "@"                              { return ATSIGN; }


  {DATELITERAL}                    { return DATELITERAL; }
  {BOOLEAN_LITERNAL}                    { return BOOLEAN_LITERAL; }
  {TIMELITERAL}                    { return TIMELITERAL; }
  {DATETIMELITERAL}                { return DATETIMELITERAL; }
  {INTEGERLITERALPATTERN}          { return INTEGERLITERALPATTERN; }
  {LONGLITERALPATTERN}             { return LONGLITERALPATTERN; }
  {NUMBERLITERALPATTERN}           { return NUMBERLITERALPATTERN; }
  {LINE_COMMENT}                   { return LINE_COMMENT; }
  {WS}                             { return WS; }
  {IDENTIFIER}                     { return IDENTIFIER; }

  "/*"                            { yybegin(IN_BLOCK_COMMENT); yypushback(2); }

  /* string literal */
  \'                             { yybegin(STRING); string.setLength(0); }


//  {TRADITIONAL_COMMENT}            { return TRADITIONAL_COMMENT; }
//  {DOCUMENTATION_COMMENT}          { return DOCUMENTATION_COMMENT; }

}



<STRING> {
  \'                             { yybegin(YYINITIAL);return SINGLEQUOTESTRINGLITERAL;}

  {StringCharacter}+             { string.append( yytext() );}

  /* escape sequences */
  "\\b"                          { string.append( '\b' );}
  "\\t"                          { string.append( '\t' );}
  "\\n"                          { string.append( '\n' );}
  "\\f"							 { string.append( '\f' );}
  "\\r"                          { string.append( '\r' );}
  "\\\""                         { string.append( '\"' );}
  "\\'"                          { string.append( '\'' );}
  "\\\\"                         { string.append( '\\' );}
  // \\[0-3]?{OctDigit}?{OctDigit}  { char val = (char) Integer.parseInt(yytext().substring(1),8);           string.append( val ); }

  /* error cases */
  \\.                            { System.out.println("字符串匹配到了特殊字符:\\. error");throw new RuntimeException("Illegal escape sequence \""+yytext()+"\""); }
  {LineTerminator}               { System.out.println("字符串匹配到了行终结符，error");throw new RuntimeException("Unterminated string at end of line"); }
}


///////////////////////////////////////////////////////////////////////////////////////////////////
// Comments
///////////////////////////////////////////////////////////////////////////////////////////////////
<IN_BLOCK_COMMENT> {
  "/*"    { if (zzNestedCommentLevel++ == 0)
              zzPostponedMarkedPos = zzStartRead;
          }

  "*/"    { if (--zzNestedCommentLevel == 0)
              return imbueBlockComment();
          }

  <<EOF>> { zzNestedCommentLevel = 0; return imbueBlockComment(); }

  [^]     { }
}

//<SOQL_START_STATUS>  {
//	//  需要考虑数组下标的情况
//    {WHITE_SPACE}                    { }
//	"select" 	{ yybegin(SOQL_STATUS);}	// 只有select 开头的，才认为是SOQL语句
//     [^] 		{	yybegin(YYINITIAL); yypushback(yytext().length()); }
//}
//
//<SOQL_STATUS>  {
//	"]" 		{ yybegin(YYINITIAL); return SOQL_LITERAL; }
//	[^]   		{ SOQL_SB.append(yytext());}
//}



[^] { return BAD_CHARACTER; }