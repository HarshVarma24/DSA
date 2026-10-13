class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0 ; i < arr.length / 2; i++){
            sum -= arr[i];
        }

        for(int i = arr.length / 2; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}