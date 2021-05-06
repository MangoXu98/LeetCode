package offer;
 

public class O12 {
	public static void main(String[] args) {
		char[][] board = { { 'A'} };
		String word = "A";
		Solution_1 solution = new Solution_1();
		boolean param_2 = solution.exist(board, word);
		System.out.print(param_2);
	}

	/**
	 * Offer 10_II. 矩阵路径   （再关注）
	 * 注意：遇到走路径的问题优先考虑DFS算法
	 * 
	 */
	static class Solution_1 {
		public boolean exist(char[][] board, String word) {  
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (recur(board, i, j, word, 0))
						return true;
				}
			}
			return false;
		}

		public boolean recur(char[][] board, int i, int j, String word, int k) {
			if (i >= board.length || i < 0 || j >= board[0].length  || j < 0 || board[i][j] != word.charAt(k)) {
				return false;
			}

			if (k == word.length() - 1) {
				return true;
			}

			board[i][j] = '\0';

			boolean res = recur(board, i + 1, j, word, k + 1) || recur(board, i - 1, j, word, k + 1)
					|| recur(board, i, j - 1, word, k + 1) || recur(board, i, j + 1, word, k + 1);

			board[i][j] = word.charAt(k);

			return res;

		}
	}
}
