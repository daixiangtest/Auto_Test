package Java_basics.day09;

/**
 * 自定义异常：自己定义一个异常类
 * 定义方式：让我们定义的这个类继承Exception类，并且提供有参构造器，构造器中调用父类的有参构造器
 * 自定义异常的使用：我们可以使用  throw + new 异常类("异常信息") 来抛出我们自定义的异常
 */
public class CustomizeException extends Exception {
    public CustomizeException(String message) {//当我们去创建该类的对象时，传入message，直接去调用父类的构造器，创建一个Exception对象
        super(message);//super 调用父类构造器
    }
}
