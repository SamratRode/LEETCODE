class Solution {
    public int minMoves2(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            sum=sum+Math.abs(mid-nums[i]);
        }
        return sum;
    }
}