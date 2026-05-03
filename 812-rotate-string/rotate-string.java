class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        int start_idx = 0;
        int end_idx = goal.length();
        String str = s + s;
        if (str.contains(goal))
            return true;
        return false;
    }
}