package testCases;
import dataclass.TestDB;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.LogUtil;
import utils.MySqlUtils;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Epic("项目级别")
@Feature("系统级别")
@Story("测试数据库")
public class TestJDBC {
    LogUtil logger=new LogUtil();
    @Test(priority = 1,description = "查询数据库")
    //查询数据库
    public  void testJDBC() throws Exception {
        MySqlUtils ms = null;
        try {
            String sql = "select * from test where name=?";
            ms = new MySqlUtils();
            Object[] obj = {"苹果"};
            ResultSet rs = ms.query(sql, obj);
            ArrayList<TestDB> tbs = new ArrayList<>();
            while (rs.next()) {
                TestDB tb = new TestDB();
                tb.setId(rs.getInt("id"));
                tb.setName(rs.getString("name"));
                tb.setQuarter(rs.getString("quarter"));
                tb.setNum(rs.getInt("number"));
                tbs.add(tb);
            }
            System.out.println(tbs);
            for (TestDB tb : tbs) {
                System.out.println(tb.toString());
            }
            logger.info("数据查询测试执行成功");
        } catch (SQLException e) {
            System.out.println("数据库查询测试执行失败");
            logger.error("数据库查询测试执行失败"+e);
            throw new Exception();
        } finally {
            if (ms != null) {
                ms.close();
            }
        }


    }

    //测试通过数据库的表对象获取数据
    @Test(priority = 2,description = "测试通过数据库的表对象获取数据")
    public void testJDBC02() throws Exception {
        try {
            TestDB td = new TestDB();
            td.setData("苹果");
            System.out.println(td.getNum());
            System.out.println(td.getCount());
            logger.info("数据对象查询测试执行成功");

        } catch (Exception e) {
            System.out.println("数据对象测试执行失败");
            logger.error("数据对象查询测试执行失败");
            throw new Exception(e);
        }
    }

    //增加数据到数据库
    @Test(priority = 3,description = "增加数据到数据库")
    public  void tetsJDBC02() throws Exception {
        MySqlUtils ms = null;
        try{
            String sql = "insert into test (name,quarter,number) values(?,?,?);";
            ms = new MySqlUtils();
            Object[] obs = {"香蕉", 2, 4500};
            int num = ms.dataDml(sql, obs);
            System.out.println(num);
            Assert.assertEquals(1, num);
            logger.info("增加数据库数据测试执行成功");
        } catch (Exception e) {
            System.out.println("增加数据库数据测试执行失败");
            logger.error("增加数据库数据测试失败"+e);
            throw new Exception();
        } finally {
            if (ms != null) {
                ms.close();
            }
        }


    }

    //测试根据字段删除数据
    @Test(priority = 4,description = "增加数据到数据库")
    public void testJDBC04() throws SQLException, IOException, ClassNotFoundException {
        MySqlUtils ms=null;
        try {
            String sql = "delete from test where name=?;";
            ms = new MySqlUtils();
            Object[] obj = {"香蕉"};
            int num = ms.dataDml(sql, obj);
            System.out.println(num);
            Assert.assertTrue(num>=1);
            logger.info("删除数据库数据测试执行成功");
        }catch (Exception e){
            System.out.println("测试失败");
            logger.info("删除数据库数据测试执行成功");
        }finally {
            if (ms != null) {
                ms.close();
            }
        }

    }
}
