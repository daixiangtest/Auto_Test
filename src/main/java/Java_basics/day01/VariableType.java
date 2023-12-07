package Java_basics.day01;
/**
 * Java语言提供了八种基本类型，是java内置的类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
 *
 *
 */
public class VariableType {
    public static void main(String[] args) {
        //1、保存整数的类型有四种：byte,short,int,long
        //Type mismatch: cannot convert from int to byte
        byte bt =125;//用来保存整数类型，保存范围为-128到127，超过范围会报错
        short st=32767;//用来保存整数类型，取值范围是-32768到32767，超过范围就会报错
        int i=2147483647;//用来保存整数类型，保存范围是-2147483648到2147483647，超过范围就会报错
        long lg=100000000000L;//用来保存整数类型，保存范围非常大，整数后加L或者小写的l,代表该字面是long类型
        //注意：Java中所有的整数字面默认为int类型，在赋值的时候会自动转换
        //所以超过int范围的整数，必须声明该字面为long类型
        //java的计数方式是类似于一个圆圈的刻度，最大值和最小值是相邻的，当超过阀值时，会进入下个循环
        bt =(byte)128;
        System.out.println(bt);//-128

        //2.保存小数的类型有两种：float,double ，区别：double的精度比float类型精度高，一般保存小数都用double
        //所有小数的字面默认都是double,比如3.5 默认是double类型
        float ft=3.5F;//3.5默认是double类型，不能自动转换为float类型,所以声明的时候加f或者F来表示3.5是float类型，这样才不会报错
        double db=3.5;//这个是常用的小数类型，在Java里面所有的小数默认字面都是double类型
        System.out.println(10D/3);//3.3333333333333335 double小数最长16位
        System.out.println(10F/3);//3.3333333  float最长7位

        //3、boolean类型用来保存 判定结果，该类型只有两个值，一个是true,一个是false
        boolean b1=true;//真，成立
        boolean b2=false;//假，不成立
        int a=10;
        int b=20;
        boolean b3 = a>b;//a>b不成立，结果是false,再把false赋值给b3
        System.out.println(b3);//false
        boolean b4 = a<b;//a<b成立，结果是true
        System.out.println(b4);//true


        //4、保存单个字符用 char类型
        char cr='a';//用来保存任意1个字符，只能保存1个字符。
        //char ch='aa';  //该行代码报错，用来保存多个字符的类型叫   String  字符串类型


        //5、在java 中类型分为，基本类型和引用类型，除了上面这8大基本类型以外都是引用类型， 比如String类型就是最常用的引用类型，用来储存字符串

        String str ="快下课了";
        System.out.println(str);
    }
}
