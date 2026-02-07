class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] grid = new int[m][n];

        // initialize start cell
        if (obstacleGrid[0][0] == 1) return 0;
        grid[0][0] = 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    grid[i][j] = 0;
                    continue;
                } 
                if(i == 0 && j == 0) continue;

                int up = (i > 0) ? grid[i-1][j] : 0;
                int left = (j > 0) ? grid[i][j-1] : 0;

                grid[i][j] = up + left;
            }
        }
        return grid[m-1][n-1];
    }
}
