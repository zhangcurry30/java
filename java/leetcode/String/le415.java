package leetcode.String;

/**
 * 2019-7-21
 * 求字符串相加
 */

public class le415 {

    public static String addStrings(String num1, String num2) {
        if (num1 == "0" && num2 == "0") {
            return new String("0");
        }
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int n = 0;
        StringBuilder s = new StringBuilder();
        //  add代表进位
        int add = 0;
        while (n1 >= 0 && n2 >= 0) {
            int num = (Integer.parseInt(num1.charAt(n1) + "") + Integer.parseInt(num2.charAt(n2) + "") + add) % 10;
            add = (Integer.parseInt(num1.charAt(n1) + "") + Integer.parseInt(num2.charAt(n2) + "") + add) / 10;
            s.append(num);
            n++;
            n1--;
            n2--;
        }
        if (n1 == -1 && n2 == -1) {
            s.append(add);
        }
        while (n1 >= 0) {
            int num = (Integer.parseInt(num1.charAt(n1) + "") + add) % 10;
            add = (Integer.parseInt(num1.charAt(n1) + "") + add) / 10;
            s.append(num);
            n++;
            n1--;
        }

        while (n2 >= 0) {
            int num = (Integer.parseInt(num2.charAt(n2) + "") + add) % 10;
            add = (Integer.parseInt(num2.charAt(n2) + "") + add) / 10;
            s.append(num);
            n++;
            n2--;
        }
        return new String(s.reverse());
    }

    public static void main(String[] args) {
        String a = "0";
        String b = "0";
        System.out.println(addStrings(a, b));
    }
}
