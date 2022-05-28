class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       boolean found=false;
        
        outer: for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    found=true;
                    break outer;
                }
            }
        }
        return found; 
    }
}





