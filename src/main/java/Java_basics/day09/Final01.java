package Java_basics.day09;

/**
 * final可以修饰类，方法，属性
 * 1）final修饰的类，叫做最终类，不能再被继承（不能再有子类）
 * 2）final修饰方法，不能再被子类重写
 * 3）final修饰属性，值不能被修改，为常量
 */
public final class Final01 {  //修饰的类不能被继承
    private static final int a = 1;
    public final static int b = 20;  //修饰的方法不能被重写

    public static void main(String[] args) {
        // a=10; //无法将值赋给 final 变量 'b'
        //b=2; //无法将值赋给 final 变量 'b'
    }

}
