package testCases;
import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.RunFiles;
import utils.JsonPathUtils;
import utils.LogUtil;

import java.awt.*;
import java.io.IOException;
import java.rmi.AccessException;


@Epic("项目级别")
@Feature("共享算力系统")
@Story("运行文件模块")
public class TestRunFIles {

    RunFiles rf = new RunFiles("+86", "18326447662", "000000");
    JsonPathUtils jsp = new JsonPathUtils();
    LogUtil lg=new LogUtil();
    @Test( priority = 5, description = "文件上传接口")
    public void testUploadScript() throws IOException {
        try{
            String res = rf.uploadScript("./src/datas/files/test01.py");
            System.out.println(res);
            int code = (int) jsp.jsonData(res).get("code");
            Assert.assertEquals(code, 200);
            lg.info("文件上传接口测试成功");
        } catch (AssertionError e) {
            lg.error("文件上传接口测试失败");
            throw new AccessException("文件上传接口测试失败"+e);
        }

    }

    @Test(priority = 6, description = "文件运行接口")
    public void testComputePower() throws IOException {
        try{
            String res = rf.computePower(rf.cid);
            String message = jsp.jsonData(res).getString("message");
            Assert.assertEquals(message, "success");
            lg.info("文件运行接口测试成功");
        } catch (AssertionError e) {
            lg.error("文件运行接口测试失败");
            throw new AccessException("文件运行接口测试成功"+e);
        }

    }

    @Test(priority = 7, description = "查看接口的运行状态")
    public void testScriptInfo() {
        try{
            String res = rf.scriptInfo(rf.sid);
            System.out.println(res);
            int State = (int) jsp.jsonPath(res, "$.data.executeState");
            Assert.assertEquals(State, 2);
            lg.info("查看接口的运行状态测试成功");
        } catch (Exception e) {
            lg.error("查看接口的运行状态测试失败");
            throw new RuntimeException(e);
        }

    }

    @Test(priority = 8, description = "查看账户中文件运行状态的接口",timeOut = 60000)
    public void testScriptList() {
        Allure.description("主要测试接口运行文件中的内容需要多长时间可以出结果，设定接口要在60秒内运行出文件内容才算测试通过");
        try{
            while (true) {
                String res = rf.scripList(1, 10);
                int state = (int) jsp.jsonPath(res, "$.data.list[0].executeState");
                Assert.assertEquals(jsp.jsonData(res).get("code"), 200);
                if (state == 2) {
                    Assert.assertTrue(true);
                    lg.info("查看账户中文件运行状态的接口测试成功");
                    break;
                }
                Thread.sleep(3000);
            }
        }catch (AssertionError e){
            lg.error("查看账户中文件运行状态的接口测试失败");
            throw new AssertionError("查看账户中文件运行状态的接口测试失败"+e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
