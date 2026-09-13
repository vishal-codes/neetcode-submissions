class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            buckets.get(e.getValue()).add(e.getKey());
        }

        int[] ans = new int[k];
        int j  = 0;
        for(int i = nums.length; i >= 0 && k > 0 ; i--){
            for(int x: buckets.get(i)){
                ans[j++] = x;
                k--;
            }
        }

        return ans;
    }
}
