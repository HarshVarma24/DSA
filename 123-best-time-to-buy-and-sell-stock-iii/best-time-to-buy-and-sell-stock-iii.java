class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int min = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] < min) {
                min = prices[i];
            }
            left[i]= Math.max(left[i-1], prices[i] - min); 
        }

        int max = prices[n-1];
        for(int i = n-2; i >= 0; i--){
            if(prices[i] > max){
                max = prices[i];
            }
            right[i] = Math.max(right[i+1], max - prices[i]);
        }

        for(int i = 0; i < n; i++){
            System.out.print(right[i] + " ");
        }

        int profit = 0;
        for(int i = 0; i < n; i++){
            profit = Math.max(profit, left[i]+right[i]);
        }
        return profit;
    }
}