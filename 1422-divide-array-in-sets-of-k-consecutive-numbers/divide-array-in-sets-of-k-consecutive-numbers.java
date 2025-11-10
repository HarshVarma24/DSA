class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }

        while(!pq.isEmpty()){
            int curr = pq.poll();
            for(int i = 1; i < k; i++){
                if(!pq.remove(curr+i)) return false;
            }
        }
        return true;
    }
}       