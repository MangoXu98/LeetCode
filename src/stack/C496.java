package stack;

import java.util.HashMap;
import java.util.Stack;

public class C496 {
	public static void main(String[] args) {
		int[] nums1 = { 2,4 };
		int[] nums2 = { 1, 2, 3, 4 };
		Solution_1 solution = new Solution_1();
		int[] res = solution.nextGreaterElement(nums1, nums2);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		} 
	}

	/**
	 * 引入了单调栈
	 *
	 */
	static class Solution_1 {
		public int[] nextGreaterElement(int[] nums1, int[] nums2) {
			int[] res = new int[nums1.length];
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			Stack<Integer> ss = new Stack<Integer>();
			for (int i = nums2.length - 1; i >= 0; i--) {
				while (!ss.isEmpty() && nums2[i] >= ss.peek()) {
					ss.pop();
				}
				if (ss.isEmpty()) {
					map.put(nums2[i], -1);
				} else {
					map.put(nums2[i], ss.peek());
				}
				ss.push(nums2[i]);
			}

			for (int i = 0; i < nums1.length; i++) {
				res[i] = map.get(nums1[i]);
			}
			return res;
		}
	}
}
