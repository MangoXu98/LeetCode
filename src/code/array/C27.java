package code.array;

public class C27 {
	static int removeElement(int[] nums, int val) { 
		int count = 0;
		for (int i = 0; i < nums.length - count; i++) {
			if (nums[i] == val) {
				int j = i;
				while (j < nums.length - 1) {
					nums[j] = nums[j + 1];
					j++;
				}
				i--;
				count++;
			}
		}
		return nums.length - count;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(removeElement(nums, val));
	}
}
