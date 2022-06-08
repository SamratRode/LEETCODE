class Solution {
    public int removePalindromeSub(String s) {
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        int a=0;
        int b=s.length()-1;
        boolean palindrome=true;
        while(a<s.length()/2 && b>s.length()/2){
            if(c[a]!=c[b]){
                palindrome=false;
                
            }
            a++;
            b--;
            
        }
        if(palindrome==false){
            return 2;
        }
        else{
            return 1;
        }
        
    }
}