package leetcode;

public class le742 {
	public static String func(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);  
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String J = "HELLO,WORLD";
		System.out.println(func(J));
	}
}
