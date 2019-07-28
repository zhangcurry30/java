package leetcode.Array;

import java.util.Arrays;

public class le905 {
    public static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int i = 0, j = A.length - 1;
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) {
                res[i] = A[k];
                i++;
            } else {
                res[j] = A[k];
                j--;
            }
        }
        return res;
    }
    public static int[] sortArrayByParity2(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            while (A[i] % 2 == 0 && i < j) {
                i++;
            }

            while (A[j] % 2 != 0 && i < j) {
                if (j == 0)
                    return A;
                j--;
            }
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
            i++;
            j--;

        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {0,2};
        int[] b = sortArrayByParity2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
}
