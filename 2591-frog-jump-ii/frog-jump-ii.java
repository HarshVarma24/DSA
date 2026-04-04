class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        int ans = Integer.MIN_VALUE;

        int prev = stones[0];
        for(int i = 2; i < n; i = i + 2){
            ans = Math.max(stones[i] - prev, ans);
            prev = stones[i];
        }
        ans = Math.max(ans, stones[1] - stones[0]);
        ans = Math.max(ans, stones[n-1] - stones[n-2]);

        prev = stones[1];
        for(int i = 3; i < n; i = i + 2){
            ans = Math.max(stones[i] - prev, ans);
            prev = stones[i];
        }
        return ans;
    }
}