class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n-1]=fib(n-1);
            dp[n-2]=fib(n-2);
            return dp[n-1]+dp[n-2];
        }
    }
}