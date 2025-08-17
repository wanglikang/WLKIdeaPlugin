package com.wlk.ideaplugin.soqlsupport.sobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CommandLineService {
    private final String commandLineToolPath;

    public CommandLineService() {
        this.commandLineToolPath = PluginConfig.getInstance().getCommandLineToolPath();
    }

    public List<String> executeCommand(String... args) throws IOException {
        if (commandLineToolPath.isEmpty()) {
            throw new IOException("Command line tool path is not configured");
        }

        List<String> command = new ArrayList<>();
        command.add(commandLineToolPath);
        for (String arg : args) {
            command.add(arg);
        }

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        Process process = processBuilder.start();

        List<String> output = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.add(line);
            }
        }

        int exitCode;
        try {
            exitCode = process.waitFor();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Command interrupted", e);
        }

        if (exitCode != 0) {
            throw new IOException("Command failed with exit code: " + exitCode);
        }

        return output;
    }
}
