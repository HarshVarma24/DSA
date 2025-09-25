class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            char digit = num.charAt(i);
            while(!stack.isEmpty() && k > 0 && stack.peek() > digit){
                stack.pop();
                k = k - 1;
            }
            stack.push(digit);
        }
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();

    }
}