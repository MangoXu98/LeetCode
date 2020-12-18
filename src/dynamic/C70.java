package dynamic;

class C70 {
	public static void main(String[] args) {
		int n = 3;
		solution_1 solution = new solution_1();
		System.out.print(solution.climbStairs(n));
	}

	static class solution_1 {
		public int climbStairs(int n) {
			int[] dp = new int[n + 1];
			dp[0] = 1;
			dp[1] = 1;
			for (int i = 2; i < n+1; i++) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			return dp[n];
		}
	}
}
