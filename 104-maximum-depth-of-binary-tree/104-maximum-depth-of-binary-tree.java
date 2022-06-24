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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.add(root);
        ArrayList<ArrayList<Integer>> all=new ArrayList<ArrayList<Integer>>();
        while(!q.isEmpty()){
            ArrayList<Integer> al=new ArrayList<Integer>();
            int s=q.size();
            for(int i=0;i<s;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                al.add(q.remove().val);
            }
            all.add(al);
            
        }
        return all.size();
    }
}