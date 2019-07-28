package leetcode.String;

import java.util.*;

public class le17 {

    public static List<String> letterCombinations(String digits) {
        Map<Character, List> map = new HashMap<>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));

        List<String> output = new ArrayList<>();
        if (digits.length() == 0)
            return output;
        if (digits.length() == 1)
            return map.get(digits.charAt(0));
        if (digits.length() == 2) {
            List<String> l1 = map.get(digits.charAt(0));
            List<String> l2 = map.get(digits.charAt(1));
            return combination(l1, l2);
        }

        List<String> l1 = map.get(digits.charAt(0));
        List<String> l2 = map.get(digits.charAt(1));
        output = combination(l1, l2);
        for (int i = 2; i < digits.length(); i++) {
            output = combination(output, map.get(digits.charAt(i)));
        }
        return output;
    }

    public static List<String> combination (List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                list.add(list1.get(i) + list2.get(j));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "242434235756";
        List<String> list = letterCombinations(s);
        System.out.println(list);
    }
}
