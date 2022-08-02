class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int[] a:matrix){
            for(int i:a){
                al.add(i);
            }
        }
        Collections.sort(al);
        return al.get(k-1);
        
    }
}