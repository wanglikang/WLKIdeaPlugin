package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * SQL命令执行器
 */
public class SqlRunner {
    private static final Logger LOG = Logger.getInstance(SqlRunner.class);

    /**
     * 异步执行SQL命令
     * @param sqlFile 包含SQL命令的文件路径
     * @return 包含执行结果的CompletableFuture
     */
    public static CompletableFuture<String> executeSqlAsync(String sqlFile) {
        CompletableFuture<String> future = new CompletableFuture<>();
        
        try {
            GeneralCommandLine commandLine = new GeneralCommandLine()
                    .withExePath("sf")
                    .withParameters("data", "query", "--file", sqlFile, "--json");
            
            OSProcessHandler handler = new OSProcessHandler(commandLine);
            handler.addProcessListener(new ProcessAdapter() {
                @Override
                public void processTerminated(@NotNull ProcessEvent event) {
                    if (event.getExitCode() == 0) {
                        try {
                            future.complete(handler.getProcess().getInputStream().readAllBytes().toString());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        future.completeExceptionally(new ExecutionException("SQL执行失败，退出码: " + event.getExitCode()));
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