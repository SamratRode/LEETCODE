class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        String res="";
        for(int i=0;i<s1.length;i++){
            res=res+" "+reverse(s1[i]);
        }
        return res.trim();
        
    }
    public String reverse(String x){
        String rev="";
        for(int i=0;i<x.length();i++){
            rev=x.charAt(i)+rev;
        }
        return rev;
    }
}