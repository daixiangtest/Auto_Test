package Java_basics.练习;

import java.util.Arrays;
import java.util.Scanner;

public class JavaTestCycle {
    public static void main(String[] args) {
        testFor04("abc****sbsb*ake");
        testFor03();
        testFor02();
        testDoWhile();
        testFor01();
        /**
         while实现：输出比i（i=5）小的正整数
         */
//        int i = 5;
//        while (i >= 0) {
//            System.out.println(i);
//            i--;
//        }
        /**
         求1到100之间所有偶数的和
         */
        int a = 1;
        int sum = 0;
        while (a <= 100) {
            if (a % 2 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
        /*
        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
         */

        int con1 = 0;
        int con2 = 0;
        while (true) {
            Scanner sn = new Scanner(System.in);
            System.out.println("请输入整数输入0为结束");
            int num = sn.nextInt();
            if (num > 0) {
                con1 += 1;
            } else if (num < 0) {
                con2 += 1;
            } else {
                System.out.println("正数为" + con1);
                System.out.println("负数为" + con2);
                break;
            }
        }


    }

    /*
    使用do while打印输出[0,200]之间所有能被7整除，但不能被4整除的所有整数，要求每行打印5个，并统计个数
     */
    public static void testDoWhile() {
        int i = 1;
        int count = 0;
        do {
            if (i % 7 == 0 && i % 4 != 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            i++;
        } while (i <= 200);
        System.out.println("\n总个数是" + count);
    }

    /*
    使用for循环循环输入五门课程的成绩，计算平均分
     */
    public static void testFor01() {
        Scanner sn = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "门功课的成绩");
            int a = sn.nextInt();
            sum += a;
        }System.out.println("平均分是：" + sum / 5);
    }

    /*
     *双重for循环实现输出九九乘法表
     */
    public static void testFor02() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    /*
    循环打印等腰三角形
     */
    public static void testFor03() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
    输入带*字符串，把*左移输出，其他字母按原顺序输出，例如输入“as*c*gkl**o*p*h*”，输出*******ascgkloph
     */
    public static void testFor04(String str) {
        char[] strs = str.toCharArray();

        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 1; j < strs.length - i-1; j++) {
                if (strs[j] == '*' && strs[j - 1] != '*') {
                    char a = strs[j];
                    strs[j] = strs[j - 1];
                    strs[j - 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(strs));

    }
}
