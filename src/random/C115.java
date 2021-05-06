package random;

public class C115 {
	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		Solution_1 solution = new Solution_1();
		int res = solution.numDistinct(s, t);
		System.out.println(res);
	}

	/**
	 * 115. 不同的子序列
	 * 
	 * 
	 */
	static class Solution_1 {
		int res = 0;

		public int numDistinct(String s, String t) {
			backTracking(s, t, 0, 0);
			return res;
		}

		public void backTracking(String s, String t, int sp, int tp) {
			if (sp == s.length()) {
				return;
			}
			if (tp == t.length() - 1) {
				res += 1;
				return;
			}

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(sp) == t.charAt(tp)) {
					backTracking(s, t, sp + i + 1, tp + 1);
					sp -= 1;
					tp -= 1;
				} else {
					backTracking(s, t, sp + i + 1, tp);
					sp -= 1; 
				}

				
			} 
		}
	} 
}
