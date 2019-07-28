package leetcode.Array;

import java.util.*;

public class le18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int[] arr = new int[4];
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    for (int n = 0; n < nums.length; n++) {
                        if (i != j && i != k && i != n && j != k && j != n && k != n) {
                            if ((nums[i] + nums[j] + nums[k] + nums[n]) == target) {
                                List<Integer> list = new ArrayList<>();
                                arr[0] = nums[i];
                                arr[1] = nums[j];
                                arr[2] = nums[k];
                                arr[3] = nums[n];
                                Arrays.sort(arr);
                                list.add(arr[0]);
                                list.add(arr[1]);
                                list.add(arr[2]);
                                list.add(arr[3]);
                                set.add(list);
                            }
                        }
                    }
                }
            }
        }
        for (List list: set) {
            lists.add(list);
        }
        return lists;
    }
    public static void main(String[] args) {
        int[] a = {-500,-481,-480,-469,-437,-423,-408,-403,-397,-381,-379,-377,-353,-347,-337,-327,-313,-307,-299,-278,
                -265,-258,-235,-227,-225,-193,-192,-177,-176,-173,-170,-164,-162,-157,-147,-118,-115,-83,-64,-46,-36,
                -35,-11,0,0,33,40,51,54,74,93,101,104,105,112,112,116,129,133,146,152,157,158,166,177,183,186,220,263,
                273,320,328,332,356,357,363,372,397,399,420,422,429,433,451,464,484,485,498,499};

        List<List<Integer>> lists = fourSum(a, 2139);
        for (List list: lists) {
            System.out.println(list);
//            for (Object i:list) {
//                System.out.print(i);
//            }
//            System.out.println();
        }
    }
}
