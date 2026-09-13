class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = entryList.get(i).getKey();
        }
        return ans;

    }
}
