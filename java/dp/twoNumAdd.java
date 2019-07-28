package dp;

public class twoNumAdd {
    static boolean rec_subset(int[] a, int i, int S) {
        if (S == 0)
            return true;
        else if (i == 0)
            return a[0] == S;
        else if (a[i] > S)
            return rec_subset(a, i - 1, S);
        else {
            boolean A = rec_subset(a, i - 1, S - a[i]);
            boolean B = rec_subset(a, i - 1, S);
            return A || B;
        }
    }

    static boolean dp_subset(int[] a, int S) {
        boolean[][] opt = new boolean[a.length][S + 1];
        for (int j = 0; j < S + 1; j++) {
            opt[0][j] = false;
        }
        for (int i = 0; i < a.length; i++) {
            opt[i][0] = true;
        }
        opt[0][a[0]] = true;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < S + 1; j++) {
                if (a[i] > S)
                    opt[i][S] = opt[i - 1][S];
                else {
                    boolean A = opt[i - 1][S - a[i]];
                    boolean B = opt[i - 1][S];
                    opt[i][S] = A || B;
                }
            }
        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < S + 1; j++) {
//                System.out.print(opt[i][j] + " ");
//            }
//            System.out.println();
//        }
        return opt[a.length - 1][S];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 3};
        System.out.println(rec_subset(arr, arr.length - 1, 9));
        System.out.println(dp_subset(arr,9));
    }
}
