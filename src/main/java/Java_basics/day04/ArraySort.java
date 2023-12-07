package Java_basics.day04;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        //数据交换,将a的值赋予给b,将b的值赋予给a,交换a和b的值
        int a = 10;
        int b = 20;
        int c = 0;
        c = a;//先把a的值放在一个临时的变量里面
        a = b;//在把b的值给a
        b = c;//把之前a给c的值再给b
        System.out.println(a + "  " + b);

        //有一个int类型的数组{20,15,50,30,25},交换其中0和1号下标位置的值,打印出来
        int[] its = {20, 15, 50, 30, 25};
        int ts = its[0];
        its[0] = its[1];
        its[1] = ts;
        System.out.println(Arrays.toString(its));

        //冒泡排序
        int arr[] = {7, 3, 5, 2, 1};//需要从小到大排列

        for (int j = 1; j < arr.length; j++) {//控制循环次数，只需要排列4次就可以将这个长度为5的数组排列完成
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //   i=0         i=1          i=2         i=3
        //第一轮外循环  j=1	//{3,7,5,2,1} {3,5,7,2,1}   {3,5,2,7,1}  {3,5,2,1,7}
        //第二轮外循环  j=2 // {3,5,2,1,7} {3,2,5,1,7}   {3,2,1,5,7}  {3,2,1,5,7}
        //第三轮外循环  j=3 // {2,3,1,5,7} {2,1,3,5,7}   {2,1,3,5,7}  {2,1,3,5,7}
        //第四轮外循环 j=4 //  {1,2,3,5,7} {1,2,3,5,7}   {1,2,3,5,7}  {1,2,3,5,7}

        //需要从大到小排列
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int tp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tp;
                }
            }
        }

        //冒泡排序从小到大的API   Arrays.sort(数组);
        int[] arrs = {8, 9, 5, 3, 7, 6, 1};
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
    }
}
