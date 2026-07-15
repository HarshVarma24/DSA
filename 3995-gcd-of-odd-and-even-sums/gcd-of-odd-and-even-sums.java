class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = n * (n + 1);
        int sumOdd = n * n;

        return gcd(sumOdd, sumEven);
    }

    public int gcd(int sumOdd, int sumEven){
        if(sumOdd == 0){
            return sumEven;
        }
        return gcd(sumEven % sumOdd, sumOdd);
    }
}