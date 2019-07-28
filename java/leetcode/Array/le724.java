package leetcode.Array;

public class le724 {
    public static int pivotIndex(int[] nums) {
        int sumTotal = 0;
        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            sumTotal += nums[i];
        }
        for (int p = 0; p < nums.length; p++) {

            if (sumLeft * 2 == sumTotal - nums[p]) {
                return p;
            }
            sumLeft += nums[p];
        }
        return -1;

    }

    /**
     * 暴力穷举法
     * @param nums
     * @return index
     */
    public static int pivotIndex2(int[] nums) {

        if (nums.length <= 2)
            return -1;
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }
            if (left == right)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        int[] b = {1, 2, 3};
        int[] c = {-1,-1,-1,-1,-1,-1};
        int[] d = {-1,-1,-1,-1,-1,0};
        int[] e = {-1,-1,-1,0,-1,-1};
        int[] f = {-1,-1,-1,0,1,1};
        System.out.println(pivotIndex2(a));
        System.out.println(pivotIndex2(b));
        System.out.println(pivotIndex2(c));
        System.out.println(pivotIndex2(d));
        System.out.println(pivotIndex2(e));
        System.out.println(pivotIndex2(f));
    }
}
