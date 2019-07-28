package leetcode.Array;

/**
 *给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class le11 {
	public static int func(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int maxArea = 0;
		int area;
		while (i < j) {
			if (height[i] > height[j] ) {
				area = height[j] * (j - i); 
				j--;
			} else {
				area = height[i] * (j - i);
				i++;
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(func(a));
	}
}
