package tree;

import java.util.List;

import tree.C107.solution_2;

public class C108 {
	public static void main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };

		Solution_1 solution = new Solution_1();
		// solution_2 solution = new solution_2();
		TreeNode res = solution.sortedArrayToBST(nums);
		solution_2 print = new solution_2();
		List<List<Integer>> resp = print.levelOrderBottom(res);
		for (List<Integer> subRes : resp) {
			System.out.println(subRes.toString());
		}

	}

	/**
	 * 二分求数据的中间值,时间复杂度O(n)
	 *
	 */
	static class Solution_1 {
		public TreeNode sortedArrayToBST(int[] nums) {
			return binary(nums, 0, nums.length - 1);
		}

		public TreeNode binary(int[] nums, int l, int r) {
			if (r < l) {
				return null;
			}
			int mid = l + (r - l) / 2;
			TreeNode res = new TreeNode(nums[mid]);
			res.left = binary(nums, l, mid-1);
			res.right = binary(nums, mid + 1, r);
			return res;
		}
	}

}
