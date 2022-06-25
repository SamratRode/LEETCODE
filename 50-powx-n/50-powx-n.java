class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0){
            return 1;
        }
        
        
        double ans;
        if(n < 0){
            double pow = myPow(x,n/2);
            ans =(pow*pow);
            if(n%2 != 0){
                ans/=x;
            }
          
        }
        
        else{
            double pow = myPow(x,n/2);
            ans = pow*pow;
            if(n%2 != 0){
                ans*=x;
            }
        }    
        
        return ans;
    }
}