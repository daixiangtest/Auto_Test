package Java_basics.练习;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTestList {
    public static void main(String[] args) {
        ArrayList<Student01> lis1=new ArrayList<Student01>();
        Student01 s01=new Student01("张三",18,"男",01);
        System.out.println(s01);
        Student01 s02=new Student01("李四",20,"男",02);
        lis1.add(s01);
        lis1.add(s02);
        System.out.println(lis1);
        for (Student01 li:lis1){
            System.out.println(li.getName()+li.getAge()+li.getSex());
        }
//        listTest01();
        //1.提示用户循环输入学生的信息，存储到ArrayList集合中
        ArrayList<Student01> list02=new ArrayList<>();
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入学生姓名；");
            String name= sc.next();
            if (name.equals("aa")){
                break;
            }
            System.out.println("请输入年龄");
            int age=sc.nextInt();
            System.out.println("请输入学号");
            int sno=sc.nextInt();
            Student01 st=new Student01(name,age,"未知",sno);
            list02.add(st);

        }
        //2.输出所有学生的信息
        System.out.println(list02);
        //3.根据学号修改指定学生信息
        for (Student01 lis:list02){
            if (lis.getSno()==101){
                lis.setName("王二");
            }
        }
        System.out.println(list02);
        //  4.根据学号删除学生
        list02.removeIf(li -> li.getSno() == 102);//列表推导式：遍历list02依次将列表里面的对象赋值给li,如果li的学号是102就删除该对象
        list02.removeIf(ls -> ls.getAge()==20);
        System.out.println(list02);
    }

    /**
     * 提示用户输入整数，存放到ArrayList集合中，输入0代表结束。分别使用for、foreach、iterator循环集合，并删除所有是3的倍数的元素
     */
    public static void listTest01(){
        ArrayList<Integer> list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入整数");
            int num= sc.nextInt();
            if (num==0){
                break;
            }else {
                list1.add(num);
            }
        }
        System.out.println(list1);
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)%3==0){
                list1.remove(i);
            }
        }
        System.out.println(list1);

    }

}

/**
 * 定义Student类并创建对象，把对象放入ArrayList，循环ArrayList，打印学生信息
 * 属性：id、name、age
 * 1.提示用户循环输入学生的信息，存储到ArrayList集合中
 *
 * 2.输出所有学生的信息
 *
 * 3.根据学号修改指定学生信息
 *
 * 4.根据学号删除学生
 */
class Student01{
    private String name;
    private int age;
    private String sex;
    private int sno;
    public Student01(String name,int age,String sex,int sno){
        this.age=age;
        this.name=name;
        this.sex=sex;
        this.sno=sno;
    }
    public Student01(){}

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getSno() {
        return sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {   //返回对象的值

        return "Student{"+"name="+name+",age="+age+",sex"+sex+",学号="+sno+"}";
    }
}
