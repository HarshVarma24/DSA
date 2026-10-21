class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        long res = 0;
        for(int num : nums){
            pq.add(num);
        }

        for(int i = 0; i < k; i++){
            int temp = pq.poll();
            res += temp;
            double update_val = (double)temp/3;
            pq.add((int)Math.ceil(update_val));
        }
        return res;
    }
}