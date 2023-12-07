package Java_basics.day03;
/**
 *
 * do....while循环:不管条件是否成立，先执行一次语句块内容，再进行判断
 *do{
 *语句块
 *}while(条件);
 *
 */
public class DoWhile_test {
    public static void main(String[] args) {


        //打印1-100的整数
        int i=1;
        do{//第一次循环，不进行判断
            System.out.println(i);
            i++;
        }while(i>=100);//先执行一次，再判断条件是否成立，如果成立就从do开始再执行一次


        //打印1-100的偶数
        i=1;
        do{
            if(i%2==0){
                System.out.println(i+"是偶数");
            }
            i++;
        }while(i<=100);

        //使用do....while打印1-2020所有闰年
        int a=1;
        do{
            if((a%4==0 && a%100!=0) || a%400==0){
                System.out.println(a+"是闰年");
            }
            a++;
        }while(a<=2020);


        //打印1-100整数的和
        a=1;
        int sum=0;
        do{
            sum=sum+a;
            a++;
        }while(a<=100);
        System.out.println(sum);

        //打印1-100的倒序排列
        a=100;
        do{
            System.out.println(a);
            a--;
        }while(a>=1);

        //打印1-100偶数的和
        a=1;
        sum=0;
        do{
            if(a%2==0){
                sum=sum+a;
            }
            a++;
        }while(a<=100);
        System.out.println(sum);
        //打印1-100奇数的和
        a=1;
        sum=0;
        do{
            if(a%2==1){
                sum=sum+a;
            }
            a++;
        }while(a<=100);
        System.out.println(sum);



    }
}
