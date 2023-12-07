package Java_basics.day06;

public class EmpTest {
    //测试empl类的main方法
    public static void main(String[] args){
        Emp em=new Emp(); //初始化一个实例对象
        em.empno="9527";  //对对象中的属性进行赋值
        em.ename="SMIT";
        em.sal=1000;
        em.comm=200;
        em.deptno=30;
        em.job="bows";

        double ys=em.yearSal();  //通过对象来调用类里面的方法，变量的类型与方法返回的类型要一致
        System.out.println(ys);
        double ks=em.kouSal(10.0);
        System.out.println(ks);
        em.work(); //方法无返回值时，不需要变量来接收

    }
}
