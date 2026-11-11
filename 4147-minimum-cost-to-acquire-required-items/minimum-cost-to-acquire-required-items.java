class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long p1 = Math.min(cost1, costBoth);
        long p2 = Math.min(cost2, costBoth);
        long p3 = Math.min(cost1 + cost2, costBoth);

        int cnt = Math.min(need1, need2);
        int extra1 = need1 - cnt;
        int extra2 = need2 - cnt;

        long total_cost = (extra1 * p1) + (extra2 * p2) + cnt * p3;
        return total_cost;
    }
}