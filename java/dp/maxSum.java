package dp;

public class maxSum {
    static int rec_opt(int[] a, int n) {
        if (n == 0)
            return a[0];
        else if (n == 1)
            return Math.max(a[0], a[1]);
        else
            return Math.max((rec_opt(a, n - 2) + a[n] ), rec_opt(a, n - 1));
    }


    static int dp_opt (int[] a, int n) {
        int[] opt = new int[a.length];
        opt[0] = a[0];
        opt[1] = Math.max(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            int A = opt[i - 2] + a[i];
            int B = opt[i - 1];
            opt[i] = Math.max(A, B);
        }
        return opt[n];
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4, 1, 7, 8, 3, 4, 2, 2, 7, 8, 56, 34, 9, 6, 4, 3, 6, 7, 6, 3, 2, 2, 5 ,34, 56, 56,  2, 5 ,34,
                56, 56,  2, 5 ,34, 56, 56,  2, 5 , 2, 5 ,34, 56, 56,  2, 5 ,34, 56, 56};
        long time1 = System.currentTimeMillis();
        System.out.println(rec_opt(a, a.length - 1));
        System.out.println(System.currentTimeMillis() - time1);

        long time2 = System.currentTimeMillis();
        System.out.println(dp_opt(a, a.length - 1));
        System.out.println(System.currentTimeMillis() - time2);
    }
}
