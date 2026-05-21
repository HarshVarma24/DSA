class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int common_prefixLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            while (num > 0) {
                set.add(num);
                num = num / 10;
            }
        }

        for (int check : arr2) {
            while (check > 0) {
                if (set.contains(check)) {
                    int prefix_length = String.valueOf(check).length();
                    System.out.println(prefix_length);
                    if (common_prefixLength < prefix_length) {
                        common_prefixLength = prefix_length;
                    }
                }
                check = check / 10;
            }
        }
        return common_prefixLength;
    }
}