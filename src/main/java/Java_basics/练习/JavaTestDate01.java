package Java_basics.练习;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaTestDate01 {
    final String beginDate = "1910-01-01";
    final String pattern="yyyy-MM-dd";
    public static void main(String[] args) throws ParseException {

        String str="1910-01-08";
        JavaTestDate01 js=new JavaTestDate01();
        String a=js.getwaek(str);
        System.out.println(a);
        js.testDate01();
        js.testLastTime();
    }
    /*
    假设1910年1月1日是星期一，请写一个函数：该函数输入为1910年1月1日后的任意一天日期，格式为字符串YYYY-MM-DD，输出为该日期是星期几的英文。
     */
    public String getwaek(String str) throws ParseException {
        DateFormat df=new SimpleDateFormat(pattern); //初始化时间类的对象，格式为“yyyy-mm-dd”
        long date_and=df.parse(str).getTime(); //获取时间的计数器以毫秒为单位
        long date_begin=df.parse(beginDate).getTime();
        long x=Math.abs(date_and-date_begin); //计算时间的差
        long y=x/(1000*60*60*24);//除以一天的毫秒时间
        int a=(int)y%7;
        String a1="";
        switch (a){
            case 0:
                a1= "Monday";
                break;
            case 1:
                a1="Tuesday";
                break;
            case 2:
                a1="Wednesday";
                break;
            case 3:
                a1="Thursday";
                break;
            case 4:
                a1="Friday";
                break;
            case 5:
                a1="Saturday";
                break;
            case 6:
                a1="Sunday";
                break;
        }
        return a1;
    }
    /*
    获取2008年2月有多少天
     */
    public void testDate01(){
        Calendar c=Calendar.getInstance(); //获取时间格式的对象
        System.out.println(c.getTime());  //打印的是当前时间
        c.set(Calendar.YEAR,2008);   //设置时间值年份是2008年
        System.out.println(Calendar.FEBRUARY); //时间月份的常量值，默认值为0
        c.set(Calendar.MONDAY,Calendar.FEBRUARY+1); //月份是是3月，一月至12月，一月的int参数为0
        c.set(Calendar.DATE,1); // 日期为1号
        System.out.println(c.getTime());  //Sat Mar 01 14:51:15 CST 2008  打印时间是2008年的3月1日的当前时间
        c.add(Calendar.DATE,-1); //将日期往前翻一天就是2月的最后一天
        System.out.println(c.getTime());  //Fri Feb 29 14:51:15 CST 2008 打印出是2018年的2月29日
        System.out.println(c.get(Calendar.DATE));  //29 取出日期的数字
    }
    /*
    实现一个方法：打印昨天的当前时刻
     */
    public void testLastTime(){
        Calendar ca= Calendar.getInstance();//创建对象获取当前时间
        ca.set(Calendar.DATE,-1);//当前时间往前翻一天
        Date date=ca.getTime();
        System.out.println(date);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//规范时间格式
        String lasttime=sf.format(date); //将时间格式转化为字符串中的规定格式
        System.out.println(lasttime);
        System.out.println(ca.getTime());

    }
}
