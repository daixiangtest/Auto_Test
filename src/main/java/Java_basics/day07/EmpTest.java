package Java_basics.day07;

public class EmpTest {
    public static void main(String[] args){
        Emp ep=new Emp();
        ep.setId("1001");//ep可以访问自己的属性
        ep.setName("xiaohua");//访问父类的属性和方法
        ep.setAge(18);//访问父类的属性和方法
        ep.setSex("女");//访问父类的属性和方法

        EmpPerson.eat();//访问父类的静态方法需要通过父类的类名来调用
        ep.sleep();//访问父类的方法
        //ep.setSclass();//代码报错，无法访问另外一个子类的属性和方法
        //ep.study();//代码报错，无法访问另外一个子类的属性和方法
        EmpPerson ps=new EmpPerson();
        ps.setName("老王");//访问自己的属性和方法
        ps.setAge(55);//访问自己的属性和方法
        //ps.setId("1001");//代码报错，父类无法访问子类的属性和方法
        //ps.setScore(100.5);//代码报错，父类无法访问子类的属性和方法
    }
}
