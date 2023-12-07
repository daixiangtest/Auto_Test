package Java_basics.day09;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exception04 {
    public static void testEx01() throws Exception {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
        }catch (Exception e){
            System.out.println("出现了异常后面还有");
            e.printStackTrace();
            throw new Exception(); //处理异常后又提起异常
        }finally {
            System.out.println("这是最后运行"); //finally 里面的语句不管有没有异常都会最后执行
        }
    }
    public static void testEx02(){
        try {
            System.out.println("没有异常");
        } catch (Exception e) {
            System.out.println("出现了异常");

        }finally {
            System.out.println("运行最后的");
        }
    }

    public static void main(String[] args) throws Exception {
        testEx01();//出现异常后运行了finally
        testEx02();//没有出现异常运行了finally
    }
}
