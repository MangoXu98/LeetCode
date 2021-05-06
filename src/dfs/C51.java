package dfs;

import java.util.ArrayList;
import java.util.List;

public class C51 {
	public static void main(String[] args) {
		int n = 4;
		Solution_1 solution = new Solution_1();
		List<List<String>> res = solution.solveNQueens(n);
		System.out.println(res.toString());
	}

	/**
	 * 51. N »Êºó
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<String>> res = new ArrayList<>();

		public List<List<String>> solveNQueens(int n) {
			String[][] matrix = new String[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = ".";
				}
			}
			backTacking(n, matrix, 0);

			return res;
		}

		public void backTacking(int n, String[][] matrix, int depth) {
			if (depth == n) {
				List<String> tmp = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					String s = "";
					for (int j = 0; j < n; j++) {
						s += matrix[i][j];
					}
					tmp.add(s);
				}
				res.add(tmp);
				return;
			}

			for (int col = 0; col < n; col++) {
				if (!isValid(n, matrix, col, depth)) {
					continue;
				}

				matrix[depth][col] = "Q";
				backTacking(n, matrix, depth + 1);
				matrix[depth][col] = ".";
			}
		}

		public boolean isValid(int n, String[][] matrix, int col, int depth) {
			for (int i = depth - 1; i >= 0; i--) {
				if (matrix[i][col] == "Q") {
					return false;
				}
			}

			for (int i = depth - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
				if (matrix[i][j] == "Q") {
					return false;
				}
			}

			for (int i = depth - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
				if (matrix[i][j] == "Q") {
					return false;
				}
			}

			return true;
		}
	}
}
