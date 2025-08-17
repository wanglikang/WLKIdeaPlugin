package com.wlk.ideaplugin.soqlsupport.sobject;

import com.wlk.ideaplugin.soqlsupport.sobject.meta.FieldType;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObject;
import com.wlk.ideaplugin.soqlsupport.sobject.meta.SObjectField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SObjectService {
    private final CommandLineService commandLineService;

    public SObjectService() {
        this.commandLineService = new CommandLineService();
    }

    public List<String> getSObjectNames() throws IOException {
        List<String> output = commandLineService.executeCommand("list-objects");
        return parseSObjectNames(output);
    }

    public SObject getSObjectFields(String objectName) throws IOException {
        List<String> output = commandLineService.executeCommand("describe-object", objectName);
        return parseSObjectFields(objectName, output);
    }

    private List<String> parseSObjectNames(List<String> output) {
        // 实际实现中需要根据命令行工具的输出格式进行解析
        return new ArrayList<>(output);
    }

    private SObject parseSObjectFields(String objectName, List<String> output) {
        SObject sObject = new SObject(objectName);

        // 实际实现中需要根据命令行工具的输出格式进行解析
        for (String line : output) {
            String[] parts = line.split("\\t");
            if (parts.length >= 2) {
                try {
                    FieldType type = FieldType.valueOf(parts[1].toUpperCase());
                    sObject.addField(new SObjectField(parts[0], type));
                } catch (IllegalArgumentException e) {
                    // 处理未知字段类型
                    sObject.addField(new SObjectField(parts[0], FieldType.TEXT));
                }
            }
        }

        return sObject;
    }
}
