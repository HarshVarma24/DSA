class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int num : nums){
            if(max <= num){
                second_max = max;
                max = num;
            }else if(second_max <= num){
                second_max = num;
            }
        }
        return (max - 1) * (second_max - 1);
    }
}