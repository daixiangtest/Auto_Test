package Java_basics.day08;

import Java_basics.day07.AbsTract01;

public class Inc02 extends AbsTract01 implements Inc01,interFace01{//implement 实现接口的功能
    @Override //实习接口的抽象方法
    public String login(String name, String pwd) {
        System.out.println("接口的登录方法");
        return null;
    }

    @Override //实现接口的抽象方法
    public int add(int a, int b) {
        System.out.println("接口的添加方法");
        return 0;
    }

    @Override //实现父类的抽象方法
    public String longin(String user, String pwd) {
        System.out.println("父类的登录方法");
        return null;
    }

    @Override
    public int chen(int a, int b) {
        System.out.println(a+b);
        return 0;
    }

    public static void main(String[] args) {

    }
}
