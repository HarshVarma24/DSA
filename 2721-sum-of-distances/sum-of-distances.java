class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> same_valueIdx = new HashMap<>();
        for(int i = 0; i < n; i++){
            same_valueIdx.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        long[] res = new long[n];
        for(List<Integer> list_samevalueIdx : same_valueIdx.values()){
            long total = 0;
            for(int idx : list_samevalueIdx){
                total += idx;
            }

            long prefix_sum = 0;
            int size = list_samevalueIdx.size();

            for(int i = 0; i < size; i++){
                int idx_value = list_samevalueIdx.get(i);
                res[idx_value] = total - prefix_sum * 2 + (long)idx_value * (2 * i - size);
                prefix_sum += idx_value; 
            }
        }
        return res;
    }
}