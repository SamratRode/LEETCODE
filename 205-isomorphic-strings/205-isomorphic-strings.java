class Solution {
       public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> sMap  =new HashMap<>(), tMap  =new HashMap<>();
        for(Integer i =0 ; i< s.length() ; i++){
            if(!Objects.equals(sMap.put(s.charAt(i), i) , tMap.put(t.charAt(i), i)))  return false; 
        }
        return true;
    }
}