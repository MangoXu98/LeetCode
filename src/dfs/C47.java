package dfs;

import java.util.ArrayList; 
import java.util.HashSet;
import java.util.List;

public class C47 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.permuteUnique(nums);
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

		public List<List<Integer>> permuteUnique(int[] nums) {
//			Arrays.sort(nums);
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
			}

			HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				if (used.get(i) == 1 || (set.contains(nums[i]))) {
					continue;
				}

				used.set(i, 1);
				set.add(nums[i]);
				tmp.add(nums[i]);
				backTracing(nums, used);
				tmp.remove(tmp.size() - 1);
				used.set(i, 0);
			}
		}
	}
}
