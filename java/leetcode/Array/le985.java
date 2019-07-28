package leetcode.Array;

public class le985 {

    /**
     * 暴力搜索计算
     * 时间复杂度 O(n*n)
     * @param A
     * @param queries
     * @return
     */
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            A[queries[i][1]] += queries[i][0];
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0)
                    res[i] += A[j];
            }
        }
        return res;
    }

    /**
     * 暴力搜索计算
     * 时间复杂度 O(n*n)
     * @param A
     * @param queries
     * @return
     */
    public static int[] sumEvenAfterQueries2(int[] A, int[][] queries) {
        int sum = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0)
                sum += A[j];
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int index = queries[i][1];
            int add = queries[i][0];
            if (add % 2 == 0 && A[index] % 2 == 0) {
                res[i] = sum + add;
                sum = sum + add;
                A[index] += add;
            }
            else if (add % 2 == 0 && A[index] % 2 != 0) {
                res[i] = sum;
                A[index] += add;
            }
            else if (add % 2 != 0 && A[index] % 2 == 0) {
                res[i] = sum - A[index];
                sum = sum - A[index];
                A[index] += add;
            }
             else if (add % 2 != 0 && A[index] % 2 != 0) {
                res[i] = sum + A[index] + add;
                sum = sum + A[index] + add;
                A[index] += add;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[][] que = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] res = sumEvenAfterQueries2(a, que);
        for (int i:res)
            System.out.println(i);
    }
}
