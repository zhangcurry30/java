package Algorithm;

public class binarySearch {
    static int binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == key)
                return mid;
            if (a[mid] > key)
                right = mid -1;
            else
                left = mid + 1;
        }
        return left;
    }

    static int bs (int[] a, int key, int left, int right) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (a[mid] == key)
            return mid;
        if (a[mid] > key)
            return bs(a, key, left, mid - 1);
        else
            return bs(a, key, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int key = 5;
//        System.out.println(binarySearch(a, key));
        System.out.println(bs(a, key, 0, a.length - 1));
    }
}
