class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(int i=0;i<s.length();i=i+1){
            int a=i;
            String x="";
            for(int j=i;j<a+10 && j<s.length();j++){
                x=x+s.charAt(j);
            }
            if(x.length()==10){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
        }
        // System.out.println(hm);
        for(String b:hm.keySet()){
            if(hm.get(b)>1){
                res.add(b);
            }
            
        }
        return res;
        
    }
}