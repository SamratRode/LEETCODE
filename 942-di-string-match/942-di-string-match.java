class Solution {
    public int[] diStringMatch(String s) {
        int[] perm=new int[s.length()+1];
        int lo=0;
        int hi=s.length();
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                perm[i]=lo;
                hs.add(lo);
                lo++;
                
            }
            else{
                perm[i]=hi;
                hs.add(hi);
                hi--;
            }
            
        }
        
        perm[perm.length-1]=lo;
        return perm;
    }
}