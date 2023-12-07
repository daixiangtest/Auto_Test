package Java_basics.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合：map集合的一种，  以  key(键)----value(值) 的形式保存数据
 */
public class HashMap01 {
    public static void main(String[] args) {
        //创建map集合
        Map<Integer, String> mp = new HashMap<Integer, String>();//声明集合，key值为Integer类型，value值为String类型
        //存放数据 .put()
        mp.put(1001, "hehe");
        mp.put(1002, "skksk");
        mp.put(10,"ss");

        Map<String, String> ma1 = new HashMap<String, String>();
        ma1.put("key", "keysy");
        ma1.put("key2", "sjjsjq");

        System.out.println(mp);
        System.out.println(ma1);

        //重新赋值
        ma1.put("key","lsls");  //如果key值存在则给value重新赋值
        System.out.println(ma1);
        //通过可以值获取value值
        System.out.println(ma1.get("key"));

        //通过可以删除对应的value，并且返回value值
        System.out.println(ma1.remove("key"));
        System.out.println(ma1);

        //判断集合是否为空
        boolean b1=ma1.isEmpty();
        System.out.println(b1);

        //集合的长度
        System.out.println(ma1.size());

        //清空集合
        ma1.clear();
        System.out.println(ma1);

        //对集合进行遍历
        Set<Integer> st=mp.keySet();  //获取key的值存放在set集合里面
        System.out.println(st);
        for (Integer i:st){
            System.out.println("i值是"+i);
        }

    }
}
