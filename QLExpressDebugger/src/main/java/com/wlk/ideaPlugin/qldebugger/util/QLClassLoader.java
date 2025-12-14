package com.wlk.ideaPlugin.qldebugger.util;

import java.io.IOException;
import java.net.URL;

import com.intellij.ide.plugins.cl.PluginClassLoader;

/**
 * @author 王利康
 * @date 2024/7/10 18:56:47
 */
public class QLClassLoader extends ClassLoader {
    public QLClassLoader() {
        super(null);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }

    @Override
    protected Class<?> findClass(String moduleName, String name) {
        return super.findClass(moduleName, name);
    }

    @Override
    protected URL findResource(String moduleName, String name) throws IOException {
        return super.findResource(moduleName, name);
    }
    
}
