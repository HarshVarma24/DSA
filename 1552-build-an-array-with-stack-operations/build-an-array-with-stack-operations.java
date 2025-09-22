class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int index = 0;
        int curr_num = 1;

        while(index < target.length){
            if(target[index] == curr_num){
                operations.add("Push");
                index++;
            }
            else{
                operations.add("Push");
                operations.add("Pop");
            }
            curr_num++;
        }
        return operations;
    }
}