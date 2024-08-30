package com.wlk.ideaPlugin.qldebugger.persistence;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.Service;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author 奈昕
 * @date 2023/12/23 14:50:28
 */

@Service
@State(name = "qlTest2", storages = {@Storage(value = "qlTestConfig.xml")})
public final class QLTestConfigSetting2  implements PersistentStateComponent<MyData> {

    private MyData myData;

    public MyData getMyData() {
        if(myData == null){
            myData = new MyData();
        }
        return myData;
    }


    @Override
    public @Nullable MyData getState() {
        return myData;
    }

    @Override
    public void loadState(@NotNull MyData state) {
        System.out.println("加载配置");
        System.out.println(state.getLastEditKey());
        this.myData = state;

    }

    @Override
    public void noStateLoaded() {
        PersistentStateComponent.super.noStateLoaded();
    }

    @Override
    public void initializeComponent() {
        PersistentStateComponent.super.initializeComponent();
    }
}
