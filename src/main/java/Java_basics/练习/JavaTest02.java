package Java_basics.练习;

import java.util.Scanner;

public class JavaTest02 {
    public static void main(String[] args) {
//        JavaTest02.maxMin();
        JavaTest02.tianQi();

    }

    /*
    提示用户输入三个整数，判断并输出最大值、最小值
     */
    public static void maxMin() {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sn.nextInt();
        System.out.println("请输入第二个整数");
        int b = sn.nextInt();
        System.out.println("请输入第三个整数");
        int c = sn.nextInt();
        int[] nums = {a, b, c};
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 2; j++)
                if (nums[j] < nums[j + 1]) {
                    int d = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = d;
                }
        }
        System.out.println("最大值是：" + nums[0]);
        System.out.println("最小值是" + nums[2]);
    }

    /*
    如果今天是周日且晴天，就出去嗨
    如果今天是周日但不是晴天，睡懒觉
    如果今天不是周日，继续996
     */
    public static void tianQi() {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入今天周几");
        String day = sn.next();
        System.out.println("请输入天气");
        String tianqi = sn.next();
        if (day.equals("周日")) {
            if (tianqi.equals("晴天")) {
                System.out.println("出去嗨");
            } else {
                System.out.println("睡懒觉");
            }
        } else {
            System.out.println("继续996");
        }
    }
}
