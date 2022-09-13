class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0){
            flag=-1;
        }
        x=Math.abs(x);
        long ans=0;
        while(x!=0){
            ans=ans*10+(x%10);
            x=x/10;
            
        }
        if(ans!=(int)ans){
            return 0;
        }
        if(flag==-1){
            return (int)ans*-1;
        }
        return (int)ans;
        
    }
}