package Algorithm;

import java.util.*;

/**
 *
 *  Breadth First Search
 *  广度优先遍历
 *  利用队列
 *
 *  Depth First Search
 *  深度优先遍历
 *  利用栈
 *
 */
public class BFS {

    public static void BFS (Map<Character, List> map, char node) {
        Map<Character, Character> m = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        queue.offer(node);
        set.add(node);
        m.put(node, '0');
        while ( !queue.isEmpty()) {
            char ch = ((LinkedList<Character>) queue).pop();
//            System.out.println(ch);
            List<Character> list = map.get(ch);
            for (Character c:list) {
                if (!set.contains(c)) {
                    queue.offer(c);
                    set.add(c);
                    m.put(c, ch);
                }
            }
        }
        char v = 'D';
        while (v != '0') {
            System.out.println(v);
            v = m.get(v);
        }
    }

    public static void DFS (Map<Character, List> map, char node) {
        Map<Character, Character> m = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        stack.push(node);
        set.add(node);
        m.put(node, '0');
        while ( !stack.isEmpty()) {
            char ch = stack.pop();
//            System.out.println(ch);
            List<Character> list = map.get(ch);
            for (Character c:list) {
                if (!set.contains(c)) {
                    stack.push(c);
                    set.add(c);
                    m.put(c, ch);
                }
            }
        }

        char v = 'D';
        while (v != '0') {
            System.out.println(v);
            v = m.get(v);
        }
    }

    public static void main(String[] args) {
        Map<Character, List> map = new HashMap<>();
        map.put('A', Arrays.asList('B', 'C'));
        map.put('B', Arrays.asList('A', 'C', 'D'));
        map.put('C', Arrays.asList('A', 'B', 'D', 'E'));
        map.put('D', Arrays.asList('B', 'C', 'E', 'F'));
        map.put('E', Arrays.asList('C', 'D'));
        map.put('F', Arrays.asList('D'));
//        BFS(map, 'A');
        DFS(map, 'A');
    }
}
