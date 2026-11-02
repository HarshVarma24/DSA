class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        int median = nums[n / 2];
        for(int num : nums){
            sum += Math.abs(median - num);
        }
        return sum;
    }
}