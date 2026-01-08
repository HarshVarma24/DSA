class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        int indx = 0;
        int endindx = goal.length();
        String new_str = s+s;
        for(int i = 0; i < s.length(); i++){
            String sub = new_str.substring(indx, endindx);
            if(sub.equals(goal)) return true;
            indx++;
            endindx++;
        }
        return false;
    }
}