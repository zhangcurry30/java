package leetcode.Array;

/**
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class le283 {

    //  拷贝到另外一个数组里面
    public static void moveZeroes(int[] nums) {
        int[] a = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                a[j++] = nums[i];
            }
        }
    }

    /**
     * 冒泡
     * 时间复杂度 O（n^2）
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }

    public static void moveZeroes3(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length)
            nums[j++] = 0;
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes3(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
