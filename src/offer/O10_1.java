package offer;

public class O10_1 {
	public static void main(String[] args) {
		Solution_1 solution = new Solution_1();
		int param_2 = solution.fib(5);
		System.out.print(param_2);
	}

	/**
	 * Offer 10_I. 쳲��������� �������ص�ע�⣡�� �ݹ�ķ���Ҫ����ʱ������
	 * 
	 */
	static class Solution_1 {
		public int fib(int n) {
			int a = 0, b = 1, sum;
			for (int i = 0; i < n; i++) {
				sum = (a + b) % 1000000007;
				a = b;
				b = sum;
			}
			return a;
		}
	}
}
