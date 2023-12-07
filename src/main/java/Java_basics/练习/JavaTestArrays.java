package Java_basics.练习;

import java.util.Arrays;
import java.util.Scanner;

public class JavaTestArrays {
    /*
    定义一个int类型数组，动态赋值，然后将数组中元素反转，最后输出，要求：动态赋值定义方法；反转定义方法
     */
    public static void setValue(int[] nums) {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            nums[i] = sn.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void reveseArray(int[] nums) {
        int b = nums.length;
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[b - i - 1] = nums[i];
        }
        System.out.println(Arrays.toString(a));
    }

    /*
    有一个数组[1, 3, 66, 16, 28, 666, 168]，循环输出数组中的元素并计算所有数的总和，并将最大值放到最前面，最小值放到最后面，然后输出数组
     */
    public static void ArraysTest01(int[] nums) {
        int sum = 0;
        for (int i:nums){
            sum += i;
            System.out.println(i);
        }
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] <= nums[i + 1]) {
                int a = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = a;
            }
        }
        System.out.println("所有数的和是" + sum);
        System.out.println(Arrays.toString(nums));
    }
    /*
    输出二维数组的每个元素，int[][] d = { { 1, 2, 9 }, { 5 }, { 1, 3 }, { 9, 7, 0 } };
     */
    public static void ArraysTest02(){
        int[][] d = { { 1, 2, 9 }, { 5 }, { 1, 3 }, { 9, 7, 0 } };
        for (int[] i:d){
            for (int j:i){
                System.out.print("依次输出的值是："+j+"\t");
            }
            System.out.println();
        }
    }
    /*
    有2个班，每个班有3名学生，提示用户分别输入学生的成绩，将数据保存到二维数组中，
    并计算每个班的平均分、全校的最高分、最低分，最后输出平均分最高的班以及对应的平均分
     */
    public static void ArraysTets03(){
        Scanner sn=new Scanner(System.in);
        int[][] scores=new int[2][3];
        int i=0;
        for (;i<scores.length;i++){
            int[] score=scores[i];
            int sum=0;
            for (int j=0;j<score.length;j++){
                System.out.println("请输入"+(i+1)+"班的第"+(j+1)+"名学生的成绩");
                score[j]=sn.nextInt();
                sum+=score[j];
            }scores[i]=score;
            System.out.println((i+1)+"班的平均成绩为："+(sum/score.length));
        }
        System.out.println(Arrays.toString(scores));
    }







    public static void main(String[] args) {
//        int[] nums=new int[6];
//        setValue(nums);
//        reveseArray(nums);
//        int[] nums1 = {20, 30, 6, 88, 99};
//        ArraysTest01(nums1);
        ArraysTest02();
        ArraysTets03();
    }
}
