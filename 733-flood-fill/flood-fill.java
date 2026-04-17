class Solution {
    int rows;
    int columns;
    void dfs(int row, int col, int newColor, int curColor, boolean[][] visited, int[][] image){
        if(row<0 || row >= rows || col < 0 || col >= columns) return;
        if(image[row][col] != curColor) return;
        if(visited[row][col] == true) return;
        else{
            image[row][col] = newColor;
            visited[row][col] = true;
            int[][] adjList = {{row-1, col}, {row, col+1}, {row+1, col}, {row, col-1}};
            for(int neighbor[] : adjList){
                dfs(neighbor[0], neighbor[1], newColor, curColor, visited, image);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       rows = image.length;
       columns = image[0].length;
       boolean[][] visited = new boolean[rows][columns];
       dfs(sr, sc, color, image[sr][sc], visited, image);
       return image;

    }
}