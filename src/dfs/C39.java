package dfs;

import java.util.ArrayList;
import java.util.List;

public class C39 {
	public static void main(String[] args) {
//		int[] candidates = { 2, 3, 6, 7 };
//		int target = 7;
		int[] candidates = { 2, 3, 5 };
		int target = 8;
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.combinationSum(candidates, target);
		System.out.println(res.toString());
	}

	/**
	 * 39. 组合总和 
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> combinationSum(int[] candidates, int target) {
			backTracking(candidates, target, 0);
			return res;
		}

		public void backTracking(int[] candidates, int target, int begin) {
			if (target < 0) {
				return;
			}
			if (target == 0) {
				res.add(new ArrayList<>(tmp));
				return;
			}

			for (int i = begin; i < candidates.length; i++) {
				tmp.add(candidates[i]);
				backTracking(candidates, target - candidates[i], i);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}
