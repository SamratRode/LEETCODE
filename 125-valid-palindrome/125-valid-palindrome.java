class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122)||(s.charAt(i)>=48) && (s.charAt(i)<=57)){
                s1=s1+s.charAt(i);
            }
        }
        int a=0;
        if(s1.length()==0){
            return true;
        }
        int z=s1.length()-1;
        while(a<=z){
            if(s1.charAt(a)!=s1.charAt(z)){
                return false;
            }
            else{
                a++;
                z--;
            }
        }
        return true;
    }
}