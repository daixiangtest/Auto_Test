package Java_basics.day03;
/**
 *
 * 循环嵌套
 * for(表达式1;表达式2;表达式3){
 *     for(表达式1;表达式2;表达式3){
 *     }
 * }
 *
 */
public class For_test2 {
    public static void main(String[] args) {


        //print 不换行打印
        //println  换行打印
        //System.out.print(1111);
        //System.out.println(2222);
        //使用print打印4行，每行有5个*号
//第一次大循环 i=1    第一次小循环j=1	  第二次小循环j=2  第三次小循环j=3  第四次小循环j=4  第五次小循环j=5
//第二次大循环 i=2  第一次小循环j=1 第二次小循环j=2 第三次小循环j=3 第四次小循环j=4 第五次小循环j=5
//第三次大循环 i=3  第一次小循环j=1 第二次小循环j=2 第三次小循环j=3 第四次小循环j=4 第五次小循环j=5
//第三次大循环 i=4  第一次小循环j=1 第二次小循环j=2 第三次小循环j=3 第四次小循环j=4 第五次小循环j=5
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //打印一个5行5列的直角三角形
        /*
         *
         **
         ***
         ****
         *****
         */

        for(int i=1;i<=5;i++){    //i的值为  1    2     3       4          5
            for(int j=1;j<=i;j++){//j的值为  1    1,2   1,2,3   1,2,3,4    1,2,3,4,5
                System.out.print("*");
            }
            System.out.println("");
        }

        //打印乘法口诀表
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+" ");
            }
            System.out.println("");
        }



    }
}
