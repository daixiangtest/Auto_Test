package Java_basics.练习;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//班级有不同数量的学生，用map保存；循环取出学生信息
public class JavaTestMap01 {
    private static Student01 s1=new Student01("张三",20,"男",101);
    private static Student01 s2=new Student01("李四",19,"男",102);
    private static Student01 s3=new Student01("王丫",21,"女",103);
    private static Student01 s4=new Student01("马五",20,"男",104);
    public static void testMap(){
        String a="普通班";
        String b="精英班";
        ArrayList<Student01> class01=new ArrayList<>();
        ArrayList<Student01> class02=new ArrayList<>();
        class01.add(s1);
        class01.add(s3);
        class02.add(s2);
        class02.add(s4);
        HashMap<String,ArrayList<Student01>> maps=new HashMap<>();
        maps.put(a,class01);
        maps.put(b,class02);
        System.out.println(maps);
        System.out.println("_______________这是第一种方法_____________");
        //第一种方法循环取出
        Set<String> Kname=maps.keySet();  //取出所有的key值放入集合中
        System.out.println(Kname);
        for (String name:Kname){
            ArrayList<Student01> st=maps.get(name); //通过key值获取班级信息
            System.out.println(st);
            for (Student01 s:st){  //对班级遍历获取学生信息
                System.out.println(s);
            }
        }
        System.out.println("_______________这是第二种方法_____________");
        //第二种方法循环取出
        Set<Map.Entry<String,ArrayList<Student01>>> items=maps.entrySet(); //将map中的key和value都出入集合中
        System.out.println(items);
        for (Map.Entry<String,ArrayList<Student01>> item:items){
            ArrayList<Student01> cls=item.getValue();
            System.out.println(cls);
            for (Student01 st:cls){
                System.out.println(st);
            }
        }

    }

    public static void main(String[] args) {
        testMap();
    }
}
