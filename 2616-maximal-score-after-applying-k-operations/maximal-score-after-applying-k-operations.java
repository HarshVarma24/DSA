class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int n = nums.length;
        long res = 0;
        for(int num : nums){
            pq.add(num);
        }

        for(int i = 0; i < k; i++){
            int temp = pq.poll();
            res += temp;
            //double update_val = (double)temp/3;
            //pq.add((int)Math.ceil(update_val));
            if(temp % 3 == 0){
                pq.add(temp / 3);
            }else{
                pq.add((temp / 3)+1);
            }
        }
        return res;
    }
}