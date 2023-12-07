package Java_basics.day07;
/*
  给一个数组，和一个期望值，数组里面的其中两个数的和等于这个期望值，返回这两个数
 */

import java.util.Arrays;

public class WorkTest {
    public static boolean panDuan(int i, int[] nums1) {
        boolean bl = false;
        for (int j : nums1) {
            if (j == i) {
                bl = true;
                break;
            }

        }
        return bl;
    }

    public static int[] list(int[] nums, int target) {
        int[] st = new int[2];
        for (int num : nums) {
            if (WorkTest.panDuan(target - num, nums)) {
                st[0] = num;
                st[1] = target - num;

            }
        }
        return st;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 39, 9, 6, 3};
        int[] st = list(nums, 9);
        System.out.printf(Arrays.toString(st));
    }
}
