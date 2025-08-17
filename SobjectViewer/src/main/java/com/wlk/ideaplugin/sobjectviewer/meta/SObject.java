package com.wlk.ideaplugin.soqlsupport.sobject.meta;

import java.util.ArrayList;
import java.util.List;

public class SObject {
    private String name;
    private List<SObjectField> fields = new ArrayList<>();

    public SObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<SObjectField> getFields() {
        return fields;
    }

    public void addField(SObjectField field) {
        fields.add(field);
    }
}
