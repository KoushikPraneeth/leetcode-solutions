class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        //int[] ans2 = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i]; 
        }
        
        //System.arraycopy(nums, 0, ans, 0, nums.length);
        //System.arraycopy(ans2, 0, ans, nums.length, ans2.length);

        return ans;

    }
}