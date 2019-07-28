import java.util.*;

public class test {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1*1);
        map.put(2, 2*2);
        map.put(3, 3*3);
        Set<Integer> set = map.keySet();
        for (Integer i:map.keySet())
            System.out.println(i + " :" + map.get(i));
        for (Integer i:map.values())
            System.out.println(i);
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ":" + entry.getValue());
    }


}
