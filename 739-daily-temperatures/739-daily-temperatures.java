class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] result=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            int count=0;
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    count++;
                    result[i]=count;
                    break;
                }
                else{
                    count++;
                }
            }
        }
        return result;
    }
}