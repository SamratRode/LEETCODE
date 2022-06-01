class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        int i=1;
        runningSum[0]=nums[0];
        while(i+1<=nums.length){
            runningSum[i]=runningSum[i-1]+nums[i];
            i++;
        }
        return runningSum;
        
    }
}