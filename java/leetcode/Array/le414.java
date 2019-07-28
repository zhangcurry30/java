package leetcode.Array;

import java.util.Arrays;
import java.util.Stack;

public class le414 {
    /**
     * 排序，找出倒数第三个不相同的数，否则返回最后一个数
     * 时间复杂度O(nlogn)
     */
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = 1, num = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != num){
                num = nums[i];
                n++;
            }
            if (n == 3)
                return num;
        }
        return nums[nums.length - 1];
    }

    public static int thirdMax2(int[] nums) {
        int max1 = (int)Double.NEGATIVE_INFINITY;
        int max2 = (int)Double.NEGATIVE_INFINITY;
        int max3 = (int)Double.NEGATIVE_INFINITY;
        for (int num:nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if (num == max1) {
                continue;
            }else if (num > max2){
                max3 = max2;
                max2 = num;
            }else if (num == max2) {
                continue;
            }else if (num > max3){
                max3 = num;
            }
        }
        if (max1 != max2 || max1 != max3)
            return max3;
//        if (max3 != (int)Double.NEGATIVE_INFINITY)
//            return max3;
        else return max1;
    }


    public static void main(String[] args) {
        int[] a = {1,2,-2147483648};
        System.out.println(thirdMax2(a));
    }
}
