import java.util.List;

import com.wlk.ideaPlugin.qldebugger.util.ResourcesUtil;
import org.junit.Test;

/**
 * @author 王利康
 * @date 2024/7/9 21:45:56
 */
public class ResourceUtilTest {
    
    @Test
    public void qlExressVersonTest(){
        List<String> qlExpressVersionList = ResourcesUtil.getQLExpressVersionList();
        for (String s : qlExpressVersionList) {
            System.out.println(s);
        }
        
    }
}
