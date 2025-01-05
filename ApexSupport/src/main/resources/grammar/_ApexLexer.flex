package com.wlk.ideaplugin.apexsupport.language.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;

%%

%{
  public _ApexLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ApexLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z]+[a-zA-Z0-9]*
KEYWORDIDENTIFIER=(String|Integer)
SPACE=[ \t\n\x0B\f\r]+
STRING=\"[^\"]*\"|'[^']*'
DECINTEGERLITERAL=0|[1-9][0-9]*
DECLONGLITERAL=0|[1-9][0-9]*[lL]
HEXINTEGERLITERAL=0[xX]0*[0-9a-fA-F]{1,8}
HEXLONGLITERAL=0[xX]0*[0-9a-fA-F]{1,16}[lL]
OCTINTEGERLITERAL=0+[1-3]?[0-7]{1,15}
OCTLONGLITERAL=0+1?[0-7]{1,21}[lL]
FLOATLITERAL=([0-9]+\.[0-9]*|\.[0-9]+|[0-9]+)[eE][+-]?[0-9]+?[fF]
DOUBLELITERAL=([0-9]+\.[0-9]*|\.[0-9]+|[0-9]+)[eE][+-]?[0-9]+?
SINGLEQUOTESTRINGLITERAL=\'[a-zA-Z0-9]+\'
WS=[\t\r\n\u000C]+ 
APEXDOC_COMMENT="/"\*\*[\r\n].*?\*"/"
COMMENT="/"\*.*?\*"/"
LINE_COMMENT="//"[^\r\n]*[\r|\n]?

%%
<YYINITIAL> {
  {WHITE_SPACE}                    { return WHITE_SPACE; }

  "("                              { return LPAREN; }
  ")"                              { return RPAREN; }
  ","                              { return COMMA; }
  ":"                              { return COLON; }
  ";"                              { return SEMI; }
  "."                              { return DOT; }
  "{"                              { return LBRACE; }
  "}"                              { return RBRACE; }
  "["                              { return LBRACK; }
  "]"                              { return RBRACK; }
  "="                              { return ASSIGN; }
  ">"                              { return GT; }
  "<"                              { return LT; }
  "!"                              { return BANG; }
  "~"                              { return TILDE; }
  "?"                              { return QUESTION; }
  "=="                             { return EQUAL; }
  "<="                             { return LE; }
  ">="                             { return GE; }
  "!="                             { return NOTEQUAL; }
  "&&"                             { return AND; }
  "||"                             { return OR; }
  "++"                             { return INC; }
  "--"                             { return DEC; }
  "+"                              { return ADD; }
  "-"                              { return SUB; }
  "*"                              { return MUL; }
  "/"                              { return DIV; }
  "&"                              { return BITAND; }
  "|"                              { return BITOR; }
  "^"                              { return CARET; }
  "%"                              { return MOD; }
  "+="                             { return ADD_ASSIGN; }
  "-="                             { return SUB_ASSIGN; }
  "*="                             { return MUL_ASSIGN; }
  "/="                             { return DIV_ASSIGN; }
  "&="                             { return AND_ASSIGN; }
  "|="                             { return OR_ASSIGN; }
  "^="                             { return XOR_ASSIGN; }
  "%="                             { return MOD_ASSIGN; }
  "<<="                            { return LSHIFT_ASSIGN; }
  ">>="                            { return RSHIFT_ASSIGN; }
  ">>>="                           { return URSHIFT_ASSIGN; }
  "=>"                             { return LAMBDA_LIKE; }
  "insert"                         { return DB_INSERT; }
  "upsert"                         { return DB_UPSERT; }
  "update"                         { return DB_UPDATE; }
  "delete"                         { return DB_DELETE; }
  "undelete"                       { return DB_UNDELETE; }
  "new"                            { return NEW; }
  "this"                           { return THIS; }
  "class"                          { return CLASS; }
  "super"                          { return SUPER; }
  "public"                         { return PUBLIC; }
  "protected"                      { return PROTECTED; }
  "private"                        { return PRIVATE; }
  "static"                         { return STATIC; }
  "abstract"                       { return ABSTRACT; }
  "final"                          { return FINAL; }
  "global"                         { return GLOBAL; }
  "webservice"                     { return WEBSERVICE; }
  "override"                       { return OVERRIDE; }
  "virtual"                        { return VIRTUAL; }
  "testmethod"                     { return TESTMETHOD; }
  "with sharing"                   { return APEX_WITH_SHARING; }
  "without sharing"                { return APEX_WITHOUT_SHARING; }
  "if"                             { return IF; }
  "else"                           { return ELSE; }
  "for"                            { return FOR; }
  "while"                          { return WHILE; }
  "do"                             { return DO; }
  "runas"                          { return RUNAS; }
  "try"                            { return TRY; }
  "return"                         { return RETURN; }
  "throw"                          { return THROW; }
  "break"                          { return BREAK; }
  "continue"                       { return CONTINUE; }
  "^/**"                           { return APEXDOC_COMMENT_START; }
  "number"                         { return NUMBER; }

  {IDENTIFIER}                     { return IDENTIFIER; }
  {KEYWORDIDENTIFIER}              { return KEYWORDIDENTIFIER; }
  {SPACE}                          { return SPACE; }
  {STRING}                         { return STRING; }
  {DECINTEGERLITERAL}              { return DECINTEGERLITERAL; }
  {DECLONGLITERAL}                 { return DECLONGLITERAL; }
  {HEXINTEGERLITERAL}              { return HEXINTEGERLITERAL; }
  {HEXLONGLITERAL}                 { return HEXLONGLITERAL; }
  {OCTINTEGERLITERAL}              { return OCTINTEGERLITERAL; }
  {OCTLONGLITERAL}                 { return OCTLONGLITERAL; }
  {FLOATLITERAL}                   { return FLOATLITERAL; }
  {DOUBLELITERAL}                  { return DOUBLELITERAL; }
  {SINGLEQUOTESTRINGLITERAL}       { return SINGLEQUOTESTRINGLITERAL; }
  {WS}                             { return WS; }
  {APEXDOC_COMMENT}                { return APEXDOC_COMMENT; }
  {COMMENT}                        { return COMMENT; }
  {LINE_COMMENT}                   { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
