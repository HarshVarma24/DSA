class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // 1. Initialize result with the first possible triplet
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < n - 2; i++) {
            int li = i + 1;
            int ri = n - 1;
            
            while (li < ri) {
                int currentSum = nums[i] + nums[li] + nums[ri];
                
                // 2. Update closestSum if currentSum is actually closer
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // 3. Move pointers based on the sum's relation to target
                if (currentSum < target) {
                    li++; // Need a larger sum
                } else if (currentSum > target) {
                    ri--; // Need a smaller sum
                } else {
                    return currentSum; // Perfect match found
                }
            }
        }
        return closestSum;
    }
}