package com.wlk.ideaplugin.soqlsupport.sql;

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
    private DefaultTableModel tableModel;
    private JLabel totalSizeLabel;
    private JLabel loadingLabel;
    
    public ResultViewer() {
        super(new BorderLayout());
        
        // 创建总数标签
        totalSizeLabel = new JLabel();
        totalSizeLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        // 创建加载状态标签
        loadingLabel = new JLabel("加载中...");
        loadingLabel.setVisible(false);
        
        // 创建顶部面板
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(totalSizeLabel, BorderLayout.WEST);
        topPanel.add(loadingLabel, BorderLayout.EAST);
        
        // 初始化表格模型，创建不可编辑的表格模型
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        resultTable = new JBTable(tableModel);
        resultTable.setPreferredScrollableViewportSize(JBUI.size(500, 200));
        
        // 添加滚动面板
        JScrollPane scrollPane = new JScrollPane(resultTable);
        
        // 添加组件到主面板
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    /**
     * 显示查询结果
     * @param jsonResult JSON格式的查询结果
     * 调用时机：当SQL执行完成并返回结果后
     */
    public void displayResult(@NotNull String sql, @NotNull String jsonResult) {
        try {
            // 解析sql中的select部分，获取字段名
            String[] selectFields = parseSelectFields(sql);
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
            // 每行的数据
            List<Map<String, String>> tableData = new ArrayList<>();
            Set<String> columns = new LinkedHashSet<>();
            
            for (JsonElement record : records) {
                Map<String, String> row = new HashMap<>();
                parseRecord(record.getAsJsonObject(), row, "");
                tableData.add(row);
            }
            // 更新表格
            updateTable(List.of(selectFields), tableData, totalSize);

        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                LOG.warn("解析json结果异常："+stackTraceElement.toString());
            }
            showError("解析JSON失败: " + e.getMessage());
        }
    }

    private String[] parseSelectFields(@NotNull String sql) {
        // 找到第一个select 关键字
        int selectIndex = sql.toLowerCase().indexOf("select");
        if (selectIndex == -1) {
            return new String[0];
        }
        // 找到第一个from关键字
        int fromIndex = sql.toLowerCase().indexOf("from");
        if (fromIndex == -1) {
            return new String[0];
        }
        // 提取select部分
        String selectPart = sql.substring(selectIndex + "select".length(), fromIndex).trim();
        // 处理select部分，移除别名和括号
        selectPart = selectPart.replaceAll("\\s+as\\s+", " ");
        selectPart = selectPart.replaceAll("\\s+", ",");
        selectPart = selectPart.replaceAll("\\(", "");
        selectPart = selectPart.replaceAll("\\)", "");
        // 分割字段名
        return selectPart.split(",");
    }
    //    {
    //        "attributes":
    //        {
    //            "type": "Lead",
    //                "url": "/services/data/v64.0/sobjects/Lead/00QBB000003eYb52AE"
    //        },
    //        "Id": "00QBB000003eYb52AE",
    //            "Name": "深圳*******司",
    //            "RecordType":
    //        {
    //            "attributes":
    //            {
    //                "type": "RecordType",
    //                    "url": "/services/data/v64.0/sobjects/RecordType/012BB0000004MBDYA2"
    //            },
    //            "Name": "Potential Customer"
    //        },
    //        "MatchingAccount__r":
    //        {
    //            "attributes":
    //            {
    //                "type": "Account",
    //                    "url": "/services/data/v64.0/sobjects/Account/001BB000004JgMcYAK"
    //            },
    //            "Name": "深圳驿客科技有限公司",
    //                "RecordType":
    //            {
    //                "attributes":
    //                {
    //                    "type": "RecordType",
    //                        "url": "/services/data/v64.0/sobjects/RecordType/0125g000000x8scAAA"
    //                },
    //                "Name": "Customer"
    //            },
    //            "Account_Number__c": "ACC-0000189239"
    //        },
    //        "MatchingAccount__c": "001BB000004JgMcYAK",
    //            "IsConverted": true
    //    }
    /** 解析如上的结果，将结果解析到row中
     * @param record
     * @param row
     * @param prefix
     */
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
            // 更新总数显示
            totalSizeLabel.setText("总行数: " + totalSize);
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
            // 设置表格选择模式
            resultTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            resultTable.setCellSelectionEnabled(true);
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
    
    /**
     * 显示/隐藏加载状态
     * @param loading 是否显示加载状态
     */
    public void showLoading(boolean loading) {
        SwingUtilities.invokeLater(() -> {
            loadingLabel.setVisible(loading);
        });
    }
}