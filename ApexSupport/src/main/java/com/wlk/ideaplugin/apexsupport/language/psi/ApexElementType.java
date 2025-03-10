package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApexElementType extends IElementType {

    int line;
    int column;
    Object value;
    public ApexElementType(@NotNull @NonNls String debugName) {
        super(debugName, ApexLanguage.INSTANCE);
    }

    public ApexElementType(@NotNull @NonNls String debugName,int line,int col) {
        super(debugName, ApexLanguage.INSTANCE);
        this.line = line;
        this.column = col;
    }
    public ApexElementType(@NotNull @NonNls String debugName,int line,int col,Object obj) {
        super(debugName, ApexLanguage.INSTANCE);
        this.line = line;
        this.column = col;
        this.value = obj;
    }

}
