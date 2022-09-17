class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost1=0;
        int cost2=0;
        for(int i=0;i<position.length;i++){
            if((position[i]-1)%2!=0){
                cost1++;
            }
            else{
                cost2++;
            }
        }
        return Math.min(cost1,cost2);
        
    }
}