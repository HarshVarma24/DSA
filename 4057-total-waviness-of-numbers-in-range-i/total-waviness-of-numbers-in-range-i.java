class Solution {
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for (int i = num1; i <= num2; i++) {
            result += waviness(i);
        }
        return result;
    }

    public int waviness(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            if ((s.charAt(i - 1) > s.charAt(i) && s.charAt(i + 1) > s.charAt(i)) ||
                    (s.charAt(i - 1) < s.charAt(i) && s.charAt(i + 1) < s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}