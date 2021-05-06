package hash;

import java.util.HashSet;

public class C202 {
	public static void main(String[] args) {
		int n = 2;
		Solution_1 solution = new Solution_1();
		System.out.println(solution.isHappy(n));
	}

	/**
	 * �ѵ������ж�ʲôʱ��ֹͣѭ�������ֿ��ܣ�
	 * 1. �õ�1��ֹͣѭ����
	 * 2. ���ս���ѭ����
	 * 3. ֵԽ�󣨵�������������ֵС��243��
	 *
	 */
	static class Solution_1 {
		public boolean isHappy(int n) {
			HashSet<Integer> set = new HashSet<>();
			while (n != 1 && !set.contains(n)) {
				n = divide(n);
				set.add(n);
			}
			return n == 1;
		}

		public int divide(int n) {
			int sum = 0;
			while (n > 0) {
				int dd = n % 10;
				n = n / 10;
				sum += Math.pow(dd, 2);
			}
			return sum;
		}
	}

}
