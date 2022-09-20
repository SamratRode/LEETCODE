class Solution {
    public int singleNumber(int[] nums) {
        int f=nums[0];
        for(int i=1;i<nums.length;i++){
            f=f^(nums[i]);
        }
        return f;
    }
}