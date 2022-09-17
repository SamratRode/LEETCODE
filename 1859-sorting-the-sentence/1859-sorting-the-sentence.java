class Solution {
    public String sortSentence(String s) {
        String[] s1=s.split(" ");
        String[] res=new String[s1.length];
        for(int i=0;i<s1.length;i++){
            int val=Integer.valueOf(s1[i].substring(s1[i].length()-1))-1;
            String a=s1[i].substring(0,s1[i].length()-1);
            res[val]=a;
        }
        String result="";
        for(String x:res){
            result=result+x+" ";
        }
        return result.trim();
        
        
    }
}