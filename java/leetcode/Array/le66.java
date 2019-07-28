package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class le66 {
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int add = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                list.add((digits[i] + 1+ add) % 10);
                add = (digits[i] + 1 + add) / 10;
            }else {
                list.add((digits[i] + add) % 10);
                add = (digits[i] + add) / 10;
            }
        }
        int n;
        if (add != 0){
            list.add(add);
            n = digits.length + 1;
        }

        else
            n = digits.length;
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = list.get(n - j - 1);
        }
        return arr;
    }
    public static int[] plusOne2(int[] digits) {
        int[] arr = new int[digits.length + 1];
        int add = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                arr[i + 1] = (digits[i] + 1+ add) % 10;
                add = (digits[i] + 1 + add) / 10;
            }else {
                arr[i + 1] = (digits[i] + add) % 10;
                add = (digits[i] + add) / 10;
            }
        }
        if (add != 0){
            arr[0] = 1;
            return arr;
        }
        else
            return Arrays.copyOfRange(arr, 1, arr.length);
    }
    public static void main(String[] args) {
        int[] a = {9};
        int[] b = plusOne2(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
