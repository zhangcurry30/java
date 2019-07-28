package leetcode.String;

public class le14 {
	public String func(String[] str) {
		int len = str[0].length();
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() < len) 
				len = str[i].length();
		}
		for (int j = 0; j < len; j++) {
			for (int k = 0; k < str.length - 1; k++) {
				if (str[k].charAt(j) != str[k + 1].charAt(j)) {
					return str[0].substring(0, j);
				}
			}
		}
		return str[0].substring(0, len);
	}
	public static void main(String[] args) {
		String[] strings = {"aacaadddd", "aacaa", "aacaa"};
		System.out.println(new le14().func(strings));
	}
}
