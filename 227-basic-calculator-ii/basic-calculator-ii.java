class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        char op = '+';

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                curr = curr * 10 + (ch - '0');
            }

            if(!Character.isDigit(ch) && ch!= ' ' || i == s.length() - 1){
                if(op == '+'){
                    stack.push(curr);
                    curr = 0;
                }
                else if(op == '-'){
                    stack.push(-1 * curr);
                    curr = 0;
                }
                else if(op == '*'){
                    stack.push(curr * stack.pop());
                    curr = 0;
                }
                else if(op == '/'){
                    stack.push(stack.pop() / curr);
                    curr = 0;
                }
                op = ch;
                curr = 0;
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}