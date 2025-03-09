package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lexer.FlexAdapter;
import com.wlk.ideaplugin.apexsupport.language.parser._ApexLexer;


public class ApexLexerAdapter extends FlexAdapter {

    public ApexLexerAdapter() {
        super(new _ApexLexer(null));
    }

}
