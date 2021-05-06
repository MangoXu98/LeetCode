package offer;

public class O10_2 {
	public static void main(String[] args) {
		Solution_1 solution = new Solution_1();
		int param_2 = solution.numWays(0);
		System.out.print(param_2);
	}

	/**
	 * Offer 10_II. 青蛙跳台阶问题： 重点注意！！ 递归的方法要超过时间限制
	 * 
	 */
	static class Solution_1 {
		public int numWays(int n) {
			int a = 1, b = 2, sum;
			for (int i = 0; i < n-1; i++) {
				sum = (a + b) % 1000000007;
				a = b;
				b = sum;
			}
			return a; 
		}
	}

}
