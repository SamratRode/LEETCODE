class Solution {
    public boolean isHappy(int n) {
        n=squaresum(n);
        n=squaresum(n);
        while(n>=10){
           n=squaresum(n);
        }
        if(n==1){
            return true;
        }
        return false;
    }
    public int squaresum(int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum=sum+(a*a);
            n=n/10;
        }
        // System.out.println(sum);
        return sum;
    }
}