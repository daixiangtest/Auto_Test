package Java_basics.day02;
import java.util.Random;
import java.util.Scanner;

//设计一个猜大小程序，可以通过Scanner工具输入压注金额、大或者小；如果猜中给双倍奖金，如果猜错输压注金额
public class HomeWorkRandom {
    public static void main(String[] args) {
        Random ra = new Random();   //获取随机
        int i = ra.nextInt(16) + 3;
        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额");
        int in = sc.nextInt();  //引入控制台输入的值
        System.out.println("请选择大小");
        Scanner sa = new Scanner(System.in);
        String st = sa.nextLine();
        System.out.println(st);
        if (i > 10 && st.equals("大")) {
            System.out.println("猜对了");
        } else if (i<10 && st.equals("小")) {System.out.println("擦对了就是小");

        }else {
            System.out.println("猜错了");
        }

    }
}