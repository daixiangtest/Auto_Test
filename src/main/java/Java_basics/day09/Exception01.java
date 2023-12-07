package Java_basics.day09;
/**
 * 异常：分为运行时异常和非运行异常
 * 运行时异常（RuntimeException）   ：代码编译通过之后，在运行过程中报错
 *注意：异常出现以后，会抛出异常对象，然后终止程序，异常出现位置以后的代码都不执行
 *
 */

public class Exception01 {
    public static void main(String[] args) {
        //System.out.println(10/0); //java.lang.ArithmeticException  数学运算异常

        String str=null;
       // System.out.println(str.equals("skk"));//java.lang.NullPointerException  空指针异常

        int[] ins={1,3,4,5,6,7};
        //System.out.println(ins[6]);//java.lang.ArrayIndexOutOfBoundsException   下标越界异常
    }
}
