class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;

        int[] newnums = new int[n+2];
        newnums[0] = 1;
        newnums[n + 1] = 1;

        for(int i = 0; i < n; i++){
            newnums[i+1] = nums[i];
        }

        int[][] dp = new int[n+2][n+2];
        for(int[] rows:dp){
            Arrays.fill(rows, -1);
        }
        return solve(newnums, 0, n + 1, dp);
    }

    public int solve(int[] nums, int i, int j, int[][] dp){
        if(dp[i][j] != -1) return dp[i][j];

        if(i > j) return 0;

        int max_cost = 0;
        for(int k = i+1; k < j; k++){
            int total_cost = (nums[i] * nums[k] * nums[j])+ solve(nums, i, k, dp) + solve(nums, k, j, dp);

            max_cost = Math.max(max_cost, total_cost);
        }
        return dp[i][j] = max_cost;
    }
}