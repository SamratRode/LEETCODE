class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force
        int set=-15000;
        // System.out.println(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k]=set;
                        }
                    }
                    for(int l=0;l<matrix.length;l++){
                        if(matrix[l][j]!=0){
                            matrix[l][j]=set;
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==set){
                    matrix[i][j]=0;
                }
            }
        }        
    }
}