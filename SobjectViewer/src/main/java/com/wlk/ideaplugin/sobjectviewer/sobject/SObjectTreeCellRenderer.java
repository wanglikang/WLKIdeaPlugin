package com.wlk.ideaplugin.soqlsupport.sobject;

import com.intellij.ui.JBColor;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObjectField;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class SObjectTreeCellRenderer extends DefaultTreeCellRenderer {
    @NotNull
    @Override
    public Component getTreeCellRendererComponent(@NotNull JTree tree, Object value,
                                                  boolean selected, boolean expanded,
                                                  boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        Object userObject = node.getUserObject();

        if (userObject instanceof SObject) {
            setIcon(UIManager.getIcon("FileView.directoryIcon"));
            setText(((SObject) userObject).getName());
        } else if (userObject instanceof SObjectField) {
            setIcon(UIManager.getIcon("FileView.fileIcon"));
            SObjectField field = (SObjectField) userObject;
            setText(field.getName() + " (" + field.getType() + ")");
            setForeground(JBColor.GRAY);
        } else {
            setIcon(UIManager.getIcon("Tree.rootIcon"));
        }

        return this;
    }
}
