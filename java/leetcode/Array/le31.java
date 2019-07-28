package leetcode.Array;

/**
 * 给定一个数组的排列
 * 求下一个排列序列
 */


public class le31 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        for (int i = n; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                return;
            }
        }
        int j = 0;
        int k = nums.length - 1;
        while (j++ < k--){
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
        }
        return;
    }

    public static void main(String argv[]) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        int[] c = {1, 3, 2};
        nextPermutation(c);
        for (int i = 0; i < a.length; i++) {
            System.out.println(c[i]);
        }
    }

}
