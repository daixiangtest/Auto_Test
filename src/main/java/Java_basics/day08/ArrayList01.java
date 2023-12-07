package Java_basics.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 集合：用来成组的存放数据，常用的集合有三种 ArrayList(python中的List)、HashSet(python中的set) 、HashMap(python中的dict)
 * 1、集合和数组的区别：它们都是用来保存一组数据的，区别在于集合可变长，数组是定长 .集合只存放引用类型。
 * 2、ArrayList集合和数组很像，都可以使用下标访问数据
 * 3、泛型：用来规定集合存储数据的类型，  <>中只能放引用类型，不能使用基本类型
 * 4、因为集合中不能存放基本类型，但是可以存放8种基本类型的包装类类型
 * int ---->Integer    代表引用类型的整数
 * byte ---->Byte      代表引用类型的整数
 * short---->Short
 * long----->Long
 * float----->Float
 * double----->Double
 * char----->Character
 * boolean----->Boolean
 */
public class ArrayList01 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(); //声明了一个存放字符串的集合
        ls.add("xiaohua");//为集合存放数据，下标为0
        ls.add("hehe");//下标是1
        ls.add("shanghai");//下标为2
        System.out.println(ls);
        //ArrayList集合通过下标访问数据
        System.out.println(ls.get(2));

        //获取集合的长度
        int long1 = ls.size();//获取集合的长度
        System.out.println(long1);

        //判断集合是否为空
        boolean bl = ls.isEmpty();
        System.out.println(bl);

        //删除对应下标位置的数据
        String st1 = ls.remove(1);//删除1号下标位置的数据，并且返回这个值
        System.out.println(st1);
        System.out.println(ls); //1号位置的数据被删除，原2号位置自动往前进一位

        //判断集合是否包含XXX内容
        boolean bl2 = ls.contains("xiaohua");
        System.out.println(bl2);

        //清空整个集合
        ls.clear();
        System.out.println(ls);

        //集合遍历
        //创建一个整数型的集合
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(28);
        nums.add(56);
        System.out.println(nums);
        for (int i = 0; i < nums.size(); i++) {  //下标遍历
            System.out.println(nums.get(i));
        }
        for (int num : nums) {  //值遍历
            System.out.println(num);
        }

        //存入自定义类型
        List<Role> res = new ArrayList<Role>();
        Role ro = new Role();
        ro.setJob("dajia");
        ro.setSpecialty("大家");
        res.add(ro);
        System.out.println("res1"+res);
        ro.setRolename("小花");


       // ro.setRoleName("你好");
        System.out.println(ro);
        res.add(ro);
        System.out.println("res2"+res);
        //创建数组
        String[] st = new String[10];
        st[0] = "beijing";
        st[1] = "hangzhou";
        st[2] = "nanjing";
        System.out.println(Arrays.toString(st));


        //List<int> lsi = new ArrayList<int>();不能直接声明为基本类型
        List<Integer> lsi = new ArrayList<Integer>();
        lsi.add(10);
        lsi.add(1, 20); //通过下标添加值
        System.out.println(lsi);




    }
}
