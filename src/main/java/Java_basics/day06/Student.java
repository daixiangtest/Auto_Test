package Java_basics.day06;
/**
 * 封装1：封装一段代码到方法体里面，形成一个可以反复调用的方法，这个叫封装一个方法
 * 封装2：类把属性和方法放在一起，使用控制修饰符控制属性和方法的访问权限，封装权限
 *
 *
 * javaBean不是java语法，是企业开发中一种约定俗成的习惯，符合以下条件的类，企业中都可以叫做javaBean
 *    1）类中所有的属性，必须用private修饰，提供get或set方法用来访问这些属性。
 *    2）必须要有无参的构造方法
 *    3）一般企业开发中，建议属性最好用private修饰（提高安全性），方法最好用public修饰
 *
 */
//创建一个学生类
public class Student {
    private String name;
    private int id;
    private int age;
    private char sex;
    public Student(){}//无参数的构造方法
    public String getName(){  //获取name值的方法
        return this.name;
    }
    public void setName(String name){ //设置name值的方法
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public char getSex(){
        return this.sex;
    }
    public void setSex(char sex){
        this.sex=sex;
    }
}
