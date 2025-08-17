package com.wlk.ideaplugin.soqlsupport.sobject;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.treeStructure.Tree;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObjectField;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class SObjectTreePanel extends JPanel {
    private final Project project;
    private final SObjectService sObjectService;
    private final Tree tree;
    private ComboBox<String> objectComboBox;

    public SObjectTreePanel(Project project) {
        this.project = project;
        this.sObjectService = new SObjectService();
        this.setLayout(new BorderLayout());

        // 创建顶部组件面板
        JPanel topPanel = createTopPanel();
        add(topPanel, BorderLayout.NORTH);

        // 创建树状结构
        tree = new Tree(new DefaultMutableTreeNode("Loading..."));
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setCellRenderer(new SObjectTreeCellRenderer());

        // 添加双击事件监听器
        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    if (node != null && node.getUserObject() instanceof SObject) {
                        SObject sObject = (SObject) node.getUserObject();
//                        SObjectEditorProvider.openEditor(project, sObject);
                    }
                }
            }
        });

        add(new JBScrollPane(tree), BorderLayout.CENTER);

        // 加载对象列表
        loadObjectList();
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // 创建下拉框
        objectComboBox = new ComboBox<>();
        panel.add(new JLabel("对象:"));
        panel.add(objectComboBox);

        // 创建查询按钮
        JButton queryButton = new JButton("查询");
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performQuery();
            }
        });
        panel.add(queryButton);

        return panel;
    }

    private void loadObjectList() {
        new SwingWorker<List<String>, Void>() {
            @Override
            protected List<String> doInBackground() throws Exception {
                return sObjectService.getSObjectNames();
            }

            @Override
            protected void done() {
                try {
                    List<String> objectNames = get();
                    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
                    for (String name : objectNames) {
                        model.addElement(name);
                    }
                    objectComboBox.setModel(model);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(SObjectTreePanel.this,
                            "加载对象列表失败: " + e.getMessage(),
                            "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.execute();
    }

    private void performQuery() {
        String selectedObject = (String) objectComboBox.getSelectedItem();
        if (selectedObject == null || selectedObject.isEmpty()) {
            JOptionPane.showMessageDialog(this, "请选择一个对象", "提示", JOptionPane.WARNING_MESSAGE);
            return;
        }

        querySObjectFields(selectedObject);
    }

    private void querySObjectFields(final String objectName) {
        new SwingWorker<SObject, Void>() {
            @Override
            protected SObject doInBackground() throws Exception {
                return sObjectService.getSObjectFields(objectName);
            }

            @Override
            protected void done() {
                try {
                    SObject sObject = get();
                    updateTreeModel(sObject);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(SObjectTreePanel.this,
                            "查询对象字段失败: " + e.getMessage(),
                            "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.execute();
    }

    private void updateTreeModel(SObject sObject) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("SObjects");
        DefaultMutableTreeNode objectNode = new DefaultMutableTreeNode(sObject);

        for (SObjectField field : sObject.getFields()) {
            objectNode.add(new DefaultMutableTreeNode(field));
        }

        root.add(objectNode);
        tree.setModel(new SObjectTreeModel(root));
    }
}
