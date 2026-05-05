class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        long max = 0;
        for(int num: milestones){
            sum+=num;
            max = Math.max(max, num);
        }
        if(max > (sum-max)) return 2 * (sum-max) + 1;
        return sum;
    }
}