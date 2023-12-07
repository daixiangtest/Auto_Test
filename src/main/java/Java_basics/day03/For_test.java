package Java_basics.day03;
/**
 *
 * for循环
 * for(表达式1;表达式2;表达式3){
 * 语句块
 * }
 *
 */
public class For_test {
    public static void main(String[] args) {
    //打印1-100的整数
    int j = 1;
    while(j<=100){
        System.out.println(j);
        j++;
    }

    //使用for循环打印1-100的整数
    //1、最先运行int i=1，且在整个循环里面只运行一次
    //2、运行i<=100   进行条件判断
    //3、运行所有语句块内容   System.out.println(i)
    //4、运行i++
    //往后开始重复运行第2、3、4步骤，直到第二步条件判断不满足为止
    for(int i=1;i<=100;i++){
        System.out.println(i);
    }


    //打印1-100的偶数
    for(int i=1;i<=100;i++){//这个i是在for循环的作用域下声明的，只在本作用域有效
        if(i%2==0){
            System.out.println(i+"是偶数");
        }
    }

    //打印1-2020年有哪些闰年
    for(int i=1;i<=2020;i++){
        if((i%4==0 && i%100!=0) || i%400==0){
            System.out.println(i+"是闰年");
        }

    }


    //统计1-2020年有多少个闰年
    int count=0;
    for(int i=1;i<=2020;i++){
        if((i%4==0 && i%100!=0) || i%400==0){
            count = count+1;
        }
    }
    System.out.println(count);


    //打印1-100的和
    int sum=0;
    for(int i =1;i<=100;i++){
        sum=sum+i;
    }
    System.out.println(sum);

    //打印1-100的奇数倒序
    for(int i=100;i>=1;i--){
        if(i%2==1){
            System.out.println(i+"是奇数");
        }
    }


}
}
