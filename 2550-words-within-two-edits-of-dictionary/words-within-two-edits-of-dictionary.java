class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            for (int j = 0; j < dictionary.length; j++) {
                int diff_char = 0;
                String dict = dictionary[j];

                for (int k = 0; k < dict.length(); k++) {
                    if (query.charAt(k) != dict.charAt(k)) {
                        diff_char++;
                    }
                }
                if (diff_char <= 2) {
                    result.add(queries[i]);
                    break;
                }
            }
        }
        return result;
    }
}