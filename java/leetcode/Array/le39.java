package leetcode.Array;

import java.util.*;

/**
 *
 *  错误
 */
public class le39 {






    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new LinkedList<>();
        for (int i = candidates.length - 1; i >= 0; i--) {
            List<Integer> list = opt(candidates, i, target);
            if (!list.isEmpty())
                lists.add(list);
        }
        return lists;
    }

    public static List<Integer> opt(int[] nums, int n, int target) {
        List<Integer> list = new LinkedList<>();
        for (int i = n; i >= 0; i--) {
            while (nums[i] <= target) {
                list.add(nums[i]);
                target -= nums[i];
            }
            if (target == 0)
                return list;
        }
        if (target != 0)
            return new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        int[] a = {2,3,5};
        List<List<Integer>> lists = combinationSum(a, 8);
        for (List l:lists) {
            System.out.println(l);
        }
    }
}
