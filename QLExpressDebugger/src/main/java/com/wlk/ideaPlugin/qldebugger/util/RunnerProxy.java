package com.wlk.ideaPlugin.qldebugger.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import com.intellij.openapi.progress.ProgressIndicator;

/**
 * @author 王利康
 * @date 2024/1/6 14:19:04
 */
public class RunnerProxy {

    private String version;
    private RunnerProxy(String version){
        this.version = version;
    }

    private static Map<String,RunnerProxy> versionRunner = new HashMap<>();

    /**
     * 状态,INIT、INITING、INITED
     */
    private String status = "INIT";

    public URLClassLoader urlClassLoader = null;


    public void init(ProgressIndicator indicator){
        setStatus("INITING");
        //延迟加载类
        URLClassLoader urlClzLoader = ClassUtil.loadClass(version, indicator);
        ClassUtil.warmUpClass(urlClzLoader,indicator);
        setUrlClassLoader(urlClzLoader);
        setStatus("INITED");
    }


    public static RunnerProxy getProxy(String version){
        System.out.println("获取 "+version+" 的执行器");
        if(version == null || "".equals(version)){
            version = "3.3.2";
        }

        if(versionRunner.get(version) == null){
            synchronized (RunnerProxy.class){
                if(versionRunner.get(version) == null){
                    RunnerProxy runnerProxy = new RunnerProxy(version);
                    versionRunner.put(version,runnerProxy);
                    runnerProxy.setStatus("INIT");
                }
            }
        }
        return versionRunner.get(version);
    }

    public Object invokeByReflection(String express, JSONObject params,List<String> errorList)  throws Exception{

        try {
            Class<?> expressRunnerClass = urlClassLoader.loadClass("com.ql.util.express.ExpressRunner");
            Class<?> contextClass = urlClassLoader.loadClass("com.ql.util.express.DefaultContext");
            Class<?> iExpressContextClass = urlClassLoader.loadClass("com.ql.util.express.IExpressContext");
            Constructor<?> constructor = expressRunnerClass.getConstructor(boolean.class, boolean.class);
            Object runner = constructor.newInstance(false, true);

            Constructor<?> contextConstructr = contextClass.getConstructor();
            Method putAll = contextClass.getMethod("putAll", Map.class);
            Object context = contextConstructr.newInstance();
            putAll.invoke(context,params);

            Method execute = expressRunnerClass.getMethod("execute",
                String.class, iExpressContextClass, List.class, boolean.class, boolean.class);
            Object invoke = execute.invoke(runner, express, context, errorList, false, true);
            return invoke;
        } catch (Exception e) {
            //e.printStackTrace();
            throw  e;
        }
    }


    public void setUrlClassLoader(URLClassLoader urlClassLoader) {
        this.urlClassLoader = urlClassLoader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        RunnerProxy runnerProxy = new RunnerProxy("3.3.2");
        //runnerProxy.loadClass(null);
        JSONObject params = new JSONObject();
        params.put("a",1);
        params.put("b",2);
        List<String> errorList = new ArrayList<>();
        try {
            Object o = runnerProxy.invokeByReflection("a+b", params, errorList);
            System.out.println("表达式的结果为："+o);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
