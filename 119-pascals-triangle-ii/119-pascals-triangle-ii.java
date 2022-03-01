class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList();
        List<Integer> row1=new ArrayList();
        row1.add(1);
        result.add(row1);
        if(rowIndex==0){
            return result.get(0);
        }
        
        List<Integer> row2=new ArrayList();
        row2.add(1);
        row2.add(1);
        result.add(row2);
        if(rowIndex==1){
            return result.get(result.size()-1);
        }
        rowIndex++;
        for(int r=2;r<rowIndex;r++){
            List<Integer> row=new ArrayList();
            row.add(1);
            for(int e=0;e<result.get(r-1).size()-1;e++){
                row.add(result.get(r-1).get(e)+result.get(r-1).get(e+1));
            }
            row.add(1);
            result.add(row);
        }
        return result.get(result.size()-1);
        
        
    }
}