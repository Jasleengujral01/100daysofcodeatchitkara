class Solution {
    public int numWays(int steps, int arrLen) {
        int MOD = 1000000007;
        int maxPosition = Math.min(steps / 2, arrLen - 1);
        int[][] dp = new int[steps + 1][maxPosition + 1];
        
        dp[0][0] = 1;  // Starting at index 0
        
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxPosition; j++) {
                dp[i][j] = dp[i - 1][j];  // Stay in the same place
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;  // Move one step left
                }
                if (j < maxPosition) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;  // Move one step right
                }
            }
        }
        
        return dp[steps][0];
    }
}
