class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            List<String> val=hm.getOrDefault(new String(tempArray),new ArrayList<String>());
            val.add(s);
            
            hm.put(new String(tempArray),val);
            
        }
        
        return new ArrayList<>(hm.values());
    }
}