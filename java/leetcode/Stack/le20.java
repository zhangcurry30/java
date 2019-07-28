package leetcode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *做一个空栈。读入字符直到结尾。如果字符是一个开放符号，则将其推入栈中。
 *如果字符是一个封闭符号，则当栈空时报错。否则，将栈元素弹出。如果弹出的符号不是对应的开放符号，则报错。
 *在文件结尾，如果栈非空则报错。
 *
 */
public class le20 {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                stack.push(str[i]);
            }else if (stack.isEmpty()) {
                return false;
            }else {
                if (str[i] == map.get(stack.peek()))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    

    public static void main(String[] args) {
        String s = "[[{{(())}}]]";
        System.out.println(new le20().solution(s));
    }
}
