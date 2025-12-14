package com.wlk.ideaPlugin.qldebugger.persistence;

import java.util.HashMap;
import java.util.Map;


/**
 * 需要持久化的类
 * + 数字（基本类型、包装类型 都可以）
 * + booleans
 * + String
 * + collections
 * + maps
 * + enums
 *  默认都可以持久化
 *  其他类型，需要自定义Converter
 * @author 王利康
 * @date 2023/12/23 14:50:48
 */

public class MyData {

    public Map<String,String> paramsMap;

    public Map<String,String> expressMap;

    private String lastEditKey;

    private String selectedVersion;

    public MyData() {
        paramsMap = new HashMap<>();
        expressMap = new HashMap<>();

    }

    public Map<String, String> getParamsMap() {
        return paramsMap;
    }

    public void setParamsMap(Map<String, String> paramsMap) {
        this.paramsMap = paramsMap;
    }

    public Map<String, String> getExpressMap() {
        return expressMap;
    }

    public void setExpressMap(Map<String, String> expressMap) {
        this.expressMap = expressMap;
    }

    public String getLastEditKey() {
        return lastEditKey;
    }

    public void setLastEditKey(String lastEditKey) {
        this.lastEditKey = lastEditKey;
    }

    public String getSelectedVersion() {
        return selectedVersion;
    }

    public void setSelectedVersion(String selectedVersion) {
        this.selectedVersion = selectedVersion;
    }
}
