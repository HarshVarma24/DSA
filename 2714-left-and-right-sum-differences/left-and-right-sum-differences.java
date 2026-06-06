class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left_sum = new int[n];
        int[] right_sum = new int[n];
        int[] ans = new int[n];

        right_sum[n - 1] = 0;
        left_sum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            left_sum[i] = left_sum[i - 1] + nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            right_sum[i] = right_sum[i + 1] + nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(left_sum[i] - right_sum[i]);
        }
        return ans;
    }
}