package Java_basics.generics;

import Java_basics.day07.EmpPerson;

import java.util.List;

/**
 * 这是用泛型的方法创建的类，对与入参数据可以是任意类型的数据
 *
 * @param <t> <> 是泛型的标识符 t是类型的变量名称是自定义的
 */
public class Print<t, k> { //有泛型表示该类的参数类型可以是任意数据类型
    t conter;
    k conter02;

    Print(t conter, k conter02) {
        this.conter = conter;
        this.conter02 = conter02;
    }

    public void print() {
        System.out.println(conter);
        System.out.println(conter02);
    }
    //在Main类中进行测试
}

/**
 * 泛型也可以规范某一个类型的范围，通过类和接口来进行规范
 *
 * @param < t extend 类名 &接口名>
 */
class Print01<t extends EmpPerson> { //同时也可以对t进行类型规范，该语法声明t只能是EmpPerson类及其子类的类型
    t conter;

    Print01(t conter) {
        this.conter = conter;

    }

    public void print() {
        System.out.println(conter);
        t.eat();

    }

    public static <t> void print01(t conter){ //在方法的返回值前面加上泛型就可以声明方法入参为任意类型了
        System.out.println(conter);
    }

    public static void print02(List<?> list){  //当参数为list时不确定里面的参数类型，可以使用 ？来声明参数可以是任意类型的列表
        // 如果需要约束范围同样是 extend 来规范类型及其子类
        // 使用super 可以来规范类型及其父类
        System.out.println(list);
    }

    public static void print03(List list){
        System.out.println(list);
    }
    //在Main类中进行测试
}
