package Java_basics.练习;

import java.text.DecimalFormat;
import java.util.Scanner;


public class JavaTest01 {
    public static void main(String[] args) {
//       JavaTest01.isnums();
//        JavaTest01.dengJi();
//        JavaTest01.pingjunChengji();
        JavaTest01.numfanzhuan();
    }

    /*
    练习1：判断输入的值是否是偶数，另外，要处理输入错误
    */
    public static void isnums() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        if (s.hasNextInt()) {
            int num = s.nextInt();
            if (num / 2 == 0) {
                System.out.println(num + ":是偶数");
            } else {
                System.out.println(num + ":是奇数");
            }
        } else {
            System.out.println("请输入正确的整数");
        }
    }

    /*
    输入并输出姓名、年龄、身高
     */
    public static void dengJi() {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入您得姓名");
        String name = sn.next();
        System.out.println("请输入您的年龄");
        int age = sn.nextInt();
        System.out.println("请输入您的身高");
        int high = sn.nextInt();
        System.out.println("您的姓名是：" + name);
        System.out.println("您的年龄是：" + age);
        System.out.println("您的身高是：" + high);
    }

    /*
    练习3：从控制台获取Java、Oracle、HTML三门课程的成绩，计算总分和平均分平均分保留2位小数，要求四舍五入
     */
    public static void pingjunChengji() {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入java的成绩");
        int java1 = sn.nextInt();
        System.out.println("请输入Oracle成绩");
        int oracle = sn.nextInt();
        System.out.println("请输入Html成绩");
        int html = sn.nextInt();
//      获取的值保留两位小数点四舍五入
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("您的平均成绩是：" + df.format((java1 + oracle + html) / 3));
    }
    /*
    练习4：输入一个数字，反转输出，如：输入123，输出321
     */
    public static void numfanzhuan(){
        Scanner sn=new Scanner(System.in);
        System.out.println("请输入一个整数");
        if (sn.hasNextInt()){
            int num=sn.nextInt();
            while (num!=0){
                int res=num%10;
                System.out.print(res);
                num=num/10;
            }
        }else {
            System.out.println("请请输入整数");
        }
    }
}
