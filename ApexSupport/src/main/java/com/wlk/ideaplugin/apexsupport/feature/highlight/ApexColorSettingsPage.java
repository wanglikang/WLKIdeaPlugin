//package com.wlk.ideaplugin.apexsupport.feature.highlight;
//
//import com.intellij.openapi.editor.colors.TextAttributesKey;
//import com.intellij.openapi.fileTypes.SyntaxHighlighter;
//import com.intellij.openapi.options.colors.AttributesDescriptor;
//import com.intellij.openapi.options.colors.ColorDescriptor;
//import com.intellij.openapi.options.colors.ColorSettingsPage;
//import com.wlk.ideaplugin.apexsupport.language.ApexIcon;
//
//import javax.swing.*;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.Map;
//
//final class ApexColorSettingsPage implements ColorSettingsPage {
//
//    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
//            new AttributesDescriptor("CLASS", ApexSyntaxHighlighter.CLASS),
//            new AttributesDescriptor("Separator", ApexSyntaxHighlighter.SEPARATOR),
//            new AttributesDescriptor("Value", ApexSyntaxHighlighter.VALUE),
//            new AttributesDescriptor("Bad value", ApexSyntaxHighlighter.BAD_CHARACTER),
//            new AttributesDescriptor("Identifier", ApexSyntaxHighlighter.IDENTIFIER),
//            new AttributesDescriptor("Method", ApexSyntaxHighlighter.INSTANCE_METHOD),
//            new AttributesDescriptor("TypeName", ApexSyntaxHighlighter.TYPENAME),
//    };
//
//    @Override
//    public Icon getIcon() {
//        return ApexIcon.FILE;
//    }
//
//    @NotNull
//    @Override
//    public SyntaxHighlighter getHighlighter() {
//        return new ApexSyntaxHighlighter();
//    }
//
//    @NotNull
//    @Override
//    public String getDemoText() {
//        return """
//            public class UserOtherClass {
//                // 2023/8/1: 合并为【公海】
//                private final static String INDIVIDUAL_POOL_NAME = '个人客户公海';
//                public static Boolean isIndividualPoolUser(Id userId) {
//                    return getIndividualPoolUser().Id == userId;
//                }
//                public String key ;
//                UserOtherClass(String k){
//                    this.key = k;
//                }
//            }
//        """;
//    }
//
//    @Nullable
//    @Override
//    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
//        return null;
//    }
//
//    @Override
//    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
//        return DESCRIPTORS;
//    }
//
//    @Override
//    public ColorDescriptor @NotNull [] getColorDescriptors() {
//        return ColorDescriptor.EMPTY_ARRAY;
//    }
//
//    @NotNull
//    @Override
//    public String getDisplayName() {
//        return "Apex";
//    }
//
//}