package dfs;

import java.util.ArrayList;
import java.util.List;

public class C78 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.subsets(nums);
		System.out.println(res.toString());
	}

	/**
	 * 78. ×Ó¼¯
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> subsets(int[] nums) {
			backTracking(nums, 0);
			return res;
		}

		public void backTracking(int[] nums, int begin) {
			res.add(new ArrayList<>(tmp));
			if (begin >= nums.length) {
				return;
			}

			for (int i = begin; i < nums.length; i++) {
				tmp.add(nums[i]);
				backTracking(nums, i + 1);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}
