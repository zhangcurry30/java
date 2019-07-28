package leetcode.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class le217 {
    /**
     * 暴力搜索比较
     * 时间复杂度O(n*n)
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    /**
     *  先排序
     *  再从小到大依次比较
     *  时间复杂度O(nlogn)
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1])
                return true;
            else i++;
        }
        return false;
    }

    /**
     *  利用set不含重复元素的特性，将元素全部放入set中，比较set的大小是否等于nums的长度
     *  赋值时间复杂度O(n)， set操作时间复杂度未知
     * @param nums
     * @return
     */
    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        return  !(nums.length == set.size());
    }

    public static void main(String[] args) {

    }
}
