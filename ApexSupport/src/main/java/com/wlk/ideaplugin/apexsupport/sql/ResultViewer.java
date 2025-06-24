package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.ui.table.JBTable;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * SQL结果查看器
 * 功能：解析JSON结果并以表格形式展示
 * 调用时机：当SQL执行完成后由SqlToolWindow调用
 */
public class ResultViewer extends JPanel {
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
        // 这里应该添加JSON解析逻辑
        // List<Map<String, Object>> data = parseJson(jsonResult);
        
        // 示例：模拟解析后的数据
        String[] columns = {"ID", "Name", "Age"};
        Object[][] sampleData = {
            {1, "Alice", 30},
            {2, "Bob", 25}
        };
        
        // 更新表格模型
        SwingUtilities.invokeLater(() -> {
            tableModel.setDataVector(sampleData, columns);
            tableModel.fireTableDataChanged();
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