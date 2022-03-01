class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row1=new ArrayList();
        List<List<Integer>> result=new ArrayList();
        row1.add(1);
        result.add(row1);
        
        if(numRows==1){
            return result;
        }
        
        List<Integer> row2=new ArrayList();
        row2.add(1);
        row2.add(1);
        result.add(row2);
        
        for(int r=2;r<numRows; r++){
            List<Integer> row=new ArrayList();
            row.add(1);
            for(int e=0;e<(result.get(r-1).size())-1;e++){
                row.add(result.get(r-1).get(e)+result.get(r-1).get(e+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
        
    }
}