class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        int maxLength=1;
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
        }
        //k=2
        int start=0;
        
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLength=2;
            }
            else{
                dp[i][i+1]=false;
            }
        }
        //k=3
        for(int k=3;k<=s.length();k++){
            for(int i=0;i<s.length()-k+1;i++){
                int j=i+k-1;
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                    if(k>maxLength){
                        start=i;
                        maxLength=k;
                    }
                }
            }
        }
        return s.substring(start,start+maxLength);
    }
}