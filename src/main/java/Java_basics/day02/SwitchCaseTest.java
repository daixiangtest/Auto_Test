package Java_basics.day02;

import java.util.Scanner;

/**
 *
 * case的数量可以增加，
 * switch()这个括号里面的值和哪个case后面的值对应,就运行哪个case;如果全部都对应不上就运行default:后面的代码
 *
 */


public class SwitchCaseTest {
    public static void main(String[] args){
        System.out.println("请输入季度需要大写");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        switch (a){     //相当于if语句的条件
            case "一":
                System.out.println(a+"季度包括1、2、3月份");//判断a是否等于“一”条件满足执行后面语
            break;    //结束使用break
            case "二":
                System.out.println(a+"季度包括4、5、6月份");
                break;
            case "三":
                System.out.println(a+"季度包括7、8、9月份");
                break;
            case "四":
                System.out.println(a+"季度包括10、11、12月份");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
