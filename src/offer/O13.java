package offer;


public class O13 {
	public static void main(String[] args) {
		int m = 20;
		int n = 2;
		int k = 10;
		Solution_1 solution = new Solution_1();
		System.out.println(solution.movingCount(m, n, k));
	}

	/**
	 * Offer13. 机器人的运动范围
	 * 1. dfs
	 * 2. 直接算矩阵
	 * 2. bfs
	 */
	static class Solution_1 {
		public int movingCount(int m, int n, int k) {
			int[][] visited = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (limit(i, j, k) == false) {
						visited[i][j] = 1;
					} else {
						visited[i][j] = 0;
					}
				}
			} 
			return move(m, n, 0, 0, k, visited);
		}

		public int move(int m, int n, int i, int j, int k, int[][] visited) {
			if (i >= m || i < 0 || j >= n || j < 0 || visited[i][j] == 1) {
				return 0;
			}

			visited[i][j] = 1;

			return 1 + move(m, n, i + 1, j, k, visited) + move(m, n, i, j + 1, k, visited);
		}

		public boolean limit(int i, int j, int k) {
			return i / 10 + i % 10 + j / 10 + j % 10 <= k;
		}
	}

}
