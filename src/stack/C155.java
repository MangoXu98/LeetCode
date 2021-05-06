package stack;
 
import java.util.Stack; 

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。 
 *
 */
public class C155 {
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); 
		minStack.pop();
		minStack.top();     
		minStack.getMin();  
	}


	/** 题目更主要考察的是 常数级时间内返回最小值  */
	static class MinStack {
		Stack<Integer> stack;
		Stack<Integer> helper;
		
	    public MinStack() {
	    	stack = new Stack<Integer>();
	    	helper = new Stack<Integer>();
	    	helper.push(Integer.MAX_VALUE);
	    }
	    
	    public void push(int x) {
	    	stack.push(x);
	    	helper.push(Math.min(x, helper.peek())); 
	    }
	    
	    public void pop() {
	    	stack.pop();
	    	helper.pop(); 
	    }
	    
	    public int top() {
			return stack.peek(); 
	    }
	    
	    public int getMin() {
			return helper.peek(); 
	    }
	}
}
