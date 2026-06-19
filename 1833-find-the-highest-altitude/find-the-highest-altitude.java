class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] prefix_sum = new int[n+1];
        prefix_sum[0] = 0;
        for(int i = 1; i <= n; i++){
            prefix_sum[i] = prefix_sum[i-1] + gain[i-1];                         
        }
        Arrays.sort(prefix_sum);
        return prefix_sum[n];
    }
}