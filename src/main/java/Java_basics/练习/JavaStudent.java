package Java_basics.练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 定义学生类（姓名、学号），录入学生信息，并将学生保存到数组中
 */
public class JavaStudent {
    private String name;
    private int sid;

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public int getSid() {
        return sid;
    }
    public static Object[] getnames(JavaStudent[] students){
        Object[] names=new Object[students.length];
        for (int i=0;i<students.length;i++){
            names[i]=students[i].getName();
        }return names;
    }
    public static Object[] getsids(JavaStudent[] students){
        Object[] names=new Object[students.length];
        for (int i=0;i<students.length;i++){
            names[i]=students[i].getSid();
        }return names;
    }
    public static void getstudent(JavaStudent[] students){
        for (JavaStudent jst:students){
            System.out.println(jst.getName());
            System.out.println(jst.getSid());
        }
    }
    public static void inputstudent(JavaStudent[] students){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<students.length;i++){
            students[i] =new JavaStudent();
            System.out.println("请输入姓名");
            students[i].setName(sc.next());
            System.out.println("请输入学号");
            students[i].setSid(sc.nextInt());
        }
    }
}
class Test01{
    public static void main(String[] args) {
        JavaStudent[] students=new JavaStudent[3];
        JavaStudent.inputstudent(students);
        JavaStudent.getstudent(students);
        System.out.println(Arrays.toString(JavaStudent.getnames(students)));
        System.out.println(Arrays.toString(JavaStudent.getsids(students)));
    }

}