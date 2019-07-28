package leetcode.String;

public class le58 {
    public static int func(String s) {
        int i = s.lastIndexOf(" ");
        if (i == -1)
            return s.length();
        int n = s.substring(i + 1, s.length()).length();
        return n;
    }
    public static void main(String[] args) {
        String s = "Hello world i love you ";
        System.out.println(func("a"));
    }
}
