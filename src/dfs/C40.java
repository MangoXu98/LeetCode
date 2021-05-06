package dfs;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

public class C40 {
	public static void main(String[] args) {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 1, 5 };
		int target = 8;
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.combinationSum2(candidates, target);
		System.out.println(res.toString());
	}

	/**
	 * 40. 组合总和II
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> combinationSum2(int[] candidates, int target) { 
			Arrays.sort(candidates);
			backTracing(candidates, target, 0);
			return res;
		}

		public void backTracing(int[] candidates, int target, int begin) {
			if (target < 0) {
				return;
			}
			if (target == 0) {
				res.add(new ArrayList<>(tmp));
				return;
			}

			for (int i = begin; i < candidates.length; i++) {
				if (i > begin && candidates[i] == candidates[i - 1]) {
					continue;
				}
				tmp.add(candidates[i]);
				backTracing(candidates, target - candidates[i], i + 1);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}
