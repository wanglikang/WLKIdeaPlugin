package grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.wlk.ideaplugin.apexsupport.test.language.gen.psi.ApexTypes.*;

%%

%{
  public _TestBnfLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TestBnfLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WS=[ \t\n\x0B\f\r]+

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "FIRST"             { return FIRST; }
  "THRID"             { return THRID; }

  {WS}                { return WS; }

}

[^] { return BAD_CHARACTER; }
