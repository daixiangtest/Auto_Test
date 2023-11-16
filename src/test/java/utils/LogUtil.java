package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogUtil {

    Logger logger;

    /**
     * 输出log日志的对象封装
     */
    public LogUtil(){
        //    第一步：读取配置文件根据配置文件规定的输入格式，存放路径等信息来操控log日志记录
        PropertyConfigurator.configure("src/configs/logs.properties");
        //        第二部：创建当前类的logger对象
        this.logger = Logger.getLogger(LogUtil.class);
    }
    //        第三步：使用logger的日志级别
    public void info(String value){logger.info(value);}
    public void debug(String value){logger.debug(value);}
    public void warn(String value){logger.warn(value);}
    public void error(String value){logger.error(value);}
    public static void main(String[] args) {
       LogUtil lu=new LogUtil();
       lu.info("成功的案例   111");
        PropertyConfigurator.configure("src/configs/logs.properties");
//        第二部：创建当前类的logger对象
        Logger logger = Logger.getLogger(LogUtil.class);
//        第三步：使用logger的日志级别
        logger.debug("debug级别");
        logger.info("info级别");
        logger.warn("warn警告级别");
        logger.error("error级别");
    }
}
