//package com.wlk.ideaplugin.apexsupport.language;
//
//import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
//import com.intellij.lang.cacheBuilder.WordsScanner;
//import com.intellij.lang.findUsages.FindUsagesProvider;
//import com.intellij.psi.PsiElement;
//import com.intellij.psi.PsiNamedElement;
//import com.intellij.psi.tree.TokenSet;
//import com.wlk.ideaplugin.apexsupport.language.gen.psi.impl.ApexClassNameImpl;
//import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
//import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenSets;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//public class ApexFindUsagesProvider  implements FindUsagesProvider {
//
//    @Override
//    public WordsScanner getWordsScanner() {
//        return new DefaultWordsScanner(new ApexLexerAdapter(),
//                ApexTokenSets.IDENTIFIERS,
//                ApexTokenSets.COMMENTS,
//                TokenSet.EMPTY);
//    }
//
//    @Override
//    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
//        return psiElement instanceof PsiNamedElement;
//    }
//
//    @Nullable
//    @Override
//    public String getHelpId(@NotNull PsiElement psiElement) {
//        return null;
//    }
//
//    @NotNull
//    @Override
//    public String getType(@NotNull PsiElement element) {
//        if (element instanceof ApexNamedElement) {
//            return "apex name element";
//        }
//        return "";
//    }
//
//    @NotNull
//    @Override
//    public String getDescriptiveName(@NotNull PsiElement element) {
//        System.out.println("getDescriptiveName is:"+element.getText());
//        System.out.println("getDescriptiveName is:"+element.getClass().getName());
//        if (element instanceof ApexClassNameImpl) {
//            return ((ApexClassNameImpl) element).getKey();
//        }
//        return "";
//    }
//
//    @NotNull
//    @Override
//    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
//        if (element instanceof ApexNamedElement) {
//            return ((ApexNamedElement) element).getName() +
//                    ":"+
//                    element.getText();
//        }
//        return "";
//    }
//
//}
