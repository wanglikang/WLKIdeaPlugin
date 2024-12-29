package com.wlk.ideaplugin.apexsupport.language.psi;

import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.ApexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApexElementType extends IElementType {

    public ApexElementType(@NotNull @NonNls String debugName) {
        super(debugName, ApexLanguage.INSTANCE);
    }

}
