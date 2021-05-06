package dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class C491 {
	public static void main(String[] args) {
		int[] nums = { 4, 6, 7, 7 };
		Solution_1 solution = new Solution_1();
		List<List<Integer>> res = solution.findSubsequences(nums);
		System.out.println(res.toString());
	}

	/**
	 * 491. ЕндізгађСа
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> findSubsequences(int[] nums) {
			backtracking(nums, 0, 0);
			return res;
		}

		public void backtracking(int[] nums, int begin, int sl) {
			if (sl >= 2) {
				res.add(new ArrayList<>(tmp));
			}

			HashSet<Integer> set = new HashSet<>();
			for (int i = begin; i < nums.length; i++) {
				if (set.contains(nums[i]) || (tmp.size() != 0 && nums[i] < tmp.get(tmp.size() - 1))) {
					continue;
				}
				
				set.add(nums[i]);
				tmp.add(nums[i]);
				backtracking(nums, i + 1, sl + 1);
				tmp.remove(tmp.size() - 1);
			}
		}
	}

}
