package com.wlk.ideaplugin.apexsupport.sql;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SQL插件配置管理
 */
@State(
        name = "ApexSqlConfig",
        storages = @Storage("ApexSqlConfig.xml")
)
public class SqlConfig implements PersistentStateComponent<SqlConfig.State> {
    private State myState = new State();

    public static SqlConfig getInstance(@NotNull Project project) {
        return project.getService(SqlConfig.class);
    }

    @Nullable
    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(@NotNull State state) {
        myState = state;
    }

    public static class State {
        public String sfCliPath = "sf";
        public String defaultOutputFormat = "json";
        public int queryTimeout = 30;
    }

    // 配置项的getter/setter方法
    public String getSfCliPath() {
        return myState.sfCliPath;
    }

    public void setSfCliPath(String path) {
        myState.sfCliPath = path;
    }

    public String getDefaultOutputFormat() {
        return myState.defaultOutputFormat;
    }

    public void setDefaultOutputFormat(String format) {
        myState.defaultOutputFormat = format;
    }

    public int getQueryTimeout() {
        return myState.queryTimeout;
    }

    public void setQueryTimeout(int timeout) {
        myState.queryTimeout = timeout;
    }
}