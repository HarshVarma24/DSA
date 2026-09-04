class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max_num = Integer.MIN_VALUE;
        int score = 0;
        for(int i = 0; i < nums.length; i++){
            int min_num = Integer.MAX_VALUE;
            max_num = Math.max(max_num, nums[i]);
            for(int j = i; j < nums.length; j++){
                min_num = Math.min(min_num, nums[j]);
            }
            score = max_num - min_num;
            if(score <= k) return i;
        }
        return -1;
    }
}