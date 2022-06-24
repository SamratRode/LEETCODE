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
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        traverseTree(root,al);
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<al.size();i++){
            hm.put(al.get(i),hm.getOrDefault(al.get(i),0)+1);
        }
        // System.out.print(al + " " +hm);
        int max=0;
        for(Map.Entry mapping: hm.entrySet()){
            if((int)mapping.getValue()>max){
                max=(int)mapping.getValue();
            }
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(Map.Entry mapping: hm.entrySet()){
            if((int)mapping.getValue()==max){
                result.add((int)mapping.getKey());
            }
        }
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
        
        
        
    }
    public void traverseTree(TreeNode root, ArrayList<Integer> al){
        if(root==null){
            return;
        }
        
        traverseTree(root.left,al);
        al.add(root.val);
        
        al.remove(al.size()-1);
        traverseTree(root.right,al);
        
        al.add(root.val);
        
    }
}