package Java_basics.day08;

import java.util.*;

/**
 * Set集合：Set集合和List集合的区别在于Set集合存放数据时无序的，没有下标
 */
public class HashSet01 {
    public static void main(String[] args) {

        //创建Set集合
        Set<String> strs = new HashSet<String>();
        //使用add方法进行添加
        strs.add("jjjjj");
        strs.add("aaa");
        strs.add("bbb");
        strs.add("ccc");
        System.out.println(strs); //数据排列是无序的没有下标

        //set集合的长度
        System.out.println(strs.size());

        //判断是否为空
        System.out.println(strs.isEmpty());

        //判断是否包含某内容
        System.out.println(strs.contains("aaa"));

        //set集合遍历
        for (String i : strs) {
            System.out.println("i的值为：" + i);
        }

        //清空集合
        strs.clear();
        System.out.println(strs);

        Set<Role> rol = new HashSet<Role>();
        Role ro1 = new Role();
        ro1.setSpecialty("后裔");
        ro1.setJob("射术");
        ro1.setSpecialty("1000");
        System.out.println(ro1);

        Set<Integer> se = new HashSet<Integer>();  //相当于python的集合
        List<Integer> li = new ArrayList<Integer>(); //相当于python的列表
        Map<Integer, String> ma = new HashMap<Integer, String>(); //相当于python的字典
        Role ro = new Role();
        ro.setRolename("ssjsj");
        ro.setSpecialty("sjjsj");
        System.out.println(ro.getList());


    }
}
