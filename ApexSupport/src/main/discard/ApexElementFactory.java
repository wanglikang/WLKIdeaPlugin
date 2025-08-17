//
//package com.wlk.ideaplugin.apexsupport.language.psi;
//
//import com.intellij.openapi.project.Project;
//import com.intellij.psi.PsiElement;
//import com.intellij.psi.PsiFileFactory;
//import com.wlk.ideaplugin.apexsupport.language.ApexFile;
//import com.wlk.ideaplugin.apexsupport.language.ApexFileType;
//
//public class ApexElementFactory {
//
//    public static ApexNamedElement createProperty(Project project, String name) {
//        final ApexFile file = createFile(project, name);
//        return (ApexNamedElement) file.getFirstChild();
//    }
//
//    private static ApexFile createFile(Project project, String text) {
//        String name = "dummy.cls";
//        return (ApexFile) PsiFileFactory.getInstance(project).createFileFromText(name, ApexFileType.INSTANCE, text);
//    }
//
//    public static ApexNamedElement createProperty(Project project, String name, String value) {
//        final ApexFile file = createFile(project, name + " = " + value);
//        return (ApexNamedElement) file.getFirstChild();
//    }
//
//    public static PsiElement createCRLF(Project project) {
//        final ApexFile file = createFile(project, "\n");
//        return file.getFirstChild();
//    }
//
//}
