import com.alibaba.fastjson.JSONObject;

import com.wlk.ideaPlugin.qldebugger.persistence.QLTestConfigSetting;
import org.junit.Test;

/**
 * @author 奈昕
 * @date 2023/12/23 15:10:53
 */
public class JSONTest {

    @Test
    public void jTest(){

        QLTestConfigSetting qlTestConfigSetting = new QLTestConfigSetting();
        JSONObject configJsonContent = new JSONObject();
        configJsonContent.put("k1","v2");
        qlTestConfigSetting.setConfigJsonContent(configJsonContent);
        System.out.println(qlTestConfigSetting);
        System.out.println(JSONObject.toJSONString(qlTestConfigSetting));
        System.out.println(qlTestConfigSetting);
        System.out.println(JSONObject.toJSONString(qlTestConfigSetting));

    }
}
