package dfs;

public class C37 {
	public static void main(String[] args) {
		// char[][] board = {
		// {'5','3','.','.','7','.','.','.','.'},
		// ['6','.",".","1","9","5",".",".","."],
		// [".","9","8",".",".",".",".","6","."],
		// ["8",".",".",".","6",".",".",".","3"],
		// ["4",".",".","8",".","3",".",".","1"],
		// ["7",".",".",".","2",".",".",".","6"],
		// [".","6",".",".",".",".","2","8","."],
		// [".",".",".","4","1","9",".",".","5"],
		// [".",".",".",".","8",".",".","7","9"]
		// };
		char[][] board = { { '5', '3', '.' }, { '6', '.', '.' }, { '.', '9', '8' } };
		Solution_1 solution = new Solution_1();
		solution.solveSudoku(board);
		// System.out.println(res.toString());
	}

	/**
	 * 37
	 * 
	 * 
	 */
	static class Solution_1 {
		public void solveSudoku(char[][] board) {
			backTracking(board, 0, 0);
		}

		public boolean backTracking(char[][] board, int row, int col) {
			if (row == board.length) {
				return true;
			}

			if (col == board.length) {
				return backTracking(board, row + 1, 0);
			}

			if (board[row][col] != '.') {
				return backTracking(board, row, col + 1);
			}

			for (char c = '1'; c <= '9'; c++) {
				if (!validInt(board, row, col, c)) {
					continue;
				}

				board[row][col] = c;

				if (backTracking(board, row, col)) {
					return true;
				}
				board[row][col] = '.';

			}
			return false;
		}

		public static boolean validInt(char[][] board, int row, int col, char c) {
			for (int i = 0; i < board.length; i++) {
				if (board[row][i] == c) {
					return false;
				}

				if (board[i][col] == c) {
					return false;
				}
			}

			int row_b = (row / 3) * 3;
			int col_b = (col / 3) * 3;

			for (int i = row_b; i < row_b + 3; i++) {
				for (int j = col_b; j < col_b + 3; j++) {
					if (board[i][j] == c) {
						return false;
					}
				}
			}

			return true;
		}
	}
}
