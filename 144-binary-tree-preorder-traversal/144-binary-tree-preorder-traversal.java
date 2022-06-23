/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(root==null){
            return al;
        }
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        // int count=0;
        while(!st.isEmpty()){
            // System.out.print(st.peek().val+ " ");
            root=st.pop();// THis is a very important statement, kyuki jo value nikal raha hu use root bhi to banana hai so that waha se traversal ho
            al.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
            // count++;
        }
        return al;
    }
}