package leetcode.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数
 * 给定 N，计算 F(N)
 */
public class le509 {

    /**
     * 暴力算法
     * 时间复杂度（O(2^n)）
     */
    public static int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return fib(N - 1) + fib(N - 2);
    }

    /**
     * 带备忘录的递归解法(递归中的重复子问题)
     * 时间复杂度（O(n)）
     * 自定向下
     */
    Map<Integer, Integer> map = new HashMap<>() {{
        put(0, 0);
        put(1, 1);
    }};
    public int fib2(int N) {
        if (!map.containsKey(N))
            map.put(N, fib2(N - 1) + fib2(N - 2));
        return map.get(N);
    }

    /**
     * 动态规划
     * 自底向上
     * 时间复杂度（O(n)）
     */
    public int fib3(int N) {
        Map<Integer, Integer> m = new HashMap<>() {{
            put(0, 0);
            put(1, 1);
        }};
        for (int i = 2; i <=  N; i++) {
            m.put(i, m.get(i - 2) + m.get(i - 1));
        }
        return m.get(N);
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(new le509().fib2(10));
        System.out.println(new le509().fib3(10));
    }
}
