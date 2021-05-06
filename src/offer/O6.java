package offer;

import java.util.ArrayList;

public class O6 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		// ListNode second = new ListNode(3);
		// ListNode third = new ListNode(2);
		// head.next= second;
		// second.next = third;
		Solution_1 solution = new Solution_1();
		int[] res = solution.reversePrint(head);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}

	/**
	 * 方法： 1. 利用栈的先进后出的方法（最优） 2.
	 * 
	 */
	static class Solution_1 {
		public int[] reversePrint(ListNode head) {
			ArrayList<Integer> list = new ArrayList<>();
			while (head != null) {
				list.add(head.val);
				head = head.next;
			}
			int n = list.size();
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = list.get(n - i - 1);
			}
			return res;
		}
	}
}
