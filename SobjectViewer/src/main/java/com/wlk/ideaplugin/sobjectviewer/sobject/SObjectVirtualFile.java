//package com.wlk.ideaplugin.soqlsupport.sobject;
//
//import com.intellij.openapi.vfs.VirtualFile;
//import com.intellij.openapi.vfs.VirtualFileWithId;
//import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.UUID;
//
//public class SObjectVirtualFile extends VirtualFile implements VirtualFileWithId {
//    private final SObject sObject;
//    private final String id;
//
//    private SObjectVirtualFile(SObject sObject) {
//        this.sObject = sObject;
//        this.id = UUID.randomUUID().toString();
//    }
//
//    public static SObjectVirtualFile create(SObject sObject) {
//        return new SObjectVirtualFile(sObject);
//    }
//
//    public SObject getSObject() {
//        return sObject;
//    }
//
//    @NotNull
//    @Override
//    public String getName() {
//        return sObject.getName() + ".sobject";
//    }
//
//    @NotNull
//    @Override
//    public String getPath() {
//        return "/" + sObject.getName() + ".sobject";
//    }
//
//    @NotNull
//    @Override
//    public VirtualFile getParent() {
//        return null;
//    }
//
//    @NotNull
//    @Override
//    public VirtualFile[] getChildren() {
//        return VirtualFile.EMPTY_ARRAY;
//    }
//
//    @Override
//    public boolean isDirectory() {
//        return false;
//    }
//
//    @Override
//    public boolean isValid() {
//        return true;
//    }
//
//    @Override
//    public boolean isWritable() {
//        return false;
//    }
//
//    @Override
//    public boolean isInLocalFileSystem() {
//        return false;
//    }
//
//    @NotNull
//    @Override
//    public InputStream getInputStream() throws IOException {
//        throw new IOException("Not supported");
//    }
//
//    @NotNull
//    @Override
//    public OutputStream getOutputStream(Object requestor, long newModificationStamp, long newTimeStamp) throws IOException {
//        throw new IOException("Not supported");
//    }
//
//    @Override
//    public long getLength() {
//        return 0;
//    }
//
//    @Override
//    public void refresh(boolean asynchronous, boolean recursive, @Nullable Runnable postRunnable) {
//        // 不需要实现
//    }
//
//    @Override
//    public long getTimeStamp() {
//        return 0;
//    }
//
//    @Override
//    public long getModificationStamp() {
//        return 0;
//    }
//
//    @Nullable
//    @Override
//    public String getExtension() {
//        return "sobject";
//    }
//
//    @Nullable
//    @Override
//    public String getPresentableUrl() {
//        return sObject.getName() + ".sobject";
//    }
//
//    @Override
//    public int getId() {
//        return id.hashCode();
//    }
//}
