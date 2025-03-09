package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.TokenSet;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;

//Token 都应该定义预定义在这里
public interface ApexTokenSets {

    //标识符  ，用于find usage
    TokenSet IDENTIFIERS = TokenSet.create(ApexTypes.IDENTIFIER);

    TokenSet CLASS = TokenSet.create(ApexTypes.CLASS);

    // 注释 token 类型，可以
    TokenSet COMMENTS = TokenSet.create(
            ApexTypes.LINE_COMMENT,
            ApexTypes.BLOCK_COMMENT,
            ApexTypes.OUTER_BLOCK_DOC_COMMENT,
            ApexTypes.INNER_BLOCK_DOC_COMMENT);


    // 注释 token 类型，可以
    TokenSet STRING_ITERNAL_TOKENS = TokenSet.create(
            ApexTypes.SINGLEQUOTESTRINGLITERAL);

}
