class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        String a="";
        for(int i=0;i<s.length();i++){
            a=s.charAt(i)+a;
        }
        // System.out.println(s+" "+a);
        return s.equals(a);
    }
}