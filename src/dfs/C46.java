package dfs;

import java.util.ArrayList;
import java.util.List;

public class C46 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.permute(nums);
		System.out.println(res.toString());
	}

	/**
	 * 46. È«ÅÅÁÐ
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> permute(int[] nums) {
			List<Integer> used = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				used.add(i, 0);
			}
			backTracing(nums, used);
			return res;

		}

		public void backTracing(int[] nums, List<Integer> used) {
			if (tmp.size() == nums.length) {
				res.add(new ArrayList<>(tmp));
				return;
			}

			for (int i = 0; i < nums.length; i++) {
				if (used.get(i) == 0) {
					used.set(i, 1);
					tmp.add(nums[i]);
					backTracing(nums, used);
					used.set(i, 0);
					tmp.remove(tmp.size()-1);
				}
			}
		}
	}

}
