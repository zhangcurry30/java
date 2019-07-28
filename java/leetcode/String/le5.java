package leetcode.String;

public class le5 {
    public static String longestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i++ < j--) {
            if (Palindrome(s, i, j))
                return s;
            else if (Palindrome(s, i + 1, j))
                return s.substring(i + 1, j);
            else if (Palindrome(s, i, j - 1))
                return s.substring(i, j - 1);
        }
        return "";
    }
    static boolean Palindrome(String s, int i, int j) {
        while (i++ < j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "babad";
        System.out.println(longestPalindrome(a));
    }
}
