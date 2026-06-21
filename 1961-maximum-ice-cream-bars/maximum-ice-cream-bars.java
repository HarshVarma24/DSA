class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int max_sum = 0;
        int count = 0;
        int n = costs.length;
        for(int i = 0; i < costs.length; i++){
            if(max_sum + costs[i] > coins){
                break;
            }
            max_sum += costs[i];
            count++;
        }
        return count;
    }
}           