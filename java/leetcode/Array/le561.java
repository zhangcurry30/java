package leetcode.Array;

import java.util.Arrays;

public class le561 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                sum += nums[i];
        }
        return sum;
    }

    public static int arrayPairSum2(int[] nums) {
        int sum = 0;
        int[] arr = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] + 10000]++;
        }

        int n = 1;
        for (int j = 0; j < arr.length; j++) {
            while (arr[j]-- != 0) {
                if (n % 2 != 0) {
                    sum += j - 10000;
                    n++;
                }
                else
                    n++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,2};
        System.out.println(arrayPairSum2(a));
    }
}
