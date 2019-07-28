package leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class le657 {
	public static boolean func (String moves) {
		char[] ch = moves.toCharArray();
		if (ch.length % 2 != 0)
			return false;
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('R', 'L');
		map.put('L', 'R');
		map.put('U', 'D');
		map.put('D', 'U');
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
		}
		for (int i = 0; i < ch.length; i++) {
			list.remove(map.get(ch[i]));
		}
		if (list.isEmpty()) {
			return true;
		}
		return false;
	}

    public static boolean func2 (String moves) {
        char[] ch = moves.toCharArray();
        if (ch.length % 2 != 0)
            return false;
        int U = 0, L = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'U')
                U++;
            else if (ch[i] == 'D')
                U--;
            else if (ch[i] == 'L')
                L++;
            else
                L--;
        }
        if (U != 0 || L != 0)
            return false;
        else return true;
    }

	public static void main(String[] args) {
		String string = "LLLLRRRRRUDDULRRLUDDU";
		System.out.println(func(string));
		System.out.println(func2(string));
	}
}
