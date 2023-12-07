package Java_basics.day08;

import java.util.Arrays;

/**
 * String类的基本用法
 */
public class StringToStudy01 {
    public static void main(String[] args) {
        String str01 = "好好学习  天天向上";
        String str02 = "好好学习 天天向上";
        String stro3 = "ABCD";
        String str04 = "abcd";
        String str05="  absbsb alsl  ";
        String str06=" abcabcabcabc";
        System.out.println(str01.charAt(3));  //返回字符串中指定下标的字符
        System.out.println(str01.equals(str02)); //判断字符串中的值是否相等
        System.out.println(stro3.equalsIgnoreCase("abcd"));//忽略大小写判断字符串的值是否相等
        System.out.println(str01.indexOf("学习"));  //从左到右找到第一个符合字符的下标
        System.out.println(str06.indexOf("a",4));//从先字符串的下标位置从前往后找a的下标
        System.out.println(str01.lastIndexOf("好"));  //从右到左找到第一个符合字符的下标
        System.out.println(str06.lastIndexOf("a",6)); //从下标位置开始从后往前找第一个符合字符的下标
        System.out.println(str01.indexOf("sksk")); //如果字符没有找到返回下标为-1
        System.out.println(str01.replace("好好", "不想"));  //将字符串中的字段做替换
        System.out.println(str01.length());   //展示字符串的长度
        System.out.println(str01.startsWith("好好")); //判断字符串是否以某字符开头
        System.out.println(str02.endsWith("向上"));  //判断某字符是否以某字符结束
        System.out.println(str01.substring(5));//通过下标提取字符串的值返回一个新的字符串
        System.out.println(str01.substring(3, 6));//通过下标直接的范围提取字符的值，返回一个新的字符串
        System.out.println(stro3.toLowerCase());//字符串的字母转小写
        System.out.println(str04.toUpperCase());//字符串的字母转大写
        System.out.println(str05.trim()); //取出字符中字母的收尾空格
        System.out.println(str05); //字符串数据为不可变类型原字符串对象不改变
        String[] strs=str06.split("a");  //以字符串中的某个字符为分割，将分割后的字符存入数组中
        String[] strs1=str06.split("a",3); //将前3个字符提取出来作为分割点
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(strs1));
        char ch=stro3.charAt(1);
        String st=String.valueOf(ch);  //将字符转化为字符串
        String st01=Character.toString(ch);//将字符转化为字符串
        System.out.println(st);
        System.out.println(st01);
    }
}
