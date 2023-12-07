package Java_basics.练习;

import java.util.Scanner;

/**
 * 提示用户输入字符串，1.计算字符串包含多少个数字、英文字母以及其他字符，2.计算字符串中字母a出现的次数
 */
public class JavaTestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
//        String st="sakskskeew";
//        int a=st.indexOf("a",4);//判断a在字符串中的下标定位，从下标4往后查找，默认为0，如果找不到返回-1
//        System.out.println(a);
        String str= sc.next();
        int count =0;
        for (int i=0;i<str.length();i++){
            i=str.indexOf("a",i);
            if (i==-1){
                break;
            }
            count++;
        }
        System.out.println("a出现的次数"+count);

        str=str.toUpperCase();//将字符串统一换成大写
        System.out.println(str);
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='0'&&ch<='9'){
                count1++;
            } else if (ch>='A'&&ch<='z') {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("数字出现："+count1+"\n字母出现："+count2+"\n其他字符："+count3);
    }

}
