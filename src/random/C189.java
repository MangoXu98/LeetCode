package random;

public class C189 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Solution_1 solution = new Solution_1();
		solution.rotate(nums, k);
	}

	/**
	 * forѭ���ķ�ʽ , ��ʱ�临�ӶȽϴ�
	 */
	static class Solution_1 {
		public void rotate(int[] nums, int k) {
			int len = nums.length;
			for (int i = 0; i < k; i++) {
				int end = nums[len - 1];
				for (int j = len - 1; j >= 1; j--) {
					nums[j] = nums[j - 1];
				}
				nums[0] = end;
			}
		}
	}

	/** ��ʵ�Ǹ�������˵ĵ��� */
//	static class Solution_2 {
//		public void rotate(int[] nums, int k) {
//			int len = nums.length;
//			for (int i = 0; i < len; i++) {
//				int x = (i + k) % len;
//				int tmp = nums[i];
//				nums[i] = nums[x];
//				nums[x] = tmp;
//			}
//		}
//	}
}
