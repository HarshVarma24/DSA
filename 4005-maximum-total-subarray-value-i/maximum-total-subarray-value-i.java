class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        for(int num : nums){
            min = Math.min(min, num);
        }
        return (long) (max - min)*k;
    }
}