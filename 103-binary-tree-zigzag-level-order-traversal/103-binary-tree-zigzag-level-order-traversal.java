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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new LinkedList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int flag=0;
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
            if(flag==0){
                al.add(l);
                flag=1;
            }
            else{
                List<Integer> rev=new LinkedList<Integer>();
                for(int i=l.size()-1;i>=0;i--){
                    rev.add(l.get(i));
                }
                al.add(rev);
                flag=0;
            }
        }
            
            
        
            
            
        return al;
        
        
    }
}