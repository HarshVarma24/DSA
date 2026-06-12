class Solution {
    int rows;
    int cols;
    public int countBattleships(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int battleships = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'X' && visited[i][j] != true){
                    dfs(i, j, board, visited);
                    battleships++;
                }
            }
        }
        return battleships;
    }
    public void dfs(int row, int col, char[][] board, boolean[][] visited){
        if(row < 0 || col < 0 || row >= rows || col >= cols || board[row][col] == '.' || visited[row][col]) return;

        visited[row][col] = true;
        int adjList[][] = {{row - 1, col},{row, col + 1},{row, col - 1},{row + 1, col}};
        for(int neighbor[] : adjList){
            dfs(neighbor[0], neighbor[1], board, visited);
        }
    }
}