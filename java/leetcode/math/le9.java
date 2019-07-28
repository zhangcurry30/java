package leetcode.math;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class le9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while (x != 0) {
            stack.push(x % 10);
            queue.offer(x % 10);
            x = x / 10;
        }

        while (!stack.isEmpty()) {
        	if (stack.pop() != queue.poll()) {
				return false;
			}
        }

        return true;
    }
    
    public boolean isPalindrome1(int x) {
        String string = Integer.toString(x);
        char[] ch = string.toCharArray();
        int i = 0;
        int n = ch.length - 1;
        while (i < n) {
        	if (ch[i] != ch[n]) {
				return false;
			}
        	i++;
        	n--;
        }

        return true;
    }
    
    public static void main(String[] args) {
		System.out.println(new le9().isPalindrome1(123));
		System.out.println(new le9().isPalindrome1(121));
	}
}
