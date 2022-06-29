class Solution {
    public boolean isValid(String s) {
         
        
        Stack<Character> st=new Stack<Character>();
        
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{'){
                
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