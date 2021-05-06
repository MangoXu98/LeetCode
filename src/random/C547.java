package random;

public class C547 {
	public static void main(String[] args) {
		int[][] isConnected = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		Solution_1 solution = new Solution_1();
		int n = solution.findCircleNum(isConnected);
		System.out.println(n);
	}

	/**
	 * 图的遍历，采用DFS或BFS
	 *
	 */
	static class Solution_1 {
		public int findCircleNum(int[][] isConnected) {
			int pro = isConnected.length;
			boolean[] visited = new boolean[pro + 1];
			int num = 0;
			for (int i = 0; i < pro; i++) {
				for (int j = 0; j < pro; j++) {
					if (!visited[i] && isConnected[i][j] == 1) {
						visited[i] = true;
						dfs(isConnected, visited, pro, i);
						num += 1;
					}
				}
			}
			return num;
		}

		public void dfs(int[][] isConnected, boolean[] visited, int pro, int node) {
			for (int j = 0; j < pro; j++) {
				if (isConnected[node][j] == 1 && !visited[j]) {
					visited[j] = true;
					dfs(isConnected, visited, pro, j);
				}
			}
		}
	}
}
