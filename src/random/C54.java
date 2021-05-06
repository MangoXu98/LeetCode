package random;

import java.util.ArrayList;
import java.util.List;

public class C54 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] matrix2 = { { 7 }, { 9 }, { 6 } };
		Solution_2 solution = new Solution_2();
		List<Integer> res = solution.spiralOrder(matrix);
		System.out.println(res.toString());
	}

	/**
	 * 54. ÂÝÐý¾ØÕó
	 * 
	 * 
	 */
	static class Solution_1 {
		public List<Integer> spiralOrder(int[][] matrix) {
			List<Integer> res = new ArrayList<Integer>();
			int n = matrix.length;
			if (n == 0) {
				return res;
			}

			int m = matrix[0].length;

			recur(matrix, 0, m - 1, 0, n - 1, res);

			return res;
		}

		public void recur(int[][] matrix, int row_l, int row_r, int col_t, int col_b, List<Integer> res) {
			if (row_l > row_r || col_t > col_b) {
				return;
			}

			for (int i = row_l; i <= row_r; i++) {
				res.add(matrix[col_t][i]);
			}
			col_t += 1;

			for (int i = col_t; i <= col_b; i++) {
				res.add(matrix[i][row_r]);
			}
			row_r -= 1;

			for (int i = row_r; i >= row_l; i--) {
				if (col_t <= col_b) {
					res.add(matrix[col_b][i]);
				}
			}
			col_b -= 1;

			for (int i = col_b; i >= col_t; i--) {
				if (row_r >= row_l) {
					res.add(matrix[i][row_l]);
				}
			}
			row_l += 1;

			recur(matrix, row_l, row_r, col_t, col_b, res);
		}
	}

	
	static class Solution_2 {
		public List<Integer> spiralOrder(int[][] matrix) {
			List<Integer> res = new ArrayList<Integer>();
			int n = matrix.length;
			if (n == 0) {
				return res;
			}

			int m = matrix[0].length;
			int row_l = 0;
			int row_r = m - 1;
			int col_t = 0;
			int col_b = n - 1;
			while (row_l <= row_r && col_t <= col_b) { 
				for (int i = row_l; i <= row_r; i++) {
					res.add(matrix[col_t][i]);
				}
				col_t += 1;

				for (int i = col_t; i <= col_b; i++) {
					res.add(matrix[i][row_r]);
				}
				row_r -= 1;

				for (int i = row_r; i >= row_l; i--) {
					if (col_t <= col_b) {
						res.add(matrix[col_b][i]);
					}
				}
				col_b -= 1;

				for (int i = col_b; i >= col_t; i--) {
					if (row_r >= row_l) {
						res.add(matrix[i][row_l]);
					}
				}
				row_l += 1;
			}
			
			return res;
		}
	}
}
