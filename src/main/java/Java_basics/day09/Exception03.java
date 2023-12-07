package Java_basics.day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 异常：分为运行时异常和非运行异常
 * 非运行时异常（非RuntimeException）   ：代码即便没有问题，编译也会报错
 * java认为有很多代码是高风险代码，所以针对这些代码必须提前去进行   声明  或者进行 处理
 *非运行时异常代码运行前都需要进行处理，处理方式有两种
 *处理：发生了异常后怎么办？
 *处理方式2：
 *    try{
 *    //代码
 *
 *    }catch(异常对象){
 *    //处理方式
 *
 *    }
 *
 *    执行try中的代码，如果catch到异常，进行处理
 *
 *    使用try....catch去处理异常时，调用方不需要再次去进行处理
 *    使用try....catch去处理异常时，会将所有try的代码都运行
 *
 */

public class Exception03 {
    public static void testEt1(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {//如果出现了找不类异常，就运行后面大括号的代码
            System.out.println("出现异常");
            e.printStackTrace();//打印堆栈信息
        }
        try {
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
        }catch (SQLException e){
            System.out.println("sql异常");
            e.printStackTrace();
        }
    }
    public static void testEt2(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
        } catch (SQLException | ClassNotFoundException e) { //处理不同的异常时使用  | 进行拼接
            System.out.println("处理多个异常");
        }
    }
    public static void testEt3(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
        }catch (Exception e){
            System.out.println("处理所有的异常");
        }
    }


}
