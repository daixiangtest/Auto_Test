package Java_basics.day04;
import java.util.Arrays;
/**
 *
 * 二维数组
 *
 */
public class Array02 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        //二维数组的声明1
        int[][] its={
                //0 1 2
                {1,2,3},//0
                {4,5,6},//1
                {7,8,9} //2
        };

        for(int i=0;i<=2;i++){
            System.out.println(Arrays.toString(its[i]));
        }

        System.out.println(Arrays.toString(its[1]));//[4, 5, 6]
        System.out.println(its[1][1]);//5
        System.out.println(its[2][2]);//9

        //二维数组的声明2
        String[][] names = new String[3][2];

        names[0][0]="小花";

        String[][] strs={//   0          1
                {"xiaohua","xaiowang"},//0
                {"xiaobai","xiaohei"},//1
                {"xiaolan","xiaohong"}//2
        };

        System.out.println(strs[0][0]);//xiaohua
        System.out.println(strs[2][1]);//xiaohong

        //二维数组的长度
        System.out.println(strs.length);//外层数组长度为3
        System.out.println(strs[0].length);//内层数组的长度

        //循环遍历二维数组
        for(int i=0;i<strs.length;i++){        // 0                1                2
            for(int j=0;j<2;j++){ // 0,1              0,1              0,1
                System.out.println(strs[i][j]);//xiaohua,xaiowang  xiaobai,xiaohei  xiaolan,xiaohong
            }
        }

        System.out.println("-------------");
        for(String[] sts:strs){// {"xiaobai","xiaohei"}
            for(String s:sts){
                System.out.println(s);
            }
        }
        System.out.println("-------------");
        //找出xiaohei的下标位置
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[0].length;j++){
                if(strs[i][j].equals("xiaohei")){
                    System.out.println(i+"   "+j);
                }

            }
        }




    }
}
