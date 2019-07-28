package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class le53 {
    public static int maxSubArray(int[] nums) {
        int n = 0;
        long max = -2147483648;
        while (n < nums.length) {
            for (int i = n; i < nums.length; i++) {
                int num = 0;
                for (int j = n; j <= i; j++) {
                    num += nums[j];
                }
                if (num > max)
                    max = num;
            }
            n++;
        }
        return (int)max;
    }

    public static int maxSubArray2(int[] nums) {
        int sign = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            max += nums[j];
            if (max < 0) {
               max = 0;
            }else{
                sign = 1;
                list.add(max);
            }
        }
        if (sign == 0) {
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }
        int val = 0;
        for (Integer l:list) {
            if (l > val)
                val = l;
        }
        return val;
    }
    public static int dp_maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(dp_maxSubArray(a));
    }
}
