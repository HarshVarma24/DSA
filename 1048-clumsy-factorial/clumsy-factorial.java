class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n--);
        int i = 0;
        while(n > 0){
            switch(i % 4){
                case 0:
                    stack.push(n * stack.pop());
                    break;
                case 1:
                    stack.push(stack.pop() / n);
                    break;
                case 2:
                    stack.push(n);
                    break;
                case 3:
                    stack.push(-1 * n);
                    break;
                }
                i++;
                n--;
            }
            int ans = 0;
            while(!stack.isEmpty()){
                ans+=stack.pop();
            }
            return ans;
        }
    }