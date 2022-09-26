class Solution {
    public int repeatedStringMatch(String a, String b) {
        String check=a;
        int cnt=0;
        for(int i=1;check.length()<b.length()+a.length();i++){
            if(check.contains(b)){
                return i;
            }
            cnt=i;
            check=check+a;
        }
        if(check.contains(b)){
                return cnt+1 ;
            }
        // System.out.println(check);
        return -1;
        
        
    }
}