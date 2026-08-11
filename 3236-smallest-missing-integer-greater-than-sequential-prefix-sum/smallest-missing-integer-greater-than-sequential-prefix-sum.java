class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i < n-1 && (nums[i + 1] - nums[i]) != 1) {
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}