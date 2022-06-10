class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=1;
        if(s.length()==0){
            return 0;
        }
        
        int max=1;
        HashSet<Character> hm=new HashSet();
        while(j<s.length()){
            
            if(!hm.contains(s.charAt(j))){
                hm.add(s.charAt(i));
                hm.add(s.charAt(j));
                if(hm.size()>max){
                    max=hm.size();
                }
                
                j++;
            }
            else{
                hm.clear();
                i++;
                j=i+1;
                
            }
                
        }
        
        return max;
    }
}