package com.wlk.ideaPlugin.qldebugger.util;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.alibaba.fastjson.JSONObject;

import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.openapi.progress.ProgressIndicator;
import com.wlk.ideaPlugin.qldebugger.domain.DependencyDTO;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author 王利康
 * @date 2024/1/7 16:16:28
 */
public class ClassUtil {

    private static String PLUGIN_IN_NAME = "com.wlk.ideaPlugin.QLExpressDebugger";
    private static String thisPluginFilePath;
    static {

        PluginId pluginId = PluginId.getId(PLUGIN_IN_NAME);
        IdeaPluginDescriptor plugin = PluginManager.getPlugin(pluginId);
        File path = plugin.getPath();
        String absolutePath = path.getAbsoluteFile().getAbsolutePath();
        System.out.println("安装的本插件的路径："+absolutePath);
        File file = new File(absolutePath+"libs");

        System.out.println("创建缓存目录:"+file.getAbsoluteFile().getAbsolutePath());
        if(!file.exists()) {
            try {
                file.mkdirs();
            }catch (Exception e){
                System.out.println("创建本地缓存目录失败");
                e.printStackTrace();
            }
        }
        thisPluginFilePath = file.getAbsoluteFile().getAbsolutePath();
    }

    /**
     * jar 包下载路径：https://repo1.maven.org/maven2/com/alibaba/QLExpress/3.3.2/QLExpress-3.3.2.jar
     * maven 仓库的ali镜像：http://maven.aliyun.com/nexus/content/groups/public
     */
    private static String urlPrefix = "https://repo1.maven.org/maven2/";

    public static URLClassLoader loadClass(String specialQlExpressVersion, ProgressIndicator indicator) {
        System.out.println("初始化自定义类加载器");

        URLClassLoader urlClassLoader = null;
        List<URL> collect = downloadAllDependencies(specialQlExpressVersion,indicator);
        int size = collect.size();
        indicator.setFraction(0.0);
        if (collect == null || collect.size() == 0) {
            System.out.println("版本 " + specialQlExpressVersion + " 找不到依赖，请重新选择版本");
            indicator.setFraction(100.0);
        }
        try {
            URL[] allDepencyURL = collect.toArray(new URL[collect.size()]);
            urlClassLoader = new URLClassLoader(allDepencyURL, Thread.currentThread().getContextClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urlClassLoader;
    }

    public static void warmUpClass(URLClassLoader urlClassLoader,ProgressIndicator indicator){
        try {
            indicator.setText("提前加载类");
            indicator.setFraction(Math.floor(0.8));
            Class<?> expressRunnerClass = urlClassLoader.loadClass("com.ql.util.express.ExpressRunner");
            indicator.setFraction(Math.floor(1.0/3));
            Class<?> contextClass = urlClassLoader.loadClass("com.ql.util.express.DefaultContext");
            indicator.setFraction(Math.floor(2.0/3));
            Class<?> iExpressContextClass = urlClassLoader.loadClass("com.ql.util.express.IExpressContext");
            indicator.setFraction(Math.floor(1.0));
            indicator.setIndeterminate(true);
            indicator.setText("加载完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addSpecialDependencyifNotExist(Set<DependencyDTO> dependencySet,DependencyDTO specialDependency ){
        boolean hasSameDependency = false;
        for (DependencyDTO dependencyDTO : dependencySet) {
            String depency = dependencyDTO.buildShowNameWithoutVersion();
            if(specialDependency.buildShowNameWithoutVersion().equalsIgnoreCase(depency)){
                hasSameDependency = true;
                break;
            }
        }
        if(!hasSameDependency){
            System.out.println("添加额外依赖:"+specialDependency.buildShowName());
            dependencySet.add(specialDependency);
        }
    }
    public static List<URL> downloadAllDependencies(String specialQlExpressVersion,ProgressIndicator indicator) {
        String qlExpressVersion = "3.3.2";
        if (specialQlExpressVersion != null || "".equals(specialQlExpressVersion)) {
            qlExpressVersion = specialQlExpressVersion;
        }

        Set<DependencyDTO> dependencySet = new HashSet<>();
        resolveDependency(new DependencyDTO("com.alibaba", "QLExpress", qlExpressVersion), dependencySet,indicator);
        //System.out.println("全部依赖："+ JSONObject.toJSONString(dependencyDTOS,true));

        //额外添加fastjson的依赖
        addSpecialDependencyifNotExist(dependencySet,new DependencyDTO("com.alibaba","fastjson","1.2.60"));

        List<DependencyDTO> dependencyDTOS = dependencySet.stream().toList();
        List<URL> result = new ArrayList<>();
        int size = dependencyDTOS.size();
        for (int i = 0; i < size; i++) {
            DependencyDTO t = dependencyDTOS.get(i);
            try {
                indicator.setText("正在下载第 "+i+"/"+size+" 个依赖");
                indicator.setFraction(Math.floor((i*1.0)/size));
                downloadIfNotExist(t,indicator);
                URL url = new File(thisPluginFilePath + "/" + t.buildLocalFileName()).toURL();
                indicator.setText("正在下载第 "+i+"/"+size+" 个依赖 下载完成");
                result.add(url);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("URL地址不合法:");
                System.out.println(thisPluginFilePath + "/" + t.buildLocalFileName());
            }
        }

        System.out.println("缓存到本地的依赖为：" + JSONObject.toJSONString(result));
        return result;
    }
    
    public static void resolveDependency(DependencyDTO dependencyDTO, Set<DependencyDTO> dependencySet,ProgressIndicator indicator) {
        String depencyName = dependencyDTO.buildShowName();
        String pomUrl = urlPrefix + dependencyDTO.buildMavenPomUrl();
        System.out.println("开始解析：" + depencyName + " ==> " + pomUrl);
        indicator.setText("开始解析:"+depencyName+" ==> "+pomUrl);
        if (dependencySet.contains(dependencyDTO)) {
            return;
        }
        dependencySet.add(dependencyDTO);
        try {
            SAXReader saxReader = new SAXReader();

            Document read = saxReader.read(new URL(pomUrl));
            Element rootElement = read.getRootElement();

            Element dependenciesEle = rootElement.element("dependencies");

            if (dependenciesEle == null) {
                //System.out.println("dependenciesEle is null:\t" + pomUrl);
                return;
            }
            List<Element> dependencies = dependenciesEle.elements("dependency");
            for (Element dependency : dependencies) {
                String groupId = dependency.element("groupId").getText();
                String artifactId = dependency.element("artifactId").getText();
                String version = dependency.element("version").getText();
                DependencyDTO dependencyDTOTmp = new DependencyDTO(groupId, artifactId, version);
                Element scope = dependency.element("scope");
                if (scope != null) {
                    Object providedValue = scope.getText();
                    if ("test".equals(providedValue)) {
                        System.out.println(depencyName + ",忽略test的依赖:" + dependencyDTOTmp.buildShowName());
                        continue;
                    }
                }
                resolveDependency(dependencyDTOTmp, dependencySet,indicator);
            }
            indicator.setText("递归解析了"+dependencies.size()+"个 依赖");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void downloadIfNotExist(DependencyDTO dependencyDTO,ProgressIndicator indicator) {

        String localFileName = dependencyDTO.buildLocalFileName();
        String localFilePath = thisPluginFilePath + "/" + localFileName;
        try {
            File file = new File(localFilePath);
            if (file.exists()) {
                indicator.setText("本地文件已存在：" + localFilePath);
                System.out.println("本地文件已存在：" + localFilePath);
                return;
            }
            boolean newFile = file.createNewFile();
            if (!newFile) {
                System.out.println("创建缓存文件失败:"+localFilePath);
                return;
            }
            
            //下载文件，缓存到本地
            String downloadUrl = urlPrefix + dependencyDTO.buildMavenJarUrl();
            indicator.setText("开始缓存jar到本地：" + localFileName + " ==> " + localFilePath);
            System.out.println("开始缓存jar到本地：" + localFileName + " ==> " + localFilePath);
            URL url = new URL(downloadUrl);
            ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
            FileOutputStream fos = new FileOutputStream(localFilePath);
            fos.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("下载依赖过程中出现异常:" + localFilePath);
        }
    }
}
