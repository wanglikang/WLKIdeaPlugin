package com.wlk.ideaplugin.soqlsupport.sobject;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = "SObjectPluginConfig",
        storages = @Storage("sobject-plugin.xml")
)
public class PluginConfig implements PersistentStateComponent<PluginConfig.State> {

    public static class State {
        public String commandLineToolPath = "";
    }

    private State state = new State();

    public static PluginConfig getInstance() {
        return com.intellij.openapi.application.ApplicationManager.getApplication().getService(PluginConfig.class);
    }

    @Nullable
    @Override
    public State getState() {
        return state;
    }

    @Override
    public void loadState(@NotNull State state) {
        this.state = state;
    }

    public String getCommandLineToolPath() {
        return state.commandLineToolPath;
    }

    public void setCommandLineToolPath(String path) {
        state.commandLineToolPath = path;
    }
}
