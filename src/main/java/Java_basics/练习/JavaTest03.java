package Java_basics.练习;

/**
 * 全局变量、局部变量、this
 * 写代码演示为什么要用this，解决了什么问题？
 */
public class JavaTest03 {
    String name="张三";
    static String str;
    public void modifyName(String username){
        name=username+"666";
        System.out.println(name);
    }
    public void modifyName01(String name){
        //参数名name与name变量名相同默认为函数的局部变量所以name的值无法赋值给成员变量的name
        name=name+"666";
        System.out.println(name);
    }
    public void modifyName03(String name){
        this.name=name+"666";
        System.out.println(name);
    }

    public static void main(String[] args) {
        JavaTest03 jt3=new JavaTest03();
        jt3.modifyName("李四");
        System.out.println(jt3.name);
        jt3.modifyName01("网二");// 网二666  这是打印的局部变量的值
        System.out.println(jt3.name);// 李四666  这是打印的成员变量的值
        jt3.modifyName03("马五");
        System.out.println(jt3.name);

//        static String str;  局部变量中无法使用静态修饰词
//        String str;  局部变量不能附初始值
        System.out.println(str);
    }
}
