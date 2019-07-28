package leetcode.math;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class le7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse1(int x) {
        long n = 1L;
        int j = 0;
        int sign = 0;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        if (x < 0) {
            sign = 1;
            x = -x;
        }
        while (x != 0) {
            queue.offer(x % 10);
            stack.push((int)Math.pow((double)10, (double)j));
            j++;
            x = x / 10;
        }
        while (stack.isEmpty() == false){
            x += queue.poll() * stack.pop();
        }

        if(x < -Math.pow(2, 31) || x > Math.pow(2, 32) - 1){
            return 0;
        }
        if (sign == 1)
            return -x;
        return x;
    }
    public static void main(String[] args) {
        System.out.println(new le7().reverse(123));
        System.out.println(new le7().reverse(-123));
        System.out.println(new le7().reverse(120));
        System.out.println(new le7().reverse(12123));
        System.out.println(new le7().reverse(1534236469));
    }
}
