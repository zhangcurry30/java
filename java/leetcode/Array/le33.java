package leetcode.Array;

public class le33 {
    public static int func(int[] nums, int target) {
//        int i = 0;
//        int j = nums.length;
//        while (i < j) {
//            int mid = (i + j) / 2;
//            if (target == nums[mid])
//                return mid;
//            else if (target > nums[mid])
//                i = mid + 1;
//            else
//                j = mid - 1;
//        }
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {9, 12, 15, 20, 1, 3, 6, 7};
        int target = 6;
        System.out.println(func(a, target));
    }
}
