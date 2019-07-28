package Algorithm.divideAndConquer;

public class binarySearch {
    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right)
            return -1;
        int n = (right + left) / 2;
        if (nums[n] == target)
            return nums[n];
        if (nums[n] > target)
            return binarySearch(nums, left, n - 1, target);
        else return binarySearch(nums, n + 1, right, target);
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(binarySearch(a, 0, a.length - 1, 11));
    }
}
