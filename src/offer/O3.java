package offer;

import java.util.HashSet;

/**
 * 剑指 Offer 03. 数组中重复的数字 找出数组中重复的数字。
 * 
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1
 * 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字.
 *
 */
public class O3 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 0, 2, 5, 3 };
		Solution_1 solution = new Solution_1();
		System.out.println(solution.findRepeatNumber(nums));
	}

	/**
	 * 三类方法： 1. 排序，遍历 2. Hash 3. 原地置换
	 * 
	 * 寻找重复的最好办法是Hash
	 */
	static class Solution_1 {
		public int findRepeatNumber(int[] nums) {
			HashSet<Integer> cf = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				if (!cf.add(nums[i])) {
					return nums[i];
				}
			}
			return 0;
		}
	}
}
