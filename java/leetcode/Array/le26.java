package leetcode.Array;

public class le26 {
	
	public static int func(int[] nums) {
		int j = 0;
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[j]) {
				for (int k = i; k < n - 1; k++) {
					nums[k] = nums[k + 1];
				}
				i--;
				n--;
			}else {
				j++;
			}
		}
		return j + 1;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4 ,6 ,6 ,6 ,6 ,7, 7, 7, 89, 90};
		int n = func(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
