class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] state = new long[k];

        for (int num : nums) {
            int rem = num % k;
            long[] nextstate = new long[k];

            for(int i = 0; i < k; i++){
                int newRem = (i * rem) % k;
                nextstate[newRem] += state[i];
                result[newRem] += state[i];
            }
            nextstate[rem]++;
            result[rem]++;
            state = nextstate;
        }
        return result;
    }
}