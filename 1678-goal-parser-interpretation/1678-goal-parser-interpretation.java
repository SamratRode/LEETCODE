class Solution {
    public String interpret(String command) {
        String s2=command.replace("()","o");
        return s2.replace("(al)","al");
    }
}