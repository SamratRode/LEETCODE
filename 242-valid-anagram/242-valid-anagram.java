class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
        TreeMap<Character,Integer> tm1=new TreeMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            tm.put(s.charAt(i),tm.getOrDefault(s.charAt(i),0)+1);
            tm1.put(t.charAt(i),tm1.getOrDefault(t.charAt(i),0)+1);
        }
        if(tm.equals(tm1)){
            return true;
        }
        return false;
        
    }
}