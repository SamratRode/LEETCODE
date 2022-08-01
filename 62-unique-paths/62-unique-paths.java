class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
            
        }
        
        return count(0,0,m,n,dp);
    }
    public int count(int r,int c,int m,int n,int[][] dp){
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        if(r==m+1 && c==n+1){
            return 0;
        }
        if(r==m-1 || c==n-1){
            return 1;
        }
        int left=count(r+1,c,m,n,dp);
        int right=count(r,c+1,m,n,dp);
        return dp[r][c]=left+right;
    }
}