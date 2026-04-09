class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] out = new int[n + 1];
        int[] in = new int[n + 1];
        for(int[] edges : trust){
            out[edges[0]]++;
            in[edges[1]]++;
        }

        for(int i = 1; i <= n; i++){
            if(in[i] == n - 1 && out[i] == 0) return i;
        }
        return -1;
    }
}