class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower_case = new boolean[26];
        boolean[] upper_case = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lower_case[ch - 'a'] = true;
            } 
            else {
                upper_case[ch - 'A'] = true;
            }
        }
        for(int i = 0; i < lower_case.length; i++){
            System.out.println(lower_case[i]);
        }
        for(int i = 0; i < upper_case.length; i++){
            System.out.println(upper_case[i]);
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(lower_case[i] && upper_case[i]){
                count++;
            }
        }
        return count;
    }
}