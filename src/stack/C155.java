package stack;
 
import java.util.Stack; 

/**
 * 155. ��Сջ
 * ���һ��֧�� push ��pop ��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��
 * push(x) ���� ��Ԫ�� x ����ջ�С�
 * pop() ���� ɾ��ջ����Ԫ�ء�
 * top() ���� ��ȡջ��Ԫ�ء�
 * getMin() ���� ����ջ�е���СԪ�ء� 
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


	/** ��Ŀ����Ҫ������� ������ʱ���ڷ�����Сֵ  */
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
