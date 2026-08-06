class Solution {
    public int smallestNumber(int n, int t) {
        while (product(n) % t != 0) {
            n++;
        }
        return n;
    }

    public int product(int n) {
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp = temp / 10;
        }
        return product;
    }
}