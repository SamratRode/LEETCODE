class Solution {
    public String reverseWords(String s) {
        String res="";
        ArrayList<Character> ch=new ArrayList<>(); 
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ch.add(count,s.charAt(i));
                count++;
            }
            else{
                String x="";
                for(Character c:ch){
                    x=c+x;
                }
                res=res+" "+x;
                ch.clear();
                count=0;
            }
        }
        String x="";
        for(Character c:ch){
            x=c+x;
        }
        res=res+" "+x;
        ch.clear();
        count=0;
        return res.trim();
        
    }
}