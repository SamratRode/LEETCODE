class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a=x;
        int reverse=0;
        while(a!=0){
            int digit=a%10;
            reverse=reverse*10 + digit;
            a=a/10;
            
        }
        if(x==reverse){
            return true;
        }
        return false;
    }
}