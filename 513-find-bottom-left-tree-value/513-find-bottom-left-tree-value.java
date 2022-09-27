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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int val=0;
        // List<List<Integer>> ll=new LinkedList<>();
        while(!q.isEmpty()){
            ArrayList<Integer> al=new ArrayList<Integer>();
            int level=q.size();
            al.clear();
            for(int i=0;i<level;i++){
                
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                al.add(q.remove().val);
                val=al.get(0);
            }
            // ll.add(al);
            
        }
        // System.out.println(al);
        return val;
        
    }
}