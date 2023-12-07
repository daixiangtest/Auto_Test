package Java_basics.day07;
//在一个类中，方法名相同，参数列表不同的多个方法称为方法重载。
//在调用这些方法的时候，会根据调用放提供的入参，自动选择载入哪个方法
public class EmpPerson02 extends EmpPerson{
    public static int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void add(String a){
        System.out.printf(a);
    }
    public void sleep(){
        System.out.println("上班必须睡觉sp02");
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        add("hhahh");
    }
}
