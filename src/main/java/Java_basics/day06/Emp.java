package Java_basics.day06;
//创建一个员工工资的类
public class Emp {
    String empno;   //构造实例属性当调用那个对象是就用哪个值
    String ename;
    String job;
    double sal;
    int deptno;
    double comm;
    public void work(){
        System.out.println("工作很爽");
    }
    //计算年薪
    public  double yearSal(){
        return (this.sal+this.comm)*12;  //this代表当前的实例对象，谁调用就用谁的
    }
    //旷工扣除工资计算
    public double kouSal(double days){
        return sal/30*days*3;
    }
}
