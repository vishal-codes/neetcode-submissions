class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            char[] freq = new char[26];

            for(int j = 0; j < word.length(); j++){
                freq[word.charAt(j) - 'a']++;
            }

            String keyStr = String.valueOf(freq);
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
