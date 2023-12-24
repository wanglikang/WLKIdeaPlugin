package com.wlk.ideaPlugin.do2sqlmapper.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isLowCamelName(String name){
        return true;
    }
    public static boolean isDBLowCamelName(String name){
        return true;
    }

    public static String fieldName2DBColName(String idField) {
        //TODO bean里的属性名 -> db的字段名
        char[] chars = idField.toCharArray();
        StringBuilder sb =new StringBuilder();
        List<String> strs = new ArrayList<>();
        for(int i = 0;i<chars.length;i++){
            if(Character.isUpperCase(chars[i])){
                if(sb.length()>0){
                    strs.add(sb.toString());
                    sb.delete(0,sb.length());
                    sb.append(Character.toLowerCase(chars[i]));
                }
            }else{
                sb.append(chars[i]);
            }
        }
        strs.add(sb.toString());
        sb.delete(0,sb.length());
        for(int i = 0;i<strs.size();i++){
            sb.append(strs.get(i)+"_");
        }
        sb.delete(sb.length()-1,sb.length());

        return sb.toString();
    }

    public static String fieldType2DBType(String fieldType) {
        //TODO bean里的属性名 -> db的字段类型
        switch (fieldType){
            case "String":return "VARCHAR";
            case "Long":return "BIGINT";
            case "Integer": return "INTEGER";
            case "Boolean":return "INTEGER";
            case "Date":return "TIMESTAMP";
            default:return "VARCHAR";
        }
    }


    public static String autoDetectClassPath(String projectBasePath,String packageName){
        String packagePath = packageName.replace(".",File.separator);
        String mvnPath = projectBasePath+File.separator+"target"+File.separator+"classes"+File.separator+packagePath;
        String outPath = projectBasePath+File.separator+"out"+File.separator+"classes"+File.separator+packagePath;
        String buildPath = projectBasePath+File.separator+"build"+File.separator+"classes"+File.separator+"java"+packagePath;
        File mavenClassPath = new File(mvnPath);
        File outClassPath = new File(outPath);
        File buildClassPath = new File(buildPath);
        String findClassPath =projectBasePath;
        if(mavenClassPath.exists()){
            findClassPath = mvnPath;
        }else  if(outClassPath.exists()){
            findClassPath =  outPath;
        }else  if(buildClassPath.exists()){
            findClassPath =  buildPath;
        }
        System.out.println("find class path:"+mvnPath);
        return findClassPath;
    }

    public static String ABC2a_b_c(String path){
        String t = "a"+path;
        String s = fieldName2DBColName(t);
        return s.substring(2,s.length());
    }
}
