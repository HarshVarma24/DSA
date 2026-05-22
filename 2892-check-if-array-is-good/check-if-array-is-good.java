class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int count = 0;
        for(int i = 0 ; i < n; i++){
            if(nums[i] == max){
                count++;
            }
        }
        if(count != 2 || max+1 != n){
            return false;
        }
        int[] freq = new int[max+1];

        for(int i = 0; i < n; i++){
            freq[nums[i]]++;
        }
        for(int i = 1; i < max; i++){
            if(freq[i] != 1) return false;
        }
        return true;
    }
}