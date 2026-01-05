class Solution {
    public int firstUniqChar(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < ch.length; i++){
            if(map.get(ch[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}