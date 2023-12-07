package Java_basics.day07;
/**
 * 1、 A类extends B类，代表子类继承父类的属性和方法，A为子类，B为父类
 2、一个类只能继承一个父类。（一个父类可以有多个子类）
 3、子类能够访问父类的属性和方法，但父类不能访问子类的属性和方法，
 子类之间也不能相互访问。
 */
//Emp继承了EmpPerson的方法
public class Emp extends EmpPerson {
    private String id;
    private double sal;
    private double comm;
    private String job;
    public void sleep(){
        System.out.println("上班必须睡觉emp");
    }

    public void work(){
        System.out.println("上班很累");
    }
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public double getSal() {
        return sal;
    }


    public void setSal(double sal) {
        this.sal = sal;
    }


    public double getComm() {
        return comm;
    }


    public void setComm(double comm) {
        this.comm = comm;
    }


    public String getJob() {
        return job;
    }


    public void setJob(String job) {
        this.job = job;
    }
    public Emp(){super();} //子类继承父类为子类自动生成构造函数存根
}
