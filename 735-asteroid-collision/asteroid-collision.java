class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int curr : asteroids){
            if(curr > 0){
                stack.push(curr);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && curr < 0){
                    if(Math.abs(curr) > stack.peek()){
                        stack.pop();
                    }
                    else if(stack.peek() == Math.abs(curr)){
                        stack.pop();
                        curr = 0;
                        break;
                    }
                    else{
                        curr = 0;
                        break;
                    }
                }
                if(curr!=0){
                    stack.push(curr);
                }
            }
        }
        int res[] = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}