package utils;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.alibaba.fastjson.JSONObject;

import com.alibaba.fastjson.JSON;
import java.io.IOException;



public class JsonPathUtils {
    public static void main(String[] args) throws IOException {
        JsonPathUtils js=new JsonPathUtils();
        String res2 = "{\"code\":\"0\",\"msg\":\"sucess\",\"data\":[{\"username\":\"韧\",\"realname\":\"tester1\",\"sex\":\"1\",\"phone\":\"13800000001\"},{\"username\":\"全栈测试笔记\",\"realname\":\"tester2\",\"sex\":\"1\",\"phone\":\"13800000002\"}]}";
        js.jsonPath(res2,"$.data[0].phone");
        js.jsonData(res2);
    }

    /**
     * 将json字符串转化为json对象返回方便提取其中的value
     * @param json json字符串
     * @return 返回json对象
     */
    public JSONObject jsonData(String json){
        return JSONObject.parseObject(json);
    }

    public Object jsonPath(String json , String jsonpath){
        Object doc= Configuration.defaultConfiguration().jsonProvider().parse(json);
        Object ob= JsonPath.read(doc ,jsonpath);
        return ob;
    }
}
