class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        ArrayList<Integer> al=new ArrayList<Integer>();
        int r0=0;
        int rn=rows-1;
        int c0=0;
        int cn=cols-1;
        int i=0;
        int j=0;
        int count=0;
        
        while(r0 <= rn && c0 <= cn){//rowBegin <= rowEnd && colBegin <= colEnd
                
            

                for(i=r0,j=c0;j<=cn;j++){
                    al.add(matrix[i][j]);
                    count++;
                }
                r0++;
             
                
                
                
            
            
                for(j=cn,i=r0;i<=rn;i++){
                    al.add(matrix[i][j]);
                    count++;
                }
                cn--;
          
                
           
            
                for(i=rn,j=cn;j>=c0;j--){
                    al.add(matrix[i][j]);
                    count++;
                }
                rn--;
            
                
           
            
                for(j=c0,i=rn;i>=r0;i--){
                    al.add(matrix[i][j]);
                    count++;
                }
                c0++;
            
                
            
          
            
            
            
        }
        int total=rows*cols-1;
        while(al.size()!=rows*cols){
            al.remove(rows*cols);
        }
        return al;
    }
}