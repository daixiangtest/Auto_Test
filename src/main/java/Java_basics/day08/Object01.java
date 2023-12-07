package Java_basics.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Object是一个类型，Object类是所有类的父类，也叫  超类
 */

public class Object01 {
    public static void main(String[] args) {
        Object ob = new Object();
        ob = 13;
        ob = "tom";
        ob = new Role();
        Object[] obs = {"aaa", 1234, 'a', 10.7};//Object类型的数组，可以存储不同类型的数据
        System.out.println(Arrays.toString(obs));
        List<Object> lis = new ArrayList<Object>();//Object类型的列表可以存储不同类型的数据
        lis.add("jerry");
        lis.add(123);
        lis.add(20.3);
        lis.add(true);
        lis.add(Arrays.toString(obs));
        lis.add(new Role());
        System.out.println(lis);
        //存入的是object类型，取出来的也是object类型，可以根据想要的数据类型进行强制转换
        int a=(int)lis.get(1);
        System.out.println(a);
        Object obs1=lis.get(4);
        System.out.println(obs1);
        Role aa=(Role) lis.get(5);
        System.out.println(aa);
    }
}
