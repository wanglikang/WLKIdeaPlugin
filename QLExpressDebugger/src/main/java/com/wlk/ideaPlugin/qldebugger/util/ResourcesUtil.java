package com.wlk.ideaPlugin.qldebugger.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.google.common.collect.Lists;
import com.wlk.ideaPlugin.qldebugger.window.QlPanel;

/**
 * @author 王利康
 * @date 2023/9/24 22:46:03
 */
public class ResourcesUtil {

    public static String readFromSource(String sourcePath){
        try {
            InputStream resourceAsStream = QlPanel.class.getClassLoader().getResourceAsStream(sourcePath);
            BufferedReader sourceReader = new BufferedReader(new InputStreamReader(resourceAsStream));
            StringBuilder sb = new StringBuilder();
            while (sourceReader.ready()) {
                sb.append(sourceReader.readLine()).append('\n');
            }
            return sb.toString();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }

    public static List<String> versionList ;

    //public static List<String> parseQLExpressVersion(){
    //    List<String> versionList = new ArrayList<>();
    //    String mavenMetadataURL = "https://repo1.maven.org/maven2/com/alibaba/QLExpress/maven-metadata.xml";
    //    try {
    //        //XMLInputFactory factory = XMLInputFactory.newInstance();
    //        //FileInputStream fileInputStream = new FileInputStream(new File(new URL(mavenMetadataURL).toURI()));
    //        //XMLStreamReader reader = factory.createXMLStreamReader(fileInputStream);
    //        //int attributeCount = reader.getAttributeCount();
    //        //System.out.println(attributeCount);
    //        
    //        SAXReader saxReader = new SAXReader();
    //        Document read = saxReader.read(new URL(mavenMetadataURL));
    //        Element rootElement = read.getRootElement();
    //
    //        Element versioning = rootElement.element("versioning");
    //
    //        if (versioning == null) {
    //            System.out.println("dependenciesEle is null:\t" + mavenMetadataURL);
    //            return versionList;
    //        }
    //
    //        Element versionsEle = versioning.element("versions");
    //        List<Element> versions = versionsEle.elements("version");
    //        for (Element version : versions) {
    //            String text = version.getText();
    //            versionList.add(text);
    //        }
    //    } catch (Exception e) {
    //        e.printStackTrace();
    //    }
    //    versionList.sort(Comparator.reverseOrder());
    //    return  versionList;
    //}

    public static List<String> parseQLExpressVersion(){
        
        //先写死
        return Lists.newArrayList(
            "3.3.3",
            "3.3.2",
            "3.3.1",
            "3.3.0",
            "3.2.7",
            "3.2.6",
            "3.2.5",
            "3.2.4",
            "3.2.3",
            "3.2.2",
            "3.2.0",
            "3.1.7");
    }

    public static List<String> getQLExpressVersionList(){
        if(versionList == null) {
            synchronized (ResourcesUtil.class) {
                if (versionList == null) {
                    versionList = parseQLExpressVersion();
                }
            }
        }
        return versionList;
    }
}
