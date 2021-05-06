package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. �ö���ʵ��ջ ʹ�ö���ʵ��ջ�����в�����
 * 
 * push(x) -- Ԫ�� x ��ջ pop() -- �Ƴ�ջ��Ԫ�� top() -- ��ȡջ��Ԫ�� empty() -- ����ջ�Ƿ�Ϊ��
 *
 */
public class C225 {
	public static void main(String[] args) {
		MyStack obj = new MyStack();
		obj.push(1);
		obj.push(2); 
	}
	/**
	 * ע�ⲻҪ������queueֻ���Ƚ��ȳ�
	 *
	 */
	static class MyStack {
		Queue<Integer> queue;
		Queue<Integer> helper;

		/** Initialize your data structure here. */
		public MyStack() {
			queue = new LinkedList<Integer>();
			helper = new LinkedList<Integer>();
		}

		/** Push element x onto stack. */
		public void push(int x) {
			helper.offer(x); 
			while (!queue.isEmpty()) {
				helper.offer(queue.poll());
			}
			
			Queue<Integer> tmp = helper;
			helper = queue;
			queue = tmp;
		}
		

		/** Removes the element on top of the stack and returns that element. */
		public int pop() {
			return queue.poll();
		}

		/** Get the top element. */
		public int top() {
			return queue.peek();
			
		}

		/** Returns whether the stack is empty. */
		public boolean empty() {
			return queue.isEmpty();
		}
	}
}
