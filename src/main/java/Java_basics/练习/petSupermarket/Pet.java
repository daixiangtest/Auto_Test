package Java_basics.练习.petSupermarket;

import java.util.Scanner;

/**
 * 【练习面向对象】编写一个宠物超市
 * 乌龟
 * 	按大小定价
 * 		大（TORTOISE_BIG）：￥50，对应的name属性值是猪鼻龟
 * 		小（TORTOISE_SMALL）：￥30，对应的name属性值是金钱龟
 *
 * 金鱼
 * 	按品种定价
 * 		品种A（GOLDFISH_A）：￥10，对应的name属性值是红龙眼金鱼
 * 		品种B（GOLDFISH_B）：￥20，对应的name属性值是紫龙睛金鱼
 *
 *
 * 要求：
 * 1、定义宠物抽象类；
 * 	属性：name
 * 	方法：calcPrice
 * 2、定义乌龟(Tortoise)、金鱼类(GoldFish)，继承抽象类，实现抽象方法（本宠物总价计算：单价 * 数量）
 *
 * 3、定义客户类(Customer) ：name，phone
 *
 * 4、定义超时入口类（Test），根据提示，用户选择宠物、对应宠物种类、输入购买数量，最后列出用户购买清单及总价
 */
abstract class Pet {
    String name;
    public abstract void calcPrice();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class TestPet{ //测试类
    public static void  cacl(Pet pet){
        pet.calcPrice();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********欢迎来到宠物超市********");
        System.out.print("请输入您的姓名：");
        String name= sc.next();
        System.out.print("请输入您的手机号:");
        String phone=sc.next();
        Customer ct=new Customer(name,phone);
        int numbers1=0;
        int sum1=0;
        String type1=null;
        int numbers2=0;
        int sum2=0;
        String type2=null;
        int numbers3=0;
        int sum3=0;
        String type3=null;
        int numbers4=0;
        int sum4=0;
        String type4=null;
        while(true){
            System.out.println("--------------------------------");
            System.out.println("请选择要购买的宠物（1，金鱼， 2，乌龟 0，退出）");
            int a=sc.nextInt();
            if (a==0){
                System.out.println("客户【"+name+"】，您选择的宠物如下：");
                System.out.println("宠物名      数量    宠物总价");
                System.out.println("--------------------------------");
                System.out.println(type1+"\t"+numbers1+"\t  "+sum1);
                System.out.println(type2+"\t"+numbers2+"\t  "+sum2);
                System.out.println(type3+"  \t"+numbers3+"\t  "+sum3);
                System.out.println(type4+"  \t"+numbers4+"\t  "+sum4);
                System.out.println("--------------------------------");
                System.out.println("总价为："+(sum1+sum2+sum3+sum4));
                System.out.println("************谢谢惠顾***********");
                break;
            }
            String aa=null;
            if (a==1){aa="(1,红龙眼金鱼  2,紫龙眼金鱼)";}
            if (a==2){aa="(1,猪鼻龟   2,金钱龟)";}
            System.out.println("请选择种类:"+aa);
            int b=sc.nextInt();
            if ((b!=1)&&(b!=2)){
                System.out.println("输入有误");
                continue;
            }
            System.out.println("请输入需要购买的数量");
            int number=sc.nextInt();
            if (a==1){
                GoldFish gf=new GoldFish();
                if (b==1){
                    gf.setType("红龙眼金鱼");
                    gf.setNumber(number);
                    type1= gf.getType();
                    numbers1+=gf.getNumber();
                    cacl(gf);
                    int moeney1= gf.getMoeney();

                    sum1+=moeney1;
                }else {
                    gf.setType("紫龙眼金鱼");
                    type2= gf.getType();
                    gf.setNumber(number);
                    numbers2+=gf.getNumber();
                    cacl(gf);
                    int moeney2= gf.getMoeney();
                    sum2+=moeney2;
                }
            }
            if (a==2){
                Tortoise tt=new Tortoise();
                if (b==1){
                    tt.setType("猪鼻龟");
                    type3= tt.getType();
                    tt.setNumber(number);
                    numbers3+=tt.getNumber();
                    cacl(tt);
                    int moeney3= tt.getMoeney();
                    sum3+=moeney3;
                }else {
                    tt.setType("金钱龟");
                    type4= tt.getType();
                    tt.setNumber(number);
                    numbers4+=tt.getNumber();
                    cacl(tt);
                    int moeney4= tt.getMoeney();
                    sum4+=moeney4;
                }
            }

        }
    }
}