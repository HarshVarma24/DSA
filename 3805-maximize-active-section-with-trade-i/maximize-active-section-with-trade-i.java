class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int count_1 = 0;
        int block_1 = 0;
        int block_2 = 0;

        int max = 0;
        int i = 0;
        while (i < n) {
            char ch = arr[i];

            if (ch == '0') {
                block_1++;
                i++;
            }

            else {
                while (i < n && arr[i] == '1') {
                    i++;
                    count_1++;
                }

                while (i < n && arr[i] == '0') {
                    i++;
                    block_2++;
                }

                if (block_1 != 0 && block_2 != 0) {
                    max = Math.max(max, block_1 + block_2);
                }
                block_1 = block_2;
                block_2 = 0;
            }
        }
        return count_1 + max;
    }
}