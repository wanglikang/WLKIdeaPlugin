package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApexTokenType extends IElementType {
    int line;
    int column;
    Object value;
    public ApexTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ApexLanguage.INSTANCE);
    }

    public ApexTokenType(@NotNull @NonNls String debugName,int line,int col) {
        super(debugName, ApexLanguage.INSTANCE);
        this.line = line;
        this.column = col;
    }
    public ApexTokenType(@NotNull @NonNls String debugName,int line,int col,Object obj) {
        super(debugName, ApexLanguage.INSTANCE);
        this.line = line;
        this.column = col;
        this.value = obj;
    }
    @Override
    public String toString() {
        return "ApexTokenType." + super.toString();
    }

}
