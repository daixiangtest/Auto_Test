package Java_basics.day03;

public class Break {
    // 循环打印1到10，跳过5
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int a=i;
            System.out.println("在循环中"+a);
            if (i == 5) {
                continue;
            }
            System.out.println("跳出循环"+a);
        }
    }
}
