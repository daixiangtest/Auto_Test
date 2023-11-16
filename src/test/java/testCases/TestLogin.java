package testCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import requests.RequestLogin;
import utils.ExcelUtil;
import utils.JsonPathUtils;
import utils.LogUtil;

import java.io.IOException;
import java.rmi.AccessException;
import java.util.Map;

//@Epics(value = @Epic(value = "總項目項目"))  //多个项目时可以这样进行分类
@Epic("项目级别")
@Feature("共享算力系统")
@Story("登录模块")
public class TestLogin {
    LogUtil lu = new LogUtil();
    JsonPathUtils jp = new JsonPathUtils();
    ExcelUtil eu = new ExcelUtil();
    int a = 0;
    int count = 0;

    @DataProvider  //获取Excel中的数据
    @Step("获取测试数据")
    public Object[] getLoginData() {
        return eu.getData("./src/datas/login_data.xlsx", "sheet1");
    }

    /**
     * testng 测试登录模块的验证码接口
     *
     * @param map 测试数据从Excel表中获取
     * @throws IOException 异常处理
     */
    @Test(dataProvider = "getLoginData", priority = 9,description = "输入验证码接口") //对数据进行参数化处理执行
    @Severity(value = SeverityLevel.BLOCKER) //设置bug的级别
    @Description("描述测试用例的说明")
    @Attachment("src/test/resources/interface_document.xlsx")
    @Issue("BUG号：123")
    @Link("https://www.jianshu.com/p/1424f50a38b8")
    public void send(Map<String, String> map) throws IOException {
        count++;
        Allure.description("获取验证码测试"+count);
        Allure.link("www.baidu,com");

        try {
            String login = RequestLogin.send(map.get("callCoding"), map.get("phoneNuber"));
            String code = jp.jsonData(login).getString("code");
            eu.setData("./src/datas/login_data.xlsx", "sheet1", "code", count, code);
            Assert.assertEquals(code, "200");
            lu.info("验证测试执行成功");
        } catch (AssertionError e) {
            lu.error("测试失败：" + e);
            throw new AccessException("断言失败");
        }
    }


    int count1 = 0;

    /**
     * testng测试登录模块的登录接口
     *
     * @param map 测试数据从Excel表格中获取
     */

    @Test(dataProvider = "getLoginData", priority = 10,description = "登录接口测试")
    @Severity(value = SeverityLevel.BLOCKER) //设置bug的级别
    @Description("这是一个登录接口例子")
    @Attachment("src/test/resources/interface_document.xlsx")
    @Issue("BUG号：124")
    @Link("https://www.jianshu.com/p/1424f50a38b8")
    public void login(Map<String, String> map) {
        count1++;
        Allure.description("登录接口测试"+count1);
        try {
            String res = RequestLogin.login(map.get("callCoding"), map.get("phoneNuber"), map.get("validateCode"));
            String data = jp.jsonData(res).getString("data");
            eu.setData("./src/datas/login_data.xlsx", "sheet1", "login", count1, data);
            Assert.assertEquals(jp.jsonData(res).getString("code"), "200");
            lu.info("登录测试执行成功");
        } catch (IOException e) {
            lu.error("登录测试执行失败" + e);
            throw new RuntimeException(e);
        }
    }
}
