package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class C90 {
	public static void main(String[] args) {
		int[] nums = { 4, 4, 4, 1, 4 };
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.subsetsWithDup(nums);
		System.out.println(res.toString());
	}

	/**
	 * 90. ×Ó¼¯ II
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> subsetsWithDup(int[] nums) {
			Arrays.sort(nums);
			backtracking(nums, 0);
			return res;
		}

		public void backtracking(int[] nums, int begin) {
			res.add(new ArrayList<>(tmp));

			HashSet<Integer> set = new HashSet<>();
			for (int i = begin; i < nums.length; i++) {
				if (i > begin && nums[i] == nums[i - 1] ) {
					continue;
				}

				set.add(nums[i]);
				tmp.add(nums[i]);
				backtracking(nums, i + 1);
				tmp.remove(tmp.size() - 1);
			}

		}
	}

}
