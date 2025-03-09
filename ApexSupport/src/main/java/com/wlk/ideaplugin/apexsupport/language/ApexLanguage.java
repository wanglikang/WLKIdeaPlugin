package com.wlk.ideaplugin.apexsupport.language;

import com.intellij.lang.Language;

public class ApexLanguage extends Language {

    public static final ApexLanguage INSTANCE = new ApexLanguage();

    private ApexLanguage() {
        super("Apex");
    }


    @Override
    public boolean isCaseSensitive() {
        return false;
    }
}
