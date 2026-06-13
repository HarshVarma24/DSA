class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            int sum = 0;
            for(char ch : s.toCharArray()){
                sum += weights[ch - 'a'];
            }
            int weight_res = sum % 26;
            sb.append((char)('z' - weight_res));  
        }
        return sb.toString();
    }
}