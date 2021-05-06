package hash;

import java.util.HashSet;

public class C202 {
	public static void main(String[] args) {
		int n = 2;
		Solution_1 solution = new Solution_1();
		System.out.println(solution.isHappy(n));
	}

	/**
	 * 难点在于判断什么时候停止循环，三种可能：
	 * 1. 得到1，停止循环；
	 * 2. 最终进入循环；
	 * 3. 值越大（但经分析，最大的值小于243）
	 *
	 */
	static class Solution_1 {
		public boolean isHappy(int n) {
			HashSet<Integer> set = new HashSet<>();
			while (n != 1 && !set.contains(n)) {
				n = divide(n);
				set.add(n);
			}
			return n == 1;
		}

		public int divide(int n) {
			int sum = 0;
			while (n > 0) {
				int dd = n % 10;
				n = n / 10;
				sum += Math.pow(dd, 2);
			}
			return sum;
		}
	}

}
