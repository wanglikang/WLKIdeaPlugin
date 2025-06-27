package com.wlk.ideaplugin.apexsupport.sql;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.intellij.execution.ExecutionException;
import com.intellij.openapi.diagnostic.Logger;

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
            ProcessBuilder processBuilder = new ProcessBuilder("sf", "data", "query", "--query", sql, "--json", "-o", env);
            Process process = processBuilder.start();
            String commandLineStr = String.join(" ", processBuilder.command());
            LOG.warn("待执行的命令:"+commandLineStr);
//            OSProcessHandler handler = new OSProcessHandler(process);
            StringBuilder outputBuffer = new StringBuilder();
            StringBuilder errorBuffer = new StringBuilder();
            
            // 实时读取输出流
            Thread outputThread = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    char[] buf = new char[102400];
                    int read = -1;
                    while ((read = reader.read(buf))>0) {
                        outputBuffer.append(String.valueOf(buf, 0, read));
                    }

                    while ((read = reader.read(buf))>0) {
                        outputBuffer.append(String.valueOf(buf, 0, read));
                    }
                    LOG.warn("读取命令输出流完毕:"+ outputBuffer.toString());
                } catch (IOException e) {
                    LOG.warn("读取命令输出流异常", e);
                }
            });
            
            // 实时读取错误流
            Thread errorThread = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        errorBuffer.append(line).append("\n");
                    }
                } catch (IOException e) {
                    LOG.warn("读取命令错误流异常", e);
                }
            });

            outputThread.start();
            errorThread.start();
            
            new Thread(() -> {
                try {
                    outputThread.join();
                    errorThread.join();
                    
                    int exitCode = process.waitFor();
                    if (exitCode == 0) {
                        future.complete(outputBuffer.toString());
                    } else {
                        // 虽然失败，但是还会返回结果，解析展示即可
                        if(outputBuffer.length()>0){
                            String errorInfo = outputBuffer.toString();
                            JsonObject jsonObject = JsonParser.parseString(errorInfo).getAsJsonObject();
                            String errorType = jsonObject.get("name").getAsString();
                            String errorMessage = jsonObject.get("message").getAsString();
                            future.completeExceptionally(new ExecutionException("SQL执行失败 " +
                                    "\n错误原因：" + errorType + errorMessage));
                        }else {
                            LOG.warn("命令执行失败，错误输出: " + errorBuffer.toString());
                            future.completeExceptionally(new ExecutionException("\nSQL执行失败，退出码: " +
                                    exitCode + "; " + errorBuffer.toString()));
                        }
                    }
                } catch (InterruptedException e) {
                    LOG.error("执行SQL命令失败", e);
                    future.completeExceptionally(e);
                }
            }).start();
//            handler.startNotify();
        } catch (IOException e) {
            LOG.error("执行SQL命令失败", e);
            throw new RuntimeException(e);
        }

        return future;
    }
}