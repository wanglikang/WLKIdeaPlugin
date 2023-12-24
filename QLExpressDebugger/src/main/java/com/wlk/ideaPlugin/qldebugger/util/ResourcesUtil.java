package com.wlk.ideaPlugin.qldebugger.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.wlk.ideaPlugin.qldebugger.window.QlPanel;

/**
 * @author 奈昕
 * @date 2023/9/24 22:46:03
 */
public class ResourcesUtil {

    public static String readFromSource(String sourcePath){
        try {
            InputStream resourceAsStream = QlPanel.class.getClassLoader().getResourceAsStream(sourcePath);
            BufferedReader sourceReader = new BufferedReader(new InputStreamReader(resourceAsStream));
            StringBuilder sb = new StringBuilder();
            while (sourceReader.ready()) {
                sb.append( sourceReader.readLine()+'\n');
            }
            return sb.toString();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
