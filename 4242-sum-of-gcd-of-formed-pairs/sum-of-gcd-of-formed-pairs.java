class Solution {
    public long gcdSum(int[] nums) {
        int[] gcd_arr = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            gcd_arr[i] = gcd(nums[i], max);
        }
        Arrays.sort(gcd_arr);

        long res_sum = 0;
        for(int i = 0, j = gcd_arr.length - 1; i < j; i++, j--){
            res_sum += gcd(gcd_arr[i], gcd_arr[j]);
        }
        return res_sum;
    }

    public int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}