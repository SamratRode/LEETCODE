class Solution {
    public boolean isValid(String s) {
         ArrayList<Character> open=new ArrayList<Character>();
        
        Stack<Character> st=new Stack<Character>();
        open.add('{');
        open.add('[');
        open.add('(');
        
        for(int i=0;i<s.length();i++){
            // System.out.print(st);
            if(open.contains(s.charAt(i))){
                
                st.push(s.charAt(i));
                
                
            }
            else{
                
                if(st.isEmpty()){
                    return false;
                }char c='1';
                if(st.peek()=='('){
                    c=')';
                }
                if(st.peek()=='{'){
                    c='}';
                }
                if(st.peek()=='['){
                    c=']';
                }
                if(c==s.charAt(i)){
                    
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}