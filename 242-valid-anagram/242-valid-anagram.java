class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans=true;
        ArrayList al=new ArrayList();
        al.addAll(Arrays.asList(s.split("")));
        ArrayList bl=new ArrayList();
        bl.addAll(Arrays.asList(t.split("")));
        Collections.sort(al);
        Collections.sort(bl);
        /*System.out.println(al + " " + bl);*/
        if(al.equals(bl)){
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;
        
    }
}