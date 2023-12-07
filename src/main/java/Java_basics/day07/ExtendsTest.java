package Java_basics.day07;
/**
 *
 * 重写：发生在父子类之间，子类继承父类，子类和父类拥有相同的方法名，参数列表和返回值，这种现象称为 方法重写或方法覆盖。
 *
 * 多态：前提条件：1、发生在父子类之间
 *             2、父类类型指向子类对象       父类    a = new 子类();
 *             3、调用方法时发生了重写
 *  多态是一种现象，当上面这三个条件同时发生时，我们称之为发生了多态
 */
public class ExtendsTest {
    public static void main(String[] args) {
        AbsTract02 ab02=new AbsTract02(); //子类和父类都有sleep方法,会先找子类的方法找不到会掉父类
        ab02.sleep();
        EmpPerson em=new EmpPerson();
        em.sleep();//父类只能调用父类方法无法用子类的

        //父类方法指向子类对象
        EmpPerson em1=new Emp();
        em1.sleep();  //调用的是emp的方法


    }

}
