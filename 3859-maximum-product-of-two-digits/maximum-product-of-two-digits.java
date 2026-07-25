class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        while (n != 0) {
            int rem = n % 10;
            if (max <= rem) {
                second_max = max;
                max = rem;
            } else if (second_max < rem) {
                second_max = rem;
            }
            n = n / 10;
        }
        return max * second_max;
    }
}