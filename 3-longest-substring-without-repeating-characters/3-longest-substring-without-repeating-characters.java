class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=1;
        if(s.length()==0){
            return 0;
        }
        char[] ch=new char[s.length()];
        for(int k=0;k<s.length();k++){
            ch[k]=s.charAt(k);
        }
        int max=1;
        HashSet<Character> hm=new HashSet();
        while(j<s.length() && i<s.length()){
            
            if(ch[i]!=ch[j] && !hm.contains(ch[j])){
                hm.add(ch[i]);
                hm.add(ch[j]);
                if(hm.size()>max){
                    max=hm.size();
                }
                // System.out.println(hm);
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