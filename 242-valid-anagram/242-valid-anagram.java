class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> ch=new ArrayList<Character>();
        ArrayList<Character> ch1=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
            ch1.add(t.charAt(i));
        }
        Collections.sort(ch);
        Collections.sort(ch1);
        if(ch.equals(ch1)){
            return true;
        }
        return false;
    }
}