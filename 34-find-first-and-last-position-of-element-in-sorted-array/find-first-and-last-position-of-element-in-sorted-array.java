class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int fo = -1;
        int [] result = new int[2];

        // First occurrence
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                fo = mid;
                high = mid - 1; 
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        result[0] = fo;

        // Last occurrence
        int start = 0;
        int end = nums.length - 1;
        int lo = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                lo = mid;
                start = mid + 1;  
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        result[1] = lo;

        return result;
    }
}
