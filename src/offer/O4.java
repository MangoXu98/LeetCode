package offer;

public class O4 {
	public static void main(String[] args) {
		int[][] matrix = { { -5 } };
		int target = -5;
		Solution_1 solution = new Solution_1();
		System.out.println(solution.findNumberIn2DArray(matrix, target));
	}

	/**
	 * 方法： 1. 暴力法 2. 按顺序有选择的进行查找
	 * 
	 */
	static class Solution_1 {
		public boolean findNumberIn2DArray(int[][] matrix, int target) {
			int n = matrix.length;
			if (n == 0) {
				return false;
			}
			int m = matrix[0].length;
			for (int i = n - 1, j = 0; i >= 0 && j <= m - 1;) {
				int cmp = matrix[i][j];
				if (cmp < target) {
					j += 1;
				} else if (cmp > target) {
					i -= 1;
				} else {
					return true;
				}
			}
			return false;
		}
	}
}
