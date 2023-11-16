package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
/**
获取配置文件的信息封装
 */
public class GetProperties {
    /**
     * 获取MySQL配置文件的信息
     * @param key  字段名
     * @return 对应的值
     * @throws IOException 异常
     */
    public  String getMysql(String key) throws IOException {
        try{
            Properties pts = new Properties();
            //通过绝对路径获取配置文件的文件流
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/configs/mysqldb.properties"));
            pts.load(bufferedReader);
            return pts.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e+"获取MySQL配置信息失败");
        }
    }

    public static void main(String[] args) throws IOException {
        GetProperties gp=new GetProperties();
        System.out.println(gp.getMysql("driver"));
    }
}
