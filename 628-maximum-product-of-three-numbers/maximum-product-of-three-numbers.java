class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;

        int min_1 = 0;
        int min_2 = 0;

        for(int num : nums){
            if(max <= num){
                third_max = second_max;
                second_max = max;
                max = num;
            }
            else if(second_max < num){
                third_max = second_max;
                second_max = num;
            }
            else if(third_max < num){
                third_max = num;
            }
            if(min_1 >= num){
                min_2 = min_1;
                min_1 = num;
            }
            else if(min_2 >= num){
                min_2 = num;
            }
        }
        return Math.max(max * second_max * third_max, min_1 * min_2 * max);
    }
}