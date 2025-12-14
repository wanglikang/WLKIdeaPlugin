package com.wlk.ideaPlugin.do2sqlmapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王利康
 * @date 2020/7/6
 */
public class BeanGenerateContext {

    private String tableName;
    private String packageName;
    private String beanName;
    private Map<String,String> field2Type = new HashMap<>();
    private List<String> idFields = new ArrayList<>();
    private Map<String,String> idField2Type = new HashMap<>();
    private Class<?> cls;


    public List<String> getIdFields() {
        return idFields;
    }

    public void setIdFields(List<String> idFields) {
        this.idFields = idFields;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Map<String, String> getIdField2Type() {
        return idField2Type;
    }

    public void setIdField2Type(Map<String, String> idField2Type) {
        this.idField2Type = idField2Type;
    }

    public Map<String, String> getField2Type() {
        return field2Type;
    }

    public void setField2Type(Map<String, String> field2Type) {
        this.field2Type = field2Type;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }
}
