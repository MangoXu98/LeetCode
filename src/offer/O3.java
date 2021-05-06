package offer;

import java.util.HashSet;

/**
 * ��ָ Offer 03. �������ظ������� �ҳ��������ظ������֡�
 * 
 * ��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1
 * �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ�������.
 *
 */
public class O3 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 0, 2, 5, 3 };
		Solution_1 solution = new Solution_1();
		System.out.println(solution.findRepeatNumber(nums));
	}

	/**
	 * ���෽���� 1. ���򣬱��� 2. Hash 3. ԭ���û�
	 * 
	 * Ѱ���ظ�����ð취��Hash
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
