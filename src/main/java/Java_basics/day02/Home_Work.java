package Java_basics.day02;

import java.util.Scanner;

public class Home_Work {
    public static void main(String[] args) {
        //输入一个整数，判断是否是奇数，且被3整除
        System.out.println("请输入整数");
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        if(i%2==1 && i%3==0){
            System.out.println(i+"符合要求");
        }else{
            System.out.println(i+"不符合要求");
        }


        //输入一个年份判断是否是闰年(4的倍数的，且不是100的倍数,或者400的倍数是世纪闰年)

        System.out.println("请输入年数");
//        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"是平年");
        }

        //输入身高和体重，判断BMI标准     (体重KG/(身高*身高M))
        double s=1.60;
        double t=50;
        double bmi=t/(s*s);
        System.out.println("bmi值是："+bmi);
        if(bmi<18.5){
            System.out.println("体重过低");
        }else if(bmi>=18.5 && bmi<24){
            System.out.println("正常范围");
        }else if(bmi>=24 && bmi<27){
            System.out.println("肥胖前期");
        }else if(bmi>=27 && bmi<30){
            System.out.println("1级肥胖");
        }else if(bmi>=30 && bmi<40){
            System.out.println("2级肥胖");
        }else if(bmi>=40){
            System.out.println("3级肥胖");
        }else{
            System.out.println("输入有误");
        }




    }
}
