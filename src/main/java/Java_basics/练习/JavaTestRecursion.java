package Java_basics.练习;

import java.util.Scanner;

public class JavaTestRecursion {
    /*
    定义方法（不用jdk提供的方法），计算x的y次方，如2的5次方
     */
    public static int calc(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int a = x;
        for (int i = 1; i <= y-1; i++) {
            a = a * x;
        }
        return a;
    }

    /*
    猜数字游戏：随机生成[0,100]之间的随机数，让用户猜生成的数字，显示猜大了、猜小了，如果猜对了，提示共猜了多少次。
    用Math.random()方法
     */
    public static void calc01() {

        Scanner sn = new Scanner(System.in);
        int count = 1;
        while (true) {
            int a = (int) (Math.random() * 101);
            System.out.println("请猜大小");
            String b = sn.next();
            if (a < 50 && b.equals("小")) {
                System.out.println("猜对了:实际数为"+a);
                System.out.println("共猜了"+count+"次");
                break;
            } else if (a >= 50 && b.equals("大")) {
                System.out.println("猜对了:实际数为"+a);
                System.out.println("共猜了"+count+"次");
                break;
            }else {
                System.out.println("猜错了:实际数为"+a);
                count++;
            }
        }
    }
    /*
    递归实现 计算x的y次方，如2的5次方
     */
    public static int calc02(int x,int y){
        if (y==0){
            return 1;
        }return x*calc02(x,y-1);
    }
    /*
    递归输出n（n=5）到0的整数
     */
    public static int calc03(int n){
        System.out.println(n);
        if (n==0){
            return 0;
        }return calc03(n-1);

    }

    public static void main(String[] args) {
        System.out.println(calc(10, 3));
//        calc01();
        System.out.println(calc02(10,4));
        calc03(5);
    }

}
