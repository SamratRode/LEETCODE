class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i<n; i++){
            
            int a = 0;
            int b = m-1;
            
            while(a<= b){
                int mid = a + (b - a)/2;
                
                if(matrix[i][mid] == target){
                    return true;
                }
                else if(matrix[i][mid] < target){
                    a = mid+1;
                }
                else if(matrix[i][mid] > target){
                    b = mid - 1;
                }
            }
        }
        return false;
    }
}