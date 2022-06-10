class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=1;
        if(s.length()==0){
            return 0;
        }
        // char[] ch=new char[s.length()];
        // for(int k=0;k<s.length();k++){
        //     ch[k]=s.charAt(k);
        // }
        int max=1;
        HashSet<Character> hm=new HashSet();
        while(j<s.length()){
            
            if(!hm.contains(s.charAt(j))){
                hm.add(s.charAt(i));
                hm.add(s.charAt(j));
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