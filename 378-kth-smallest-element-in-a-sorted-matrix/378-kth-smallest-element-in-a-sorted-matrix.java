class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int[] a:matrix){
            for(int i:a){
                al.add(i);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<al.size();i++){
            pq.add(al.get(i));
            if(pq.size()>k){
               
                pq.remove();
            }
          
            
        }
      
        return pq.peek();
        
    }
}