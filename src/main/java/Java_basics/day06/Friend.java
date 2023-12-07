package Java_basics.day06;
/**
 *
 * 面向对象：是一种设计思想，一切皆对象，所有的一切客观实物都可以通过代码抽象的描述出来
 * 什么是类：类是某一类事物的声明，对某一类事物进行描述
 * 创建一个类的方法：把静态的东西抽象成属性，把动态的行为抽象成方法
 *
 */
public class Friend {
    String name;
    char sex;
    int age;
    double height;
    double weight;
    String hobby;
    public void yueHui(String didan){
        System.out.println("今天去"+didan+"看电影");
    }
}
