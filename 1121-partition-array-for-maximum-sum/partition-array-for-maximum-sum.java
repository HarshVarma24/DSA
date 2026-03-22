class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, arr, k, dp);
    }

    public int solve(int indx, int[] arr, int k, int[] dp) {
        int n = arr.length;
        if (indx == n) return 0;
        if (dp[indx] != -1) return dp[indx];

        int max = 0;
        int answer = 0;

        for (int j = indx; j < Math.min(n, indx + k); j++) {
            max = Math.max(max, arr[j]);
            int len = j - indx + 1;
            int sum = max * len + solve(j + 1, arr, k, dp);
            answer = Math.max(answer, sum);
        }
        return dp[indx] = answer;
    }
}