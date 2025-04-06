package com.wlk.ideaplugin.apexsupport.feature.fold;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiRecursiveElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ApexFoldingBuilder extends FoldingBuilderEx implements DumbAware {

    public static String MethodBlockKey = "SomeThingsBody";
    public static String SIMPLE_SEPARATOR_STR = ":";

    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root,
                                                          @NotNull Document document,
                                                          boolean quick) {
        // 传进来的root，是文件的最顶级的psi元素

        // Initialize the group of folding regions that will expand/collapse together.
        FoldingGroup group = FoldingGroup.newGroup(MethodBlockKey);
        // Initialize the list of folding regions
        List<FoldingDescriptor> descriptors = new ArrayList<>();
        System.out.println("buildFoldRegions:"+root.getOriginalElement()+" => "+root.getText());
        PsiRecursiveElementVisitor psiRecursiveElementVisitor = new PsiRecursiveElementVisitor() {
            @Override
            public void visitElement(@NotNull PsiElement element) {
                super.visitElement(element);
//                if(element instanceof  FoldAble block){
//                    System.out.println("visited block:"+block.getText());
//                    TextRange textRange = block.getTextRange();
//                    descriptors.add(new FoldingDescriptor(block.getNode(),textRange, group, Sets.newHashSet()));
//
//                    Class<? extends PsiElement> aClass = element.getOriginalElement().getClass();
////                    Notification notification = new Notification("ApexNotification", "代码块"+ aClass.getSimpleName() +"折叠", "折叠了："+block.getText(), NotificationType.INFORMATION);
////                    Notifications.Bus.notify(notification);
//                }
            }
        };

        root.accept(psiRecursiveElementVisitor);
        return descriptors.toArray(FoldingDescriptor.EMPTY_ARRAY);
    }



    /**
     * Gets the Simple Language 'value' string corresponding to the 'key'
     *
     * @param node Node corresponding to PsiLiteralExpression containing a string in the format
     *             SIMPLE_PREFIX_STR + SIMPLE_SEPARATOR_STR + Key, where Key is
     *             defined by the Simple language file.
     */
    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
//        if (node.getPsi() instanceof ApexBlock apexBlock) {
//            return "{...}";
//        }

        return null;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }

}
