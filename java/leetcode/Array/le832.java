package leetcode.Array;


public class le832 {
	public static int[][] func (int[][] A){
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (A[i][j] == 0) {
					A[i][j] = 1;
				}else {
					A[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][A[i].length - j - 1];
				A[i][A[i].length - j - 1] = temp;
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
		func(A);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}
}
