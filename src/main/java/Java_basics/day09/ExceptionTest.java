package Java_basics.day09;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExceptionTest {
    public static void main(String[] args) throws CustomizeException {
        //Exception02.testException(); //还没有抛出异常会报错
        Exception03.testEt1();
        Exception03.testEt2();
        CustomizeException ex=new CustomizeException("数据库连接异常");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
        }catch (Exception e){
            throw new CustomizeException("数据库连接异常");
        }
    }
}
