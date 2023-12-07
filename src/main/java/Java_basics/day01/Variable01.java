package Java_basics.day01;
/*
* 变量的声明和使用
 * 变量是java程序中的最小单元(从大到小依次为 工程、包、类、方法、变量)。
 * <1: 在Java语言中，所有的变量在使用前必须声明。
 * <2: 注意：变量一次声明 可以多次赋值，后边赋值会覆盖前边的值。
 * <3: 变量在同一个作用域不能声明两次;
 * <4: 可以一次声明赋值多个变量
*/

public class Variable01 {
    public static void main(String[] args) {
        int a;//int类型代表整数，该行代码声明了1个整数类型的变量a,a可以保存整数。
        a = 10;//把10赋值给变量a，所以a的值是10(注意：= 为赋值运算符，把10赋值给a,不是说明他们相等)
        int b=20;//我们可以把声明和赋值写在一起，声明变量并且赋值 ------------
        double c=100.5;//double类型用来保存小数
        System.out.println(a);//结果10
        System.out.println(b);//结果是20
        System.out.println(c);//结果是100.5

        c = 200.5;//把200.5赋值给c,该行代码执行后，c的值是200.5
        System.out.println(c);//结果是200.5

        c = c+100;//把 c+100的值赋予给c,注意：赋值运算是（从右 往左 计算）
        System.out.println(c);//结果是300.5

        //int c;//这行代码会报错，因为在同一作用域，同一变量只能声明一次
        //一次性声明多个变量
        int d,e,f;
        d=100;
        e=200;
        f=300;
        System.out.println(d+e+f);//600

        //一次声明多个变量，且赋值
        int j=10,h=20,i=30;
        System.out.println(j*h*i);//6000
    }
}
