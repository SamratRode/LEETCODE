class Solution {
    public List<String> simplifiedFractions(int n) {
        ArrayList<String> l=new ArrayList<String>();
        HashSet<Float> hs=new HashSet<Float>();
        for(int j=2;j<=n;j++){
            for(int i=1;i<j;i++){
                if(!hs.contains((float)i/j)){
                    hs.add((float)i/j);
                l.add(Integer.toString(i)+"/"+Integer.toString(j));}
            }
        }
        return l;
        
    }
}