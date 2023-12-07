package Java_basics.day07;
import java.util.Scanner;
public class AbsTractTest {
    public static void main(String[] args){
        AbsTract02 a2=new AbsTract02();
        AbsTract03 a3=new AbsTract03();
        System.out.println(a2.longin("xiaohua","abcd"));//多态：父类类型指向子类对象，login方法发生了重写
        System.out.println(a3.longin("dahua","abcd1"));//多态：父类类型指向子类对象，login方法发生了重写

        //快速切换
        AbsTract02 a4=new AbsTract02();//a4的值是Abs02的对象，所以a4.login调用的是 Abs02的login方法
        a4.longin("", "");//调用的是 Abs02的login方法
        a4= new AbsTract02();//如果a4的值被覆盖为	Abs03的对象，那么a4.login调用的是	Abs03的login方法
        a4.longin("", "");//a4.login调用的是Abs03的login方法


        //可以通过父类对象来调用子类的方法
        AbsTract01 a5=new AbsTract02();
        //AbsTract01 a6=new AbsTract01(); 抽象类无法直接被调用
        //抽象类的实战应用模拟不同的登录方法
        AbsTract01 a7;

        System.out.println("请输入登录方式");
        Scanner s=new Scanner(System.in);
        String tall=s.nextLine();
        if (tall.equals("用户名登录")){
            a7=new AbsTract02();
            a7.longin("sss","sss");
        }
        else if (tall.equals("手机号登录")){
            a7=new AbsTract03();
            a7.longin("sss","sss");
        }
        else System.out.println("选错了");

    }
}
