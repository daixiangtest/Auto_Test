package Java_basics.day03;
/**
 *
 * while循环：条件成立，语句块会一直重复循环运行
 * while(条件表达式){
 * 语句块
 * }
 *
 */
public class While_test {
    public static void main(String[] args) {

        //打印1-100的数字
        int i=1;
        while(i<=100){//每轮循环结束后从本行开始重新执行，直到条件不符合为止
            System.out.println(i);
            i++;
        }

        //打印1-100的偶数
        i=1;
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        //打印1-2020年所有闰年

        i=1;
        while(i<=2020){
            if((i%4==0 && i%100!=0) || i%400==0){
                System.out.println(i+"是闰年");
            }
            i++;
        }

        //统计1-100有多少偶数
        i=1;
        int count=0;//自定义一个变量去计数
        while(i<=100){//2,4,6
            if(i%2==0){
                count=count+1;//1,2,3
            }
            i++;
        }
        System.out.println(count);


        //统计1-2020年有多少个闰年
        i=1;
        count=0;
        while(i<=2020){
            if((i%4==0 && i%100!=0) || i%400==0){
                count++;//相当于count = count+1
            }
            i++;
        }
        System.out.println(count);//490


        //倒序打印1-100的整数
        i=100;
        while(i>=1){
            System.out.println(i);
            i--;
        }

        //打印1-100的偶数的和
        i=1;
        int sum=0;
        while(i<=100){//2,4,6,8
            if(i%2==0){
                sum+=i;//2,6,12,20
            }
            i++;
        }
        System.out.println("1-100偶数和为："+sum);


        //打印1-100的奇数的和
        i=1;
        sum=0;
        while(i<=100){//1,3
            if(i%2==1){
                sum=sum+i;//1,4
            }
            i++;
        }
        System.out.println("1-100奇数和为："+sum);



    }
}
