class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int n1 = 0;
        int n2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                arr1[n1] = nums[i];
                n1++;
            }
            else if(i == 1){
                arr2[n2] = nums[i];
                n2++;
            }
            else{
                if(arr1[n1 - 1] > arr2[n2 - 1]){
                    arr1[n1++] = nums[i];
                }
                else{
                    arr2[n2++] = nums[i];
                }
            }
        }
        for(int i = 0; i < n2; i++){
            arr1[n1++] = arr2[i];
        }
        return arr1;
    }
}