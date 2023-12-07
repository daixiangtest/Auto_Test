package Java_basics.day04;

import java.util.Arrays;

public class ArrayWork {
    public static void main(String[] args){
        // 创建三个数组，第一个放姓名，第二个放性别，第三个放年龄
        //小红，小橙，小黄，小绿，小青，小蓝，小紫
        //女，女，男，男，女，男，男
        //22,21,23,25,32,18,20
        String[] list1={"小红","小橙","小黄","小绿","小青","小蓝","小紫"};
        String[] list2={"女","女","男","男","女","男","男"};
        int[] list3={22,21,23,25,32,18,20 };
        //1.取出小黄的年龄
        for (int i=0;i<list1.length;i++){
            if (list1[i].equals("小黄")){
                System.out.println(list3[i]);
            }
        }
        //2.统计有多少个男的
        int a=0;
        for (int i=0;i<list2.length;i++){
            if(list2[i].equals("男")){
                a++;
            }
        }
        System.out.println(a);

        //3.统计23岁以上的有几个
        int b=0;
        for (int s:list3){
            if (s>23){
                b++;
            }
        }
        System.out.println(b);
        //冒泡排序
        int[] list={20,200,89,77,66};
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length-i-1;j++){
                if (list[j]>list[j+1]){
                    int t=list[j];
                    list[j]=list[j+1];
                    list[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
