package com.wlk.ideaplugin.apexsupport.language.parser;


import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class TestM {
    public static void main(String[] args) {
        System.out.println("hello world");

        // 获取当前线程的上下文类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader instanceof URLClassLoader) {
            URLClassLoader urlClassLoader = (URLClassLoader) classLoader;
            URL[] urls = urlClassLoader.getURLs();
            for (URL url : urls) {
                System.out.println(new File(url.getFile()).getAbsolutePath());
            }
        } else {
            System.out.println("无法获取类路径，当前类加载器不是 URLClassLoader 类型。");
        }

    }
}
