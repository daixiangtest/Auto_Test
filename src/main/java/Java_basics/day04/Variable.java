package Java_basics.day04;

/**
 * 变量的作用域：变量分为全局变量和局部变量
 * 全局变量在整个类有效，局部变量在方法体内有效
 */
public class Variable {
    int b = 20; //全局变量作用于整个类里面 实例全局变量
    static int c = 20;//全局的静态变量，当声明的方法为静态方法时调用全局变量必须声明为静态变量
//   局部变量需要声明并且赋值才能使用，全局变量可以不进行赋值，有默认值
//    基本类型   整数类型默认为0    小数类型默认为 0.0   char默认为  ' '这是个空格  boolean类型默认为  false  所有引用类型默认为  null
    static int in;
    static String str;
    static double db;
    static char ca;
    static boolean bo;

    public static void main(String[] args) {  //这是一个静态方法
        System.out.println(c);   //变量c是静态全局变量在静态方法中可以被调用
       // System.out.println(b);  //变量b是实例全局变量在静态方法中不可以被调用
        int a = 10; //局部变量作用与该方法里面
        Variable.c = 20;//全局静态变量可以使用 类名.变量名 直接调用
        System.out.println(c);
        System.out.println(a);
        System.out.println(in);  //0
        System.out.println(str);  //null
        System.out.println(db);  //0.0
        System.out.println(ca);  //" "
        System.out.println(bo);  //false

        int d;
        //System.out.println(d);  //代码报错，局部变量必须先赋值在使用

    }

    public void fun() {
        b = 30;//b是声明在方法体外的是全局变量，其它所有方法都能使用
        //a=20;//a是声明在main方法中的，只有在main方法中有效，所以该行代码报错
    }

}
