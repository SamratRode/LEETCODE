class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        if(l==0){
            return 0;
        }
        else{
            return haystack.indexOf(needle);
        }
    }
}