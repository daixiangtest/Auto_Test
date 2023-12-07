package Java_basics.day07;
/**
 * 1、 A类extends B类，代表子类继承父类的属性和方法，A为子类，B为父类
 2、一个类只能继承一个父类。（一个父类可以有多个子类）
 3、子类能够访问父类的属性和方法，但父类不能访问子类的属性和方法，
 子类之间也不能相互访问。
 */
public class EmpPerson {
    private String name;
    private int age;
    private String sex;
    public static void eat(){
        System.out.println("喜欢吃香蕉");
    }
    public  void sleep(){
        System.out.println("喜欢睡觉sp");
    }
    public String getName(){return name;}
    public String getSex(){return sex;}
    public int getAge(){return age;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setSex(String sex){this.sex=sex;}
}
