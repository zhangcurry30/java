package leetcode;

public class le782 {

	public static int func(String J, String S) {
		int n = 0;
		for (int i = 0; i < J.length(); i++) {
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == J.charAt(i)) {
					n++;
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		String J = "aAb";
		String S = "aAAbbbb";
		System.out.println(func(J, S));
	}
}
