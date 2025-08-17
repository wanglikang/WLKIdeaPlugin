package com.wlk.ideaplugin.soqlsupport.sobject;

import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObjectField;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class SObjectTreeModel extends DefaultTreeModel {
    public SObjectTreeModel(MutableTreeNode root) {
        super(root);
    }

    @Override
    public boolean isLeaf(Object node) {
        // SObject节点不是叶子节点，Field节点是叶子节点
        return node instanceof SObjectField;
    }
}
