package leetcode.bitOprate;

import java.util.*;

public class le136 {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++,i++) {
            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return -1;
    }
    public static int singleNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (!set.contains(nums[i]))
                set.add(nums[i]);
            else
                set.remove(nums[i]);
        }

        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    public static int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0 ; i < nums.length; i++) {
            sum += nums[i];
            set.add(nums[i]);
        }
        int num = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            num += it.next();
        }
        return 2 * num - sum;
    }

    public static int singleNumber3(int[] nums) {
        int num = 0;
        for (int i = 0 ; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }


    public static void main(String[] args) {
        int[] a = {2,2,1};
        int[] b = {4,1,2,1,2};
        System.out.println(singleNumber3(a));
        System.out.println(singleNumber3(b));
    }
}
