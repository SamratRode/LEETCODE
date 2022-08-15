class Solution {
    public int countGoodSubstrings(String s) {
        //trying with the sliding window
        int i=0;
        int j=0;
        int count=0;
        ArrayList<Character> al=new ArrayList<Character>();
        while(j<s.length()){
            al.add(s.charAt(j));
            if(j-i+1<3){
                j++;
            }
            else if(j-i+1==3){
                if(isUnique(al)){
                    count++;
                }
                al.remove(0);
                i++;
                j++;
            }
        }
        return count;
        
    }
    public boolean isUnique(ArrayList<Character> al){
        HashSet<Character> hs= new HashSet<Character>(al);
        if(al.size()==hs.size()){
            return true;
        }
        return false;
    }
}