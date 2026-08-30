class Solution {
    public int minimumDeletions(int[] nums) {
        int min_index = 0;
        int max_index = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[max_index]) {
                max_index = i;
            }
            if(nums[i] < nums[min_index]){
                min_index = i;
            }
        }

        int left = Math.min(min_index, max_index);
        int right = Math.max(min_index, max_index);

        int start = right + 1;
        int end = n - left;
        int start_end = (left + 1) + (n - right);

        return Math.min(start, Math.min(end, start_end));
    }
}