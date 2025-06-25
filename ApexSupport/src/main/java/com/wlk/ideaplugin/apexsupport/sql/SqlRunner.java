package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CompletableFuture;

/**
 * SQL命令执行器
 */
public class SqlRunner {
    private static final Logger LOG = Logger.getInstance(SqlRunner.class);

    /**
     * 异步执行SQL字符串
     * @param sql SQL命令字符串
     * @return 包含执行结果的CompletableFuture
     */
    public static CompletableFuture<String> executeSqlStringAsync(String sql,String env) {
        CompletableFuture<String> future = new CompletableFuture<>();
        
        try {
            GeneralCommandLine commandLine = new GeneralCommandLine()
                    .withExePath("sf").withParameters("data", "query", "--query").withParameters(sql).withParameters("--json", "-o", env);
//                    .withExePath("ls");

            OSProcessHandler handler = new OSProcessHandler(commandLine);
            StringBuilder outputBuffer = new StringBuilder();
            StringBuilder errorBuffer = new StringBuilder();
            
            // 实时读取输出流
            Thread outputThread = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(handler.getProcess().getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        outputBuffer.append(line).append("\n");
                    }
                } catch (IOException e) {
                    LOG.warn("读取命令输出流异常", e);
                }
            });
            
            // 实时读取错误流
            Thread errorThread = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(handler.getProcess().getErrorStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        errorBuffer.append(line).append("\n");
                    }
                } catch (IOException e) {
                    LOG.warn("读取命令错误流异常", e);
                }
            });
            
            handler.addProcessListener(new ProcessAdapter() {
                @Override
                public void startNotified(@NotNull ProcessEvent event) {
                    outputThread.start();
                    errorThread.start();
                }
                
                @Override
                public void processTerminated(@NotNull ProcessEvent event) {
                    try {
                        outputThread.join();
                        errorThread.join();
                        
                        if (event.getExitCode() == 0) {
                            future.complete(outputBuffer.toString());
                        } else {
                            LOG.warn("命令执行失败，错误输出: " + errorBuffer.toString());
                            future.completeExceptionally(new ExecutionException("SQL执行失败，退出码: " + 
                                event.getExitCode() + "; " + errorBuffer.toString()));
                        }
                    } catch (InterruptedException e) {
                        future.completeExceptionally(e);
                    }
                }
            });
            
            handler.startNotify();
        } catch (ExecutionException e) {
            LOG.error("执行SQL命令失败", e);
            future.completeExceptionally(e);
        }
        
        return future;
    }
}