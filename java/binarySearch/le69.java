package binarySearch;

public class le69 {
    static int mysqrt (int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        int i = 0, j = x;
        while (i < j) {
            long mid = (i + j) / 2;
            if (mid * mid == x )
                return (int)mid;
            if (mid * mid < x) {
                i = (int)mid + 1;
            }
            else{
                j = (int)mid;
            }
        }
        return j - 1;
    }

    public static void main(String[] args) {
        System.out.println(mysqrt(17));
        System.out.println(mysqrt(2));
        System.out.println(mysqrt(15));
        System.out.println(mysqrt(12));
        System.out.println(mysqrt(2147395599));
    }
}
