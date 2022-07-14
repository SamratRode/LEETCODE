class Solution {
    public void rotate(int[][] matrix) {
        //swap across main diagonal
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
        

        
        
    }
}