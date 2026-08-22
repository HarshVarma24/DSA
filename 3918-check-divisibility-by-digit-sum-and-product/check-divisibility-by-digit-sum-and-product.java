class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp = temp / 10;
        }
        System.out.println(sum);
        int prod_sum = sum + prod;
        if(n % prod_sum == 0){
            return true;
        }
        return false;
    }
}