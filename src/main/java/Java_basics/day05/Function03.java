package Java_basics.day05;

/**
 * 方法的声明和调用
 * 1、方法是用来封装一段具有特定功能的代码，可以被反复调用
 * 2、方法的声明要素：访问权限，返回值类型，方法名，入参
 * 3、return用来声明方法返回的具体数据,这个返回的数据必须和声明的类型一致
 * 4、方法调用：调用方法的时候我们需要使用如下格式 :  方法名(入参)
 * 注意点：1、   如果有返回值，必须根据该方法的返回类型设定 变量来进行接收
 * 2、   方法名必须大小一致
 * 3、   传入的入参数据必须和方法声明的一致
 * 5、关于无返回方法：如果方法声明时，返回值定义的是void类型，代表该方法无返回值。方法体中不能使用return XXXX;来返回数据，
 * 并且在调用完成后没有结果赋值给变量
 * 6、如果方法设计时没有入参，那么我们调用也不需要传入入参
 */
public class Function03 {
    public static void main(String[] args) {
        int a = Function02.add1(10, 20); //同一个包下不同的类可以通过类名方法名调用
        String b=Longin("xiaohua","wsks");
        System.out.println(b);
    }

    public static String Longin(String user, String password) {
        String[] lis1 = {"xiaohua", "xiaoming", "小红"};
        String[] List2 ={"1234","wsks","890"};
        String a="登录失败";
        for (int i=0;i<lis1.length;i++){
            if (lis1[i].equals(user)&&List2[i].equals(password)){
                a="登录成功";
                break;
            }
        }
        return a;
    }


}
