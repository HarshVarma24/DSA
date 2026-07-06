class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]){
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int second_col = 0;
        int count = 0;
        for(int[] interval : intervals){
            if(interval[1] > second_col){
                count++;
                second_col = interval[1];
            }  
        }
        return count;
    }
}