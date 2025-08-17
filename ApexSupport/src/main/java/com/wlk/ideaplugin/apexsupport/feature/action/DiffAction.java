package com.wlk.ideaplugin.apexsupport.feature.action;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DiffAction  extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        if (project != null) {
            // 创建控制台
            ConsoleView consoleView = createConsoleView(project);
            // 显示控制台
            showConsoleView(project, consoleView);
            // 执行系统命令
            executeCommand(project,consoleView, "ls"); // 这里以执行 "ls -l" 命令为例，可根据需求修改
        }
    }

    private ConsoleView createConsoleView(Project project) {
        TextConsoleBuilderFactory instance = TextConsoleBuilderFactory.getInstance();
        ConsoleView console = instance.createBuilder(project).getConsole();
        return console;
    }

    private void showConsoleView(Project project, ConsoleView consoleView) {
        String ApexToolWindowsId = "ApexToolWindows";
        ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(project);
        ToolWindow toolWindow = (ToolWindow) toolWindowManager.getToolWindow(ApexToolWindowsId);
        if (toolWindow != null) {
            ContentFactory contentFactory = ContentFactory.getInstance();
            Content content = contentFactory.createContent(consoleView.getComponent(), "Command Output", false);
            toolWindow.getContentManager().addContent(content);
            toolWindow.show(null);
        }
    }

    private void executeCommand(Project project,ConsoleView consoleView, String command) {
        try {
            GeneralCommandLine generalCommandLine = new GeneralCommandLine(command);
            generalCommandLine.withWorkDirectory(project.getBasePath());
//            generalCommandLine.withParameters()
            Process process = generalCommandLine.createProcess();
            OSProcessHandler osProcessHandler = new OSProcessHandler(generalCommandLine);
            // 读取命令的标准输出
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                consoleView.print(line + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
            }
            consoleView.attachToProcess(osProcessHandler);
            // 等待命令执行完成
            int exitCode = process.waitFor();
            consoleView.print("Command exited with code " + exitCode + "\n", ConsoleViewContentType.NORMAL_OUTPUT);

        } catch (IOException | InterruptedException ex) {
            consoleView.print("Error executing command: " + ex.getMessage() + "\n", ConsoleViewContentType.ERROR_OUTPUT);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
