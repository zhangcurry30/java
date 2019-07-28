import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mianshi_one {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] newarray = new int[arr1.length];
        int n = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        for (int j = 0; j < arr1.length; j++) {
            if (map.containsKey(arr1[j])) {
                arr1[j] = map.get(arr1[j]);
            }else {
                newarray[n++] = arr1[j];
                arr1[j] = -1;
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsValue(arr1[i])) {
                arr1[i] = arr2[arr1[i]];
            }
        }
        Arrays.sort(newarray);

        int[] array = new int[arr1.length];
        int index = 0;
        for (int a = 0; a < array.length; a++) {
            if (arr1[a] != -1) {
                array[index++] = arr1[a];
            }
        }
        for (int b = 0; b < newarray.length; b++) {
            if (newarray[b] != 0) {
                array[index++] = newarray[b];
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] a = {2,3,1,3,2,4,6,7,9,2,19};
        int[] b = {2,1,4,3,9,6};
        int[] array = relativeSortArray(a, b);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
