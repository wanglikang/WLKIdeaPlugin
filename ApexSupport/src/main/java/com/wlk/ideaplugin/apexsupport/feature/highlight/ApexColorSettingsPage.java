package com.wlk.ideaplugin.apexsupport.feature.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.wlk.ideaplugin.apexsupport.language.ApexIcon;

import javax.swing.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

final class ApexColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("CLASS", ApexSyntaxHighlighter.CLASS),
            new AttributesDescriptor("Separator", ApexSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", ApexSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", ApexSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Identifier", ApexSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Method", ApexSyntaxHighlighter.INSTANCE_METHOD),
    };

    @Override
    public Icon getIcon() {
        return ApexIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new ApexSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
        TODO  NEED UPDATE
        # You are reading the ".cls" entry.
        ! The exclamation mark can also mark text as comments.
        website = https://en.wikipedia.org/
        language = English
        # The backslash below tells the application to continue reading
        # the value onto the next line.
        message = Welcome to \\
                  Wikipedia!
        # Add spaces to the key
        key\\ with\\ spaces = This is the value that could be looked up with the key "key with spaces".
        # Unicode
        tab : \\u0009""";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Apex";
    }

}