class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int[] a:matrix){
            for(int i:a){
                pq.add(i);
                if(pq.size()>k){
                    pq.remove();
                }
            }
            
        }
        
       
      
        return pq.peek();
        
    }
}