package dynamic;

public class C198 {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 1, 2};
		solution_1 solution = new solution_1();
		System.out.print(solution.rob(nums));
	}

	static class solution_1 {
		public int rob(int[] nums) {
			int max1 = 0;
			int max2 = 0;
			for (int i = 0; i < nums.length; i += 2) {
				max1 += nums[i]; 
			}
			for(int j=1;j<nums.length;j+=2) {
				max2 += nums[j];
			}
			return Math.max(max1, max2);
		}
	}
}
