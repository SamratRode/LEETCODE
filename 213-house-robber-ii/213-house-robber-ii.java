class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length-1;
        int[] dp1=new int[n+1];
        Arrays.fill(dp1,-1);
        int[] dp2=new int[n+1];
        Arrays.fill(dp2,-1);
        return Math.max(f(1,n,nums,dp1),f(0,n-1,nums,dp2));
    }
    public int f(int start, int n, int[] nums, int[] dp){
        if(n==start){
            return nums[start];
        }
        if(n<start){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick=nums[n]+f(start,n-2,nums,dp);
        int nonpick=f(start,n-1,nums,dp);
        dp[n]=Math.max(pick,nonpick);
        // System.out.println(dp[n]);
        return dp[n];
    }
}