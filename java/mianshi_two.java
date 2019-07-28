import java.util.ArrayList;
import java.util.List;

public class mianshi_two {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  lists = new ArrayList<>();
        int i = 1;
        while (i <= numRows) {
            List<Integer> list = new ArrayList<>();
            if (i == 1) {
                list.add(1);
                lists.add(list);
                i++;
            }
            else if (i == 2) {
                list.add(1);
                list.add(1);
                lists.add(list);
                i++;
            } else {
                list.add(1);
                for (int j = 1; j < i - 1; j++) {
                    int num = lists.get(i - 2).get(j - 1) + lists.get(i - 2).get(j);
                    list.add(num);
                }
                list.add(1);
                lists.add(list);
                i++;
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        List<List<Integer>>  lists = generate(5);
        for (int i = 0; i < 5; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                System.out.print(list.get(j));
            }
        }

    }
}
