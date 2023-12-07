package Java_basics.day07;

/**
 * 抽象方法：由abstract修饰，没有方法体。只有声明方法，不实现方法
 * 抽象类：由abstract修饰的类，称为抽象类
 * 1、抽象类中可以有抽象方法和普通方法
 * 2、一个类可以继承抽象类，一旦继承必须实现(重写)抽象类中所有的抽象方法
 */
public abstract class AbsTract01 {
    public AbsTract01() {
    } //方法名与类名一致时为类名的构造方法构造方法被子类继承时需要再子类中申请构造方法，使用super（）可以通过子类来调用父类中的构造方法

    //修饰一个抽象类的类  抽象类无法实例化对象
    public abstract String longin(String user, String pwd);//抽象类的方法没有函数体

    public int num(int a, int b) {
        return a + b;
    }

    public void sleep() {
        System.out.println("上班必须睡觉");
    }
}
