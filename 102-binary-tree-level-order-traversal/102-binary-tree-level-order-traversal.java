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
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null){
                    q.add((q.peek().left));
                }
                if(q.peek().right!=null){
                    q.add((q.peek().right));
                }
                l.add(q.remove().val);
            }
            al.add(l);
        }
        return al;
        
    }
}