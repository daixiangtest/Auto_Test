package Java_basics.day03;

import java.util.Scanner;

public class HomeWork {
    //使用for循环打印200-300的所有偶数
    //使用for循环打印10的阶乘结果
    //10的阶乘   10*9*8*7*6*5*4*3*2*1

    //使用for循环打印如下三角形

    /**
     * ******
     * *****
     * ****
     * ***
     * **
     * *
     */
    public static void main(String[] args) {
        for (int i = 200; i <= 300; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int sum = 1;
        for (int a = 1; a <= 10; a++) {
            sum = sum * a;
            System.out.println(sum);
        }
        for (int i = 6; i > 0; i--) {  //循环控制打印的行数
            for (int j = 1; j <= i; j++) { //内循环控制打印的列数
                System.out.print("*");
            }
            System.out.println("");

        }
        //写一个税费计算器，输入888可退出程序
        /*
            1、工资范围在1-5000元之间的，包括5000元，适用个人所得税税率为0%;
            2、工资范围在5000-8000元之间的，包括8000元，适用个人所得税税率为3%;
            3、工资范围在8000-17000元之间的，包括17000元，适用个人所得税税率为10%;
            4、工资范围在17000-30000元之间的，包括30000元，适用个人所得税税率为20%;
            5、工资范围在30000-40000元之间的，包括40000元，适用个人所得税税率为25%;
            6、工资范围在40000-60000元之间的，包括60000元，适用个人所得税税率为30%;
            7、工资范围在60000-85000元之间的，包括85000元，适用个人所得税税率为35%;
            8、工资范围在85000元以上的，适用个人所得税税率为45%。
        */
        Scanner sc = new Scanner(System.in);
        int shui = 0;
        while (true) {
            System.out.print("请输入你的月薪:");
            int sal = sc.nextInt();
            if (sal <= 5000 && sal > 0) {
                System.out.println(shui);
            } else if ((sal <= 8000)) {
                shui = (int) ((sal - 5000) * 0.03);
            } else if (sal <= 17000) {
                shui = (int) ((sal - 8000) * 0.1 + 3000 * 0.03);
            } else if (sal <= 30000) {
                shui = (int) ((sal - 17000) * 0.2 + 9000 * 0.1 + 3000 * 0.03);
            } else if (sal <=40000) {
                shui = (int) ((sal - 30000) * 0.25 + 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.03);
            } else if (sal<=60000) {
                shui=(int) ((sal-40000)*0.3+10000*0.25+ 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.03);
            } else if (sal<=85000) {
                shui=(int) ((sal-60000)*0.35+20000*0.3+10000*0.25+ 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.03);
            } else {
                shui=(int) ((sal-85000)*0.45+25000*0.35+20000*0.3+10000*0.25+ 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.03);
            }
            System.out.println("您每个月需要交税："+shui+"实际到账工资为"+(sal-shui));
            System.out.println("是否继续计算退出请输入888");
            int a=sc.nextInt();
            if (a==888){
                break;
            }

        }
    }
}
