package dfs;

import java.util.ArrayList;
import java.util.List;

public class C216 {
	public static void main(String[] args) {
		int n = 10;
		int k = 1;
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.combinationSum3(k, n);
		System.out.println(res.toString());
	}

	/**
	 * 216. 组合总和 III
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> combinationSum3(int k, int n) {
			backTracking(k, n, 0);
			return res;
		}

		public void backTracking(int k, int n, int begin) {
			if (tmp.size() == k) {
				if (n == 0) {
					res.add(new ArrayList<>(tmp));
				}
				return;
			}

			if (n < 0) {
				return;
			}

			for (int i = begin + 1; i < 10; i++) {
				tmp.add(i);
				backTracking(k, n - i, i);
				tmp.remove(tmp.size() - 1);
			}
		}
	}

}
