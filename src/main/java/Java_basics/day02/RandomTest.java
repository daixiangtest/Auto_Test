package Java_basics.day02;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

        Random rd = new Random();   //先new出一个新对象

        int i = rd.nextInt(16) + 3;//	rd.nextInt(16)随机范围是0-15
        //  rd.nextInt(16)+3随机范围是3-18
        System.out.println(i);
    }
}
