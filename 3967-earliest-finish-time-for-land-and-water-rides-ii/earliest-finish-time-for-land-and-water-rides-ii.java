class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int min_land = Integer.MAX_VALUE;
        int min_water = Integer.MAX_VALUE;

        for(int i = 0; i < landStartTime.length; i++){
            min_land = Math.min(min_land, landStartTime[i] + landDuration[i]);
        }
        System.out.println(min_land);

        for(int i = 0; i < waterStartTime.length; i++){
            ans = Math.min(ans, Math.max(min_land, waterStartTime[i]) + waterDuration[i]);
        }
        System.out.println(ans);

        for(int i = 0; i < waterStartTime.length; i++){
            min_water = Math.min(min_water, waterStartTime[i] + waterDuration[i]);
        }
        System.out.println(min_water);

        for(int i = 0; i < landStartTime.length; i++){
            ans = Math.min(ans, Math.max(min_water, landStartTime[i]) + landDuration[i]);
        }
        System.out.println(ans);
        return ans;
    }
}