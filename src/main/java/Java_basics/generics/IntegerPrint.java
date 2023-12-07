package Java_basics.generics;

/**
 * 比如创建一个打印的类，打印出方法的参数
 */
public class IntegerPrint {
    Integer conter;  //当用传统方法时我想要打印这个参数必须是整数类型
    IntegerPrint(Integer conter){
        this.conter=conter;
    }
    public void print(){
        System.out.println(conter);
    }
}
