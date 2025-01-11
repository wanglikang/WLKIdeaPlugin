package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.TokenSet;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;

//Token 都应该定义预定义在这里
public interface ApexTokenSets {

    //标识符  ，用于find usage
    TokenSet IDENTIFIERS = TokenSet.create(ApexTypes.IDENTIFIER);

    TokenSet CLASS = TokenSet.create(ApexTypes.CLASS);

    TokenSet COMMENTS = TokenSet.create(ApexTypes.COMMENT);

}
