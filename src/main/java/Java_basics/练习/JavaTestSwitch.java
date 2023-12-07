package Java_basics.练习;

import java.util.Scanner;

public class JavaTestSwitch {
    public static void main(String[] args) {
        lianxi2();
    }
    //周一跑步，周二、三、四打羽毛球，周五游泳，其它休息
    public static void lianxi1(){
        Scanner sn=new Scanner(System.in);
        System.out.println("请问今天是周几");
        int today =sn.nextInt();
        switch (today){
            case 1:
            case 2:
            case 3:
                System.out.println("今天跑步");
                break;
            case 4:
                System.out.println("打羽毛球去");
                break;
            case 5:
                System.out.println("去游泳去");
            default:
                System.out.println("今天休息");
        }
    }
//    输入 2022 年的某个月份和日期，例如 month=4，day=21，经过程序计算，打印出输入的月份和日期是 2022年的第几天：31+28+31+21
    public static void lianxi2(){
        Scanner sn =new Scanner(System.in);
        System.out.println("请输入月份");
        int month=sn.nextInt();
        System.out.println("请输入日期");
        int day=sn.nextInt();
        int num=0;
        switch (month){
            case 1:
                num=day;
                break;
            case 2:
                num=31+day;
                break;
            case 3:
                num=31+28+day;
                break;
            case 4:
                num=31+28+31+day;
                break;
            case 5:
                num=31+28+31+30+day;
                break;
            default:
                System.out.println("结束");
        }
        System.out.println("今天是2022年的第"+num+"天");
    }
}
