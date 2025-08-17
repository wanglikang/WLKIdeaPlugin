package com.wlk.ideaplugin.soqlsupport.sobject.meta;

public class SObjectField {
    private String name;
    private FieldType type;

    public SObjectField(String name, FieldType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public FieldType getType() {
        return type;
    }
}
