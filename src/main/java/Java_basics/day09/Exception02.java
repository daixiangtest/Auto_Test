package Java_basics.day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 异常：分为运行时异常和非运行异常
 * 非运行时异常（非RuntimeException）   ：代码即便没有问题，编译也会报错
 * java认为有很多代码是高风险代码，所以针对这些代码必须提前去进行   声明  或者进行 处理
 * 非运行时异常代码运行前都需要进行处理，处理方式有两种
 * 处理方式1：
 * 声明：在方法后使用throws声明该类可能会出现异常
 * 如果使用throws声明异常，当其它调用方去调这个方法时还需要再次对异常进行声明或者处理
 */
public class Exception02 {
    //throws ClassNotFoundException 声明调用这个方法很有可能出现找不到类的异常
    public static void testException() throws SQLException, ClassNotFoundException {
        //加载数据库连接的驱动，这行代码运行时非常容易出现找不到类异常  ClassNotFoundException
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //通过 数据库服务器的  IP地址   端口号     用户名     密码  连接数据库，比较容易出现SQL语句异常  SQLException
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
    }

}
