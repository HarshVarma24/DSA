class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sToTmap= new HashMap<>();
        HashMap<Character, Character> tToSmap= new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        int n = s.length();
        for(int i = 0; i < n; i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(!sToTmap.containsKey(s1)){
                sToTmap.put(s1, t1);
            }
            if(!tToSmap.containsKey(t1)){
                tToSmap.put(t1, s1);
            }
            if(sToTmap.get(s1) != t1 || tToSmap.get(t1) != s1){
                return false;
            }
        }
        return true;
    }
}