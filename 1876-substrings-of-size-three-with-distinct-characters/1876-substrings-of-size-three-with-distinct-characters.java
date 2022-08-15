class Solution {
    public int countGoodSubstrings(String s) {
        int i=0;
        int j=0;
        int count=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        while(j<s.length()){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1<3){
                j++;
            }
            else if(j-i+1==3){
                if(hm.size()==3){
                    count++;
                }
                int val=hm.get(s.charAt(i));
                val=val-1;
                if(val==0){
                    hm.remove(s.charAt(i));
                }
                else{
                    hm.put(s.charAt(i),val);
                }
                i++;
                j++;
            }
        }
        return count;
    }
}