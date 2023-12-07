package Java_basics.day02;
import java.util.Scanner;
public class HomeWorkScannerTest {
    // Scanner对象可以将控制输入信息引入到代码变量中
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("西北玄天一片云，请对暗号");
        String ah = sc.nextLine();
        if (ah.equals("乌鸦落进凤凰群")) {
            System.out.println("满桌都是英雄汉，请对第二句");
            ah = sc.nextLine();
            if (ah.equals("谁是君来谁是臣")) {
                System.out.println("暗号正确,请进");
            } else {
                System.out.println("暗号错误，关门");
            }
        } else {
            System.out.println("暗号错误,关门");
        }
    }
}
