package leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class le1 {
    static int[] solution(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(target - num[i])){
                return new int[] {map.get(target - num[i]), i};
            }
            map.put(num[i], i);
        }
        throw new IllegalArgumentException("no two num");
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] res = solution(num, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
