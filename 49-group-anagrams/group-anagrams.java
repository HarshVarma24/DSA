class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> string_map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted_str = new String(ch);

            if(string_map.containsKey(sorted_str)){
                string_map.get(sorted_str).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                string_map.put(sorted_str, strList);
            } 
        }
        return new ArrayList<>(string_map.values());
    }
}