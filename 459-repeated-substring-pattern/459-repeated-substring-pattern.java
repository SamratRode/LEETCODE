class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        // ArrayList<Boolean> al=new ArrayList<>();
        for(int i=1;i<=l/2;i++){
            if(l%i==0){
                String a=s.substring(0,i);
                String res="";
                for(int j=0;res.length()<s.length();j++){
                    res=res+a;
                }
                if(res.equals(s)){
                   return true; 
                }
            }
        }
        return false;
        
    }
}