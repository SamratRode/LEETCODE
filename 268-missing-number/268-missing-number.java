class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length;
        Arrays.sort(nums);
        int missing =-1;
        for(int i=0;i<=range;i++){
            if(i==range){
                missing=range;
                
            }
            else{
                if(nums[i]!=i){
                    missing =i;
                    break;
                }
            }
        }
        return missing;
        
    }
}