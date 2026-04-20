class Solution {
    public void bfs(int source, int[][] isConnected, boolean[] visited){
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        while(!queue.isEmpty()){
            int top = queue.poll();
            for(int i = 0; i < isConnected.length; i++){
                if(visited[i] == false && isConnected[top][i] == 1){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }
}