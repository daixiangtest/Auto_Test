package Java_basics.day08;

/**
 * 抽象类：由abstract修饰的类，称为抽象类，只能有抽象方法和普通方法
 * 接口：接口用 interface修饰，在jdk1.7版本中接口中只能存在抽象方法。1.8以及往后的版本中接口可以存在静态方法、抽象方法
 * 1、接口不能实例化。(不能用 new 接口名()创建对象)
 * 2、一个类实现一个接口时，必须实现接口中所有的抽象方法
 * 3、一个类只能继承一个父类，但是可以实现多个接口
 */
/////声明一个接口
public interface Inc01 { //这是一个接口Java中的接口可以理解为一个特殊的抽象类
    public abstract String login(String name, String pwd);//接口中声明一个抽象方法没有函数体

    public abstract int add(int a, int b);

    public static int jian(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }
}
