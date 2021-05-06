package stack;

import java.util.Stack;

public class C682 {
	public static void main(String[] args) {
		String[] ops = { "5", "2", "C", "D", "+" }; 
		int res = Solution_1.calPoints(ops);
		System.out.print(res);
	}

	static class Solution_1 {
		static int calPoints(String[] ops) {
			int sum = 0;
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < ops.length; i++) {
				if (ops[i].equals("C")) {
					stack.pop();
				} else if (ops[i] == "D") {
					stack.push(stack.peek() * 2);
				} else if (ops[i] == "+") {
					int top = stack.pop();
					int newtop = stack.peek() + top;
					stack.push(top);
					stack.push(newtop);
				} else {
					stack.push(Integer.valueOf(ops[i]));
				}
			}
			for (int score : stack) {
				sum += score;
			}
			return sum;
		}
	}
}
