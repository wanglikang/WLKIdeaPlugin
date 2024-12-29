package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApexTokenType extends IElementType {

    public ApexTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ApexLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ApexTokenType." + super.toString();
    }

}
