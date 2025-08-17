//package com.wlk.ideaplugin.soqlsupport.sobject;
//
//import com.intellij.openapi.fileEditor.FileEditor;
//import com.intellij.openapi.fileEditor.FileEditorLocation;
//import com.intellij.openapi.fileEditor.FileEditorState;
//import com.intellij.openapi.fileEditor.FileEditorStateLevel;
//import com.intellij.openapi.project.Project;
//import com.intellij.openapi.util.Key;
//import com.intellij.openapi.util.UserDataHolderBase;
//import com.intellij.ui.components.JBScrollPane;
//import com.intellij.ui.table.JBTable;
//import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
//import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObjectField;
//import org.jetbrains.annotations.Nls;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.beans.PropertyChangeListener;
//import java.util.List;
//
//public class SObjectEditor extends UserDataHolderBase implements FileEditor {
//    private final Project project;
//    private final SObjectVirtualFile virtualFile;
//    private final JPanel component;
//
//    public SObjectEditor(Project project, SObjectVirtualFile virtualFile) {
//        this.project = project;
//        this.virtualFile = virtualFile;
//        this.component = createComponent();
//    }
//
//    private JPanel createComponent() {
//        JPanel panel = new JPanel(new BorderLayout());
//        SObject sObject = virtualFile.getSObject();
//
//        // 创建表格模型
//        DefaultTableModel tableModel = new DefaultTableModel(
//                new String[]{"字段名称", "字段类型"}, 0);
//
//        List<SObjectField> fields = sObject.getFields();
//        for (SObjectField field : fields) {
//            tableModel.addRow(new Object[]{field.getName(), field.getType()});
//        }
//
//        JBTable table = new JBTable(tableModel);
//        table.setFillsViewportHeight(true);
//
//        panel.add(new JBScrollPane(table), BorderLayout.CENTER);
//        return panel;
//    }
//
//    @NotNull
//    @Override
//    public JComponent getComponent() {
//        return component;
//    }
//
//    @Nullable
//    @Override
//    public JComponent getPreferredFocusedComponent() {
//        return component;
//    }
//
//    @Nls(capitalization = Nls.Capitalization.Title)
//    @NotNull
//    @Override
//    public String getName() {
//        return virtualFile.getSObject().getName() + " - 字段信息";
//    }
//
//    @NotNull
//    @Override
//    public FileEditorState getState(@NotNull FileEditorStateLevel level) {
//        return FileEditorState.INSTANCE;
//    }
//
//    @Override
//    public void setState(@NotNull FileEditorState state) {
//        // 不需要实现
//    }
//
//    @Override
//    public boolean isModified() {
//        return false;
//    }
//
//    @Override
//    public boolean isValid() {
//        return true;
//    }
//
//    @Override
//    public void addPropertyChangeListener(@NotNull PropertyChangeListener listener) {
//        // 不需要实现
//    }
//
//    @Override
//    public void removePropertyChangeListener(@NotNull PropertyChangeListener listener) {
//        // 不需要实现
//    }
//
//    @Override
//    public void dispose() {
//        // 不需要实现
//    }
//
//    @Nullable
//    @Override
//    public FileEditorLocation getCurrentLocation() {
//        return null;
//    }
//
//    @Override
//    public <T> @Nullable T getUserData(@NotNull Key<T> key) {
//        return super.getUserData(key);
//    }
//
//    @Override
//    public <T> void putUserData(@NotNull Key<T> key, @Nullable T value) {
//        super.putUserData(key, value);
//    }
//}
