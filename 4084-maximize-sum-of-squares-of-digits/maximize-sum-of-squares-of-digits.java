class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder str = new StringBuilder();

        if(sum > 9 * num) return "";

        while(sum >= 9){
            str.append('9');
            sum = sum - 9;
            num--;
        }

        if(sum > 0){
            str.append(sum);
            num--;
        }
        while(num > 0){
            str.append('0');
            num--;
        }

        return str.toString();
    }
}