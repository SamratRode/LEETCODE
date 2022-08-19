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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return al;
        }
        q.add(root);
        while(!q.isEmpty()){
            LinkedList<Integer> l=new LinkedList<>();
            int level=q.size();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                l.add(q.remove().val);
            }
            al.add(l);
            
        }
        return al;
        
    }
}