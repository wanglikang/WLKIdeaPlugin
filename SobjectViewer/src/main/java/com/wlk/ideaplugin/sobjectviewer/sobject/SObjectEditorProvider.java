//package com.wlk.ideaplugin.soqlsupport.sobject;
//
//import com.intellij.openapi.fileEditor.FileEditor;
//import com.intellij.openapi.fileEditor.FileEditorManager;
//import com.intellij.openapi.fileEditor.FileEditorProvider;
//import com.intellij.openapi.project.DumbAware;
//import com.intellij.openapi.project.Project;
//import com.intellij.openapi.vfs.VirtualFile;
//import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
//import org.jetbrains.annotations.NotNull;
//
//public class SObjectEditorProvider implements FileEditorProvider, DumbAware {
//    public static final String EDITOR_TYPE_ID = "sobject-editor";
//
//    public static void openEditor(Project project, SObject sObject) {
//        VirtualFile virtualFile = SObjectVirtualFile.create(sObject);
//        FileEditorManager.getInstance(project).openFile(virtualFile, true);
//    }
//
//    @Override
//    public boolean accept(@NotNull Project project, @NotNull VirtualFile file) {
//        return file instanceof SObjectVirtualFile;
//    }
//
//    @NotNull
//    @Override
//    public FileEditor createEditor(@NotNull Project project, @NotNull VirtualFile file) {
//        return new SObjectEditor(project, (SObjectVirtualFile) file);
//    }
//
//    @NotNull
//    @Override
//    public String getEditorTypeId() {
//        return EDITOR_TYPE_ID;
//    }
//}
