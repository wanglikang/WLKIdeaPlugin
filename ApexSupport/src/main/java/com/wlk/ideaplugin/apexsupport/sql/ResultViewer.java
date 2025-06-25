package com.wlk.ideaplugin.apexsupport.sql;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.ui.table.JBTable;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * SQL结果查看器
 * 功能：解析JSON结果并以表格形式展示
 * 调用时机：当SQL执行完成后由SqlToolWindow调用
 */
public class ResultViewer extends JPanel {
    private static final Logger LOG = Logger.getInstance(ResultViewer.class);

    private final JBTable resultTable;
    private final DefaultTableModel tableModel;
    
    public ResultViewer() {
        super(new BorderLayout());
        
        // 初始化表格模型
        tableModel = new DefaultTableModel();
        resultTable = new JBTable(tableModel);
        resultTable.setPreferredScrollableViewportSize(JBUI.size(500, 200));
        
        // 添加滚动面板
        JScrollPane scrollPane = new JScrollPane(resultTable);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    /**
     * 显示查询结果
     * @param jsonResult JSON格式的查询结果
     * 调用时机：当SQL执行完成并返回结果后
     */
    public void displayResult(@NotNull String jsonResult) {
        try {
            // 解析JSON
            JsonObject jsonObject = JsonParser.parseString(jsonResult).getAsJsonObject();
            
//            // 1. 检查warnings
//            if (jsonObject.has("warnings") && !jsonObject.get("warnings").isJsonNull()) {
//                JsonArray warnings = jsonObject.get("warnings").getAsJsonArray();
//                String warning = (String) warnings;
//                showError(warning);
//                return;
//            }
            
            // 2. 检查result.done
            JsonObject result = jsonObject.getAsJsonObject("result");
            if (!result.get("done").getAsBoolean()) {
                showError("查询未完成");
                return;
            }
            
            // 3. 获取totalSize
            int totalSize = result.get("totalSize").getAsInt();
            
            // 解析records
            JsonArray records = result.getAsJsonArray("records");
            List<Map<String, String>> tableData = new ArrayList<>();
            Set<String> columns = new LinkedHashSet<>();
            
            for (JsonElement record : records) {
                Map<String, String> row = new HashMap<>();
                parseRecord(record.getAsJsonObject(), row, "");
                tableData.add(row);
                columns.addAll(row.keySet());
            }
            
            // 更新表格
            updateTable(new ArrayList<>(columns), tableData, totalSize);
            
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                LOG.warn("解析json结果异常："+stackTraceElement.toString());
            }
            showError("解析JSON失败: " + e.getMessage());
        }
    }
    
    private void parseRecord(JsonObject record, Map<String, String> row, String prefix) {
        for (Map.Entry<String, JsonElement> entry : record.entrySet()) {
            String key = entry.getKey();
            if ("attributes".equals(key)) continue;
            
            String fullKey = prefix.isEmpty() ? key : prefix + "." + key;
            JsonElement value = entry.getValue();
            
            if (value.isJsonPrimitive()) {
                row.put(fullKey, value.getAsString());
            } else if (value.isJsonObject()) {
                parseRecord(value.getAsJsonObject(), row, fullKey);
            }
        }
    }
    
    private void updateTable(List<String> columns, List<Map<String, String>> data, int totalSize) {
        SwingUtilities.invokeLater(() -> {
            // 设置表头
            tableModel.setColumnIdentifiers(columns.toArray());
            
            // 添加数据行
            for (Map<String, String> row : data) {
                Object[] rowData = new Object[columns.size()];
                for (int i = 0; i < columns.size(); i++) {
                    rowData[i] = row.get(columns.get(i));
                }
                tableModel.addRow(rowData);
            }
            
            // 显示总行数
            JOptionPane.showMessageDialog(this, "总行数: " + totalSize, "查询结果", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void showError(String message) {
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, message, "查询错误", JOptionPane.ERROR_MESSAGE);
        });
    }
    
    /**
     * 清空结果
     * 调用时机：当开始新的查询或用户手动清空时
     */
    public void clear() {
        SwingUtilities.invokeLater(() -> {
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);
        });
    }
}