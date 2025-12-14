package com.wlk.ideaPlugin.qldebugger.util;

import java.util.*;

import com.alibaba.fastjson.JSONObject;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author 王利康
 * @date 2023/9/24 12:58:24
 */
public class QlExpressUtil {

    public static Object runWithParams(String express, JSONObject params,List<String> errorList) throws Exception {
        if (params == null) {
            params = new JSONObject();
        }

        DefaultContext context = new DefaultContext();
        context.putAll(params);

        ExpressRunner runner = new ExpressRunner(false, true);
        try {
            System.out.println(JSONObject.toJSONString(context));
            Object execute = runner.execute(express, context, errorList, false, true);
            return execute;
        } catch (Exception e) {
            throw e;
        }
    }
}
