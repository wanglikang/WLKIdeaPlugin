package com.wlk.ideaplugin.apexsupport.util;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
//import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexQualifiedName;
import com.wlk.ideaplugin.apexsupport.language.ApexFileType;
import com.wlk.ideaplugin.apexsupport.language.ApexFile;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexNamedElement;
import org.jetbrains.annotations.NotNull;

import java.util.*;

@Deprecated
public class ApexUtil {

    /**
     * Searches the entire project for Simple language files with instances of the Simple property with the given key.
     *
     * @param project current project
     * @param key     to check
     * @return matching properties
     */
    public static List<ApexNamedElement> findProperties(Project project, String key) {
        List<ApexNamedElement> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(ApexFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            ApexFile apexFile = (ApexFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (apexFile != null) {
                ApexNamedElement[] properties = PsiTreeUtil.getChildrenOfType(apexFile, ApexNamedElement.class);
                if (properties != null) {
                    for (ApexNamedElement property : properties) {
                        if (key.equals(property.getName())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

//    public static List<ApexQualifiedName> findProperties(Project project) {
//        List<ApexQualifiedName> result = new ArrayList<>();
//        Collection<VirtualFile> virtualFiles =
//                FileTypeIndex.getFiles(ApexFileType.INSTANCE, GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            ApexFile apexFile = (ApexFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (apexFile != null) {
//                ApexQualifiedName[] properties = PsiTreeUtil.getChildrenOfType(apexFile, ApexQualifiedName.class);
//                if (properties != null) {
//                    Collections.addAll(result, properties);
//                }
//            }
//        }
//        return result;
//    }

    /**
     * Attempts to collect any comment elements above the Simple key/value pair.
     */
    public static @NotNull String findDocumentationComment(ApexNamedElement property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String commentText = element.getText().replaceFirst("[!# ]+", "");
                result.add(commentText);
            }
            element = element.getPrevSibling();
        }
        return StringUtil.join(Lists.reverse(result), "\n ");
    }

}
