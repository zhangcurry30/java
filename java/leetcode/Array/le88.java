package leetcode.Array;

public class le88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int a = 0; a < n; a++)
                nums1[a] = nums2[a];
            return;
        }
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            } else {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            k--;
            i--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {2, 0};
        int[] num2 = {1};
        merge(num1, 1, num2, 1);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
