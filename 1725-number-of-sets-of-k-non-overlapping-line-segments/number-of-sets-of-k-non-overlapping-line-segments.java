class Solution {
    public int numberOfSets(int n, int k) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= k; i++) {
            long sum = 0;
            for (int j = 1; j < n; j++) {
                sum = (sum + dp[j - 1][i - 1]) % MOD;
                dp[j][i] = (int) ((dp[j - 1][i] + sum) % MOD);
            }
        }

        return dp[n - 1][k];
    }
}