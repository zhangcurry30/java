package leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 输入: [3,2,3]
 * 输出: 3
 */
public class le169 {
    /**
     * 排序返回中位数
     * 时间复杂度O(nlogn)
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    /**
     * 哈希表进行统计
     * 时间复杂度O(n)
     */
    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        int num = 0;
        int n = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (map.get(nums[i]) > n) {
                num = nums[i];
                n = map.get(nums[i]);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(a));
    }
}
