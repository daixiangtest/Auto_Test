package Java_basics.day02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);//创建一个控制台扫描仪sc;
        System.out.println("请输入第一个数据：");
        int i = sc.nextInt();//sc.nextInt代表接收从控制台输入的整数
        System.out.println("i的值是:" + i);

        System.out.println("请输入第二个数据：");
        double db = sc.nextDouble();//sc.nextInt代表接收从控制台输入的
        System.out.println("db的值是" + db);

        Scanner scstr = new Scanner(System.in);
        System.out.println("请输入第三个数据：");
        String str = scstr.nextLine();//scstr.nextLine()代表从控制台输入字符串
        System.out.println("str的值是" + str);
    }
}
