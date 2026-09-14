class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroCount = 0;
        for(int num: nums){
            if(num != 0){
                prod *= num;
            }else{
                zeroCount++;
            }
        }
        if(zeroCount > 1){
            return new int[nums.length];
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 0){
                ans[i] = (nums[i] == 0) ? prod : 0; 
            }else{
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  
