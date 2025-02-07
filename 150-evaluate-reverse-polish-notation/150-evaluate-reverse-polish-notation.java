class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        int sum=0;
        for(int i=0;i<tokens.length;i++){
            if(!(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))){
                st.push(Integer.parseInt(tokens[i]));
            }
            else{
                if(tokens[i].equals("+")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(a+b);
                }
                else if(tokens[i].equals("-")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b-a);
                }
                else if(tokens[i].equals("*")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b*a);
                }
                else if(tokens[i].equals("/")){
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b/a);
                }
            }
        }
        return st.peek();
    }
}