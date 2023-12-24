package com.wlk.ideaPlugin.do2sqlmapper.classloader;

/**
 * @author 奈昕
 * @date 2023/10/1 18:41:26
 */
public class BeanClassLoader extends  ClassLoader {

    private byte[] targetByte ;
    private String packageName;

    public Class<?> loadTargetClass(String className){
        return super.defineClass(packageName+"."+className,targetByte,0,targetByte.length);
    }

    public void setTargetByte(byte[] bytes){
        targetByte = bytes;
    }

    public void setPackageName(String packageName){
        this.packageName = packageName;
    }

    public void reset(){
        this.packageName = "";
        this.targetByte = null;
    }
}
