package Java_basics.练习;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 一次性获取三门课程的成绩，保存到数组，然后输出,正则提取
 */
public class JavaTest04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请一次性输入三门课程的成绩以空格隔开：");
        String str=sc.nextLine();  //nextLine可以获取控制中空格后面的信息

        String[] strs=str.split("\\s+"); //将字符串中的以空格为分隔截取的数据放入数组中
        System.out.println(Arrays.toString(strs));
        for (String st:strs){
            int num=Integer.parseInt(st);   //将字符串转化为整数
            System.out.println(st);
        }
        TestString();
        TestStringBuffer();
        testBuffer("aabbcdeefg");
//        StringBuffer stringBuffer1 = new StringBuffer("hello");
//        StringBuffer stringBuffer2 = new StringBuffer("java");
//        System.out.println(stringBuffer1+ "," + stringBuffer2);
//        stringBuffer1=stringBuffer2;
//        stringBuffer2=stringBuffer2.append("stringBuffer1");//不同的对象指向同一个栈的地址，一个改变另外一个也发生变化
//        stringBuffer1=stringBuffer1.append(stringBuffer2);
//        System.out.println(stringBuffer1);
//        System.out.println(stringBuffer2);
        testToString();
        rmRepeated("AAbbbcc ddaaaffggbb");
    }
    //写代码测试字符串拼接的性能，比如拼接10万次
    public static void TestString(){
        String str="";
        long start_time=System.currentTimeMillis();//获取当时时间
        for (int i=0;i<=100000;i++){
            str+="你好";
        }
        long end_time=System.currentTimeMillis();
        long time=end_time-start_time;
        System.out.println("消耗时间为："+time);
    }
    public static void TestStringBuffer(){
        StringBuffer str=new StringBuffer();
        System.out.println(str);
        long start_time=System.currentTimeMillis();//获取当时时间
        for (int i=0;i<=10000000;i++){
            str.append("你好");
        }
        long end_time=System.currentTimeMillis();
        long time=end_time-start_time;
        System.out.println(time);
    }
    //删除字符串下标是3的倍数的字符 ，s = "aabbcdeefg"，输出abcdef。
    public static void testBuffer(String str){
        StringBuffer buffer=new StringBuffer(str);
        System.out.println(buffer);
        for (int i=buffer.length()-1;i>=0;i--){
            if (i%3==0){
                buffer.deleteCharAt(i);
            }
        }
        str=buffer.toString();
        System.out.println(buffer.toString());
    }
    //输入一个字符串，输出出现次数最多的前2个字符及出现次数
    public static void testToString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.nextLine();
        Map<String,Integer> maps=new HashMap<String, Integer>();
        for (int i=0;i<str.length();i++){
            String c = str.charAt(i) + "";
            maps.put(c, maps.containsKey(c) ? maps.get(c) + 1 : 1);
        }
        System.out.println(maps);

    }
    //输入一个字符串将字符重复以去除展示如输入：aabbbcc ddaaaffggbb 输出abc dafgb
    public static String rmRepeated(String s){
        String str = "";
        for(int i = 0; i<s.length();i++){
            if (str.length()!=0){
                if (str.charAt(str.length()-1)!=s.charAt(i)){
                    str +=s.charAt(i);
                }
                else{
                    String ss = Character.toString(s.charAt(i));  // String ss = String.valueOf(s.charAt(i));
                    // 将字符都转化为字符的字符串
                    System.out.println("ss="+ss);
                    if(ss.equals(" ")){
                        str +=s.charAt(i);
                    }
                }
            }
            else{
                str +=s.charAt(i);
            }
        }
        System.out.println(str);
        return str;
    }
}
