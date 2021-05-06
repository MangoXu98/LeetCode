package dfs;

import java.util.ArrayList;
import java.util.List;

public class C77 {
	public static void main(String[] args) {
		int n = 4;
		int k = 4;
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.combine(n, k);
		System.out.println(res.toString());
	}

	/**
	 * 77. ×éºÏ
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();  
		List<Integer> com = new ArrayList<Integer>();
		public List<List<Integer>> combine(int n, int k) { 
			backTracking(n, k, 0);
			return res;
		}

		public void backTracking(int n, int k, int begin) {
			if (com.size() == k) {
				res.add(new ArrayList<>(com));
				return;
			}

			for (int i = begin+1; i <= n-(k-com.size())+1; i++) {
				com.add(i);
				backTracking(n, k, i);
				com.remove(com.size() - 1);
			}
		}
	}
}
