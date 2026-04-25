class Solution {

    public int swap(List<Integer> idx){
        int cost = 0;
        for(int i = 0; i < idx.size(); i++){
            cost += Math.abs(idx.get(i) - (2*i));
        }
        return cost;
    }
    public int minSwaps(int[] nums) {
        List<Integer> even_idx = new ArrayList<>();
        List<Integer> odd_idx = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) even_idx.add(i);
            else{
                odd_idx.add(i);
            }
        }

        int even_count = even_idx.size();
        int odd_count = odd_idx.size();

        int ans = Integer.MAX_VALUE;

        if(Math.abs(even_count - odd_count) > 1) return -1;

        if(even_count >= odd_count){
            ans = Math.min(ans, swap(even_idx));
        }
        if(even_count <= odd_count){
            ans = Math.min(ans, swap(odd_idx));
        }
        return ans;
    }
}