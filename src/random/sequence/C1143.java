package random.sequence;
 

public class C1143 {
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "def";
        Solution_1 solution = new Solution_1();
        System.out.println(solution.longestCommonSubsequence(text1, text2));
    }

    static class Solution_1 {
        public int longestCommonSubsequence(String text1, String text2) {
            int n = text1.length();
            int m = text2.length();
            if (n == 0 || m == 0) {
                return 0;
            }

            int[][] dp = new int[n + 1][m + 1]; 

            for (int i = 1; i < n + 1; i++) {
                char c1 = text1.charAt(i - 1);
                for (int j = 1; j < m + 1; j++) {
                    if (c1 == text2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }

            return dp[n][m];
        }
    }
}
