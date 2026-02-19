class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0;
        if(n == 1){
            return 0;
        }
        for(int i = 1; i < n; i++){
            int prev_buy = buy;
            int prev_sell = sell;
            int prev_cooldown = cooldown;

            buy = Math.max(prev_buy, prev_cooldown - prices[i]);
            sell = Math.max(prev_sell, prev_buy + prices[i]);
            cooldown = Math.max(prev_cooldown, prev_sell);
        }
        return sell;
    }
}