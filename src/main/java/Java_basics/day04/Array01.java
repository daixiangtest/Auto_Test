package Java_basics.day04;

import java.util.Arrays;

//数组：用来保存相同类型的一组数据
public class Array01 {
    public static void main(String[] args) {

        int a=10;
        String name="xiaohua";
        double db=10.5;

        //数组的创建方式1：直接声明一个数组，并且赋值
        int[] ages= {11,20,35,31,10};

        double[] dbs={153.5,115.5,5.35,77.5,45};
        String[] names={"xiaohua","xiaowang","xiaozhang","xiaoqiang","xiaobai"};

        //数组的长度
        int len =names.length;//注意这个获取长度的API和String.length()有区别的
        System.out.println("names数组的长度是："+len);
        System.out.println("ages数组的长度是："+ages.length);

        //打印数组内容
        System.out.println(ages);//如果直接打印，结果是个物理地址
        System.out.println(Arrays.toString(ages));

        //数组的下标:数组的下标从0开始，最大的下标值为     数组的长度-1
        //可以通过数组的下标访问数组对应位置的值
        System.out.println(names[0]);//是获取names数组第0个位置的值
        System.out.println(names[1]);
        System.out.println(names[4]);
        //System.out.println(names[5]);//该行代码报错，names最大下标是4，names[5]不存在

        //数组的创建方式2：创建一个定长的空数组；
        String[] strs = new String[6];//声明变量strs是一个数组类型，长度为6位的数组
        strs[0]="张学友";//给strs数组0号下标位置赋值为   张学友
        strs[1]="刘德华";
        strs[2]="郭富城";
        strs[3]="黎明";
        strs[4]="周杰伦";
        strs[5]="周浩浩";
        //相当于 String[] strs={"张学友","刘德华","郭富城","黎明","周杰伦","周浩浩"};
        //strs[6]="ada";//6号位置不存在，无法赋值ArrayIndexOutOfBoundsException

        System.out.println(strs[0]);
        System.out.println(strs[5]);
        //重新赋值
        strs[5]="王思聪";
        System.out.println(strs[5]);

        //数组的循环遍历1:该方法通过循环数组的下标，访问数组中的每一个值
        for(int i=0;i<=strs.length-1;i++){
            System.out.println("数组的下标为"+i+"的值为："+strs[i]);
        }

        //数组的循环遍历2,：  for..each 循环，不通过下标，直接获取数组的值
        System.out.println("以下是for...each循环遍历strs1");

        for(String s:strs){//使用变量  s 去逐个获取strs数组里面的值，每次循环会获取一个，直到所有的值全部获取结束循环
            System.out.println(s);
        }
        //第一次循环   strs[0]的值给s
        //第二次循环   strs[1]的值给s
        //第三次循环   strs[2]的值给s
        //第四次循环   strs[3]的值给s
        //第五次循环   strs[4]的值给s
        //第六次循环   strs[5]的值给s
        //第七次时因为没有数据给s,所以结束循环

        //使用for..each遍历数组int[] ages={11,20,35,31,10};

        for(int i:ages){
            System.out.println(i);
        }

        //使用for..each遍历数组String[] names={"xiaohua","xiaowang","xiaozhang","xiaoqiang","xiaobai"};
        for(String s:names){
            System.out.println(s);
        }

        //使用两种遍历方式查找黄渤是否在 strs数组中
        //相当于 String[] strs={"张学友","刘德华","郭富城","黎明","周杰伦","周浩浩"};
        String res ="不存在";
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("黄渤")){
                res ="存在";
            }
        }
        System.out.println(res);



        res ="不存在";
        for(String s:strs){
            if(s.equals("黄渤")){
                res="存在";
            }
        }
        System.out.println(res);
        //数组直接打印的方法

        System.out.println(Arrays.toString(strs));//[张学友, 刘德华, 郭富城, 黎明, 周杰伦, 王思聪]



    }




}
