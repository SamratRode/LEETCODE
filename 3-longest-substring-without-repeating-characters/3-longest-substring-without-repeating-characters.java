class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
    
    if(n==0){
        return 0;
    }
    
    if(n==1){
        return 1;
    }
    
    int maxLen = 0;
    int i = 0;
    while(i < n){
        int len = 0;
        boolean flag = true;
        HashSet<Character> mp = new HashSet<>();
        
        for(int j=i; j<n; j++){
            if(!mp.contains(s.charAt(j))){
                mp.add(s.charAt(j));
            }
            else{
                flag = false;
                len = mp.size();
                maxLen = Math.max(maxLen, len);
                break;
            }
        }
        maxLen = Math.max(maxLen, mp.size());
        if(flag == true && mp.size() == s.length()){
            return s.length();
        }
        i++;
    }
    return maxLen;
    }
}