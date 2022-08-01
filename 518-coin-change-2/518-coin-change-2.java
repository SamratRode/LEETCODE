class Solution {
    int way=0;
    
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        int index=0;
        return ways(index,amount,coins,dp);
        
    }
    public int ways(int index,int amount,int[] coins,int[][] dp){
        if(dp[amount][index]!=-1){
            return dp[amount][index];
        }
        if(index==coins.length){
            if(amount==0){
                return 1;
                
            
            }
            return 0;
        }
        int left=0;
        if(coins[index]<=amount){
            left=ways(index,amount-coins[index],coins,dp);
        }    
        
        int right=ways(index+1,amount,coins,dp);
        return dp[amount][index]=left+right;
        
        
        
    }
}