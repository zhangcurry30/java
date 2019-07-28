package leetcode.Array;

import java.util.*;

public class le1002 {
    public static List<String> commonChars2(String[] A) {
        List<String> list = new ArrayList<>();
        int[] res = new int[26];
        for (char c : A[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (char c : A[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                res[j] = Math.min(res[j], temp[j]);
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                for (int j = 0; j < res[i]; j++) {
                    list.add(((char) ('a' + i) + ""));
                }
            }
        }
        return list;
    }
//    public static List<String> commonChars(String[] A) {
//        List<Map<Character, Integer>> lists = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < A.length; i++) {
//            Map<Character, Integer> map = new HashMap<>();
//            String tmp = A[i];
//            for (int j = 0; j < tmp.length(); j++) {
//                if (!map.containsKey(tmp.charAt(j)))
//                     map.put(tmp.charAt(j), 1);
//                else map.put(tmp.charAt(j), map.get(tmp.charAt(j)) + 1);
//            }
//            lists.add(map);
//        }
//        String str = A[0];
//        for (int k = 0; k < str.length(); k++) {
//            int n = 0;
//            for (Map<Character, Integer> m:lists) {
//                if (m.containsKey(str.charAt(k)))
//                    n++;
//            }
//            if (n == A.length) {
//                list.add("" + str.charAt(k));
//                for (Map<Character, Integer> m:lists) {
//                    if (m.containsKey(str.charAt(k)))
//                        n++;
//                    m.put(str.charAt(k), m.get(str.charAt(k)) - 1);
//                }
//            }
//        }
//
//        List<String> list2 = new ArrayList<>();
//        Map<Character, Integer> map = lists.get(0);
//        for (String s:list) {
//            for (int i = 0; i < map.get(s); i++)
//                list2.add(s);
//        }
//        return list2;
//    }
    public static void main(String[] args) {
        String[] s = {"bella","label","roll er"};
        List<String> list = commonChars2(s);
        System.out.println(list);
    }
}
