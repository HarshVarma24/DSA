class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==temp && nums[i] >= 1){
                temp++;
            }
        }
        return temp;
    }
}