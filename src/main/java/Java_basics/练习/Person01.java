package Java_basics.练习;

/**
 * 构造方法、this、方法重载
 * 定义一个类（三个属性），三参构造方法中，调用两参构造方法
 */
public class Person01 {
    private String name;
    private int age;
    private String phone;
    public Person01(){}
    public Person01(String name){
        this.name=name;
    }
    public Person01(int age,String phone){
        this.age=age;
        this.phone=phone;
    }

    public void study(){
        System.out.println(name+"同学的年龄是"+age+"手机号码是"+phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //调用两个参数的构造方法
        Person01 p1=new Person01(20,"18978906789");
        p1.setName("张三");
        p1.study();

    }
}
