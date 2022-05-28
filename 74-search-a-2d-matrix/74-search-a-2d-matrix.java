class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                al.add(matrix[i][j]);
            }
        }
        //al contains all the elements in ascending order in al
        //Binary sort
        boolean found=false;
        int low=0;
        int high=al.size()-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(target>al.get(mid)){
                low=mid+1;
                mid=(high+low)/2;
            }
            else if(target<al.get(mid)){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(target==al.get(mid)){
                found=true;
                break;
            
            }
            
        }
        return found;
        
    }
}