class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffix = new int[n + 1];

        for(int i = n - 1; i >= 0; i--){
            suffix[i] = suffix[i+1] + piles[i];
        }

        int[][] dp = new int[n+1][n+1];

        for(int i = n - 1; i >= 0; i--){
            for(int m = 1; m <= n; m++){
                if(i + 2 * m >= n){
                    dp[i][m] = suffix[i];
                    continue;
                }

                for(int x = 1; x <= 2 * m; x++){
                    int newM = Math.max(m, x);

                    int target = suffix[i];
                    int oppo = dp[i+x][newM];
                    int curr = target - oppo;

                    dp[i][m] = Math.max(dp[i][m], curr);
                }
            }
        }
        return dp[0][1];
    }
}