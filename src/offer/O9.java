package offer;

import java.util.Stack;

public class O9 {
	public static void main(String[] args) {
		Solution_1 solution = new Solution_1();
		solution.appendTail(3);
		int param_2 = solution.deleteHead();
		System.out.print(param_2);
	}

	/**
	 * Offer 09.用两个栈实现队列 方法：
	 * 
	 */
	static class Solution_1 {
		Stack<Integer> stack1;
		Stack<Integer> stack2;

		public Solution_1() {
			stack1 = new Stack<Integer>();
			stack2 = new Stack<Integer>();
		}

		public void appendTail(int value) {
			while (!stack1.isEmpty()) {
				stack2.add(stack1.pop());
			}

			stack1.add(value);

			while (!stack2.isEmpty()) {
				stack1.add(stack2.pop());
			}
		}

		public int deleteHead() {
			if (stack1.isEmpty()) {
				return -1;
			}
			return stack1.pop();
		}
	}
}
