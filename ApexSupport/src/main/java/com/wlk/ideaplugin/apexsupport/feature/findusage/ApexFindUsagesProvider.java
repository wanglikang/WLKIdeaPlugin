package com.wlk.ideaplugin.apexsupport.feature.findusage;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.wlk.ideaplugin.apexsupport.language.ApexWrapperLexer;
import com.wlk.ideaplugin.apexsupport.util.ApexPsiConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ApexFindUsagesProvider  implements FindUsagesProvider {

    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(
                ApexWrapperLexer.getNewInstance(),
//                new ANTLRLexerAdaptor(ApexLanguage.INSTANCE, new ApexLexer(null)),
                ApexPsiConstants.IDENTIFIERS,
                ApexPsiConstants.COMMENTS,
                ApexPsiConstants.LITERALS);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
//        return psiElement instanceof PsiNamedElement;
        return true;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        String text = element.getText();
        return "getType:"+text.toUpperCase();
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        System.out.println("getDescriptiveName is:"+element.getText());
        System.out.println("getDescriptiveName is:"+element.getClass().getName());
        return "getDescriptiveName:"+element.getText();
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        String text = element.getText();
        return "getNodeText:"+text;
    }

}
