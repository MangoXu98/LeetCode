package dynamic;

import java.util.Arrays;

public class C300 {
    public static void main(String[] args) {
        int[] nums = { 0 };
        solution_1 solution = new solution_1();
        System.out.print(solution.lengthOfLIS(nums));
    }

    static class solution_1 {
        public int lengthOfLIS(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }

            int[] dp = new int[n];
            Arrays.fill(dp, 1);
            int res = 1;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }

                res = Math.max(res, dp[i]);
            }

            return res;
        }
    }
}
