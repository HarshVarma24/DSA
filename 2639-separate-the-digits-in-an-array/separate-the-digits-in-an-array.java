class Solution {
    public int[] separateDigits(int[] nums) {
    List<Integer> res = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            int val = nums[i];
            while(val > 0){
                res.add(val % 10);
                val = val / 10;
            }
        }
        Collections.reverse(res);
        int[] answer = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            answer[i] = res.get(i);
        }
        return answer;
    }
}