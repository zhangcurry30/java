package leetcode.Array;

import java.util.Arrays;

public class le1051 {

    public static int heightChecker(int[] heights) {
        int n = 0;
        int[] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                n++;
        }
        return n;
    }

    public static int heightChecker2(int[] heights) {
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker2(arr));
    }
}
