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
    public List<Integer> rightSideView(TreeNode root) {
        int level=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        rightTraverse(root,0,al);
        return al;
    }
    public void rightTraverse(TreeNode root,int level,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        if(level==al.size()){
            al.add(root.val);
        }
        rightTraverse(root.right,level+1,al);
        rightTraverse(root.left,level+1,al);
    }
}