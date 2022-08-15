class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            int k=i;
            HashSet<Character> hs=new HashSet<Character>();
            for(int j=k;j<k+3;j++){
                hs.add(s.charAt(j));
            }
            if(hs.size()==3){
                count++;
            }
        }
        return count;
        
    }
}