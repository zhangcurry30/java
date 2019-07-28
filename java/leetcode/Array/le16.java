package leetcode.Array;

public class le16 {
    public static int threeSumClosest(int[] nums, int target) {
        int sub = 1000;
        int index_i = 0, index_j = 0, index_k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i != k) {
                        if ((Math.abs((nums[i] + nums[j] + nums[k]) - target)) < sub) {
                            sub = Math.abs((nums[i] + nums[j] + nums[k]) - target);
                            index_i = i;
                            index_j = j;
                            index_k = k;
                        }
                    }
                }
            }
        }
        return nums[index_i] + nums[index_j] + nums[index_k];
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
