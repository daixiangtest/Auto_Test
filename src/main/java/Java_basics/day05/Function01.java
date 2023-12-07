package Java_basics.day05;

/**
 * 方法的声明和调用
 * 1、方法是用来封装一段具有特定功能的代码，可以被反复调用
 * 2、方法的声明要素：访问权限，返回值类型，方法名，入参
 * 3、return用来声明方法返回的具体数据,这个返回的数据必须和声明的类型一致
 * 4、方法调用：调用方法的时候我们需要使用如下格式 :  方法名(入参)
 * 注意点：1、   如果有返回值，必须根据该方法的返回类型设定 变量来进行接收
 * 2、   方法名必须大小写一致
 * 3、   传入的入参数据必须和方法声明的一致
 * <p>
 * 5、关于无返回方法：如果方法声明时，返回值定义的是void类型，代表该方法无返回值。方法体中不能使用return XXXX;来返回数据，
 * 并且在调用完成后没有结果赋值给变量
 * 6、如果方法设计时没有入参，那么我们调用也不需要传入入参
 */
public class Function01 {
    //整数相加方法
    public static int func1(int a, int b) {
        int c = a + b;
        return c; //代表该方法返回c的值
    }

    //设计一个简单的登录方法
    public static String login(String username, String password) {
        if (username.equals("xiaohua") && password.equals("a123456")) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }

    //设计一个方法用来计算长方形面积：长*宽   并且调用这个方法
    public static double area1(double length, double width) {
        return length * width;
    }

    //无返回值案例：设计一个方法计算长方形面积：长*宽   并且调用这个方法
    public static void area2(double length, double width) {
        System.out.println(length * width);
    }

    //无入参案例：设计一个方法，运行这个方法后可以知道10*20是多少
    public static int mult() {
        return 10 * 20;
    }

    //打印三角型
    public static void sjx(int g){
        for(int i=g;i>=1;i--){
            for(int j=1;j<=g*2-1;j++){
                if(j==i || j==g*2-i || i==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

    public static void main(String[] args){
        System.out.println(func1(10,20));
        System.out.println(login("xiaohua","123456"));
        //调用无入参案例
        int st =mult();//括号里面不需要添加参数
        System.out.println(st);//200

        //调用面积计算无返回值方法
        area2(10.5,20.5);//215.25   无返回的方法不需要设定变量去接收

        //调用面积计算1
        double ae=area1(15.5,20.5);
        System.out.println(ae);//317.75
    }
}
