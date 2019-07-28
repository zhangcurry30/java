package leetcode.Array;

public class le35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid])
                return mid;
            if (target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] num = {1,3,5,6};
        System.out.println(new le35().searchInsert(num, 5));
        System.out.println(new le35().searchInsert(num, 2));
        System.out.println(new le35().searchInsert(num, 4));
        System.out.println(new le35().searchInsert(num, 7));
        System.out.println(new le35().searchInsert(num, 0));
    }

}
