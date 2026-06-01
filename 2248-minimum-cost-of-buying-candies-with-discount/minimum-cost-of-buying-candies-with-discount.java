class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int candy_cost = 0;
        int skip_counter = 0;

        for(int i = cost.length - 1; i >= 0; i--){
            skip_counter++;
            if(skip_counter % 3 != 0){
                candy_cost = candy_cost + cost[i];
            }
            System.out.print(candy_cost);
        }
        return candy_cost;
    }
}