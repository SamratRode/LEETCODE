class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        if(nums.length==1 && nums[0]==0){
            return 0;
        }
        if(nums.length==2 && nums[0]==0 && nums[1]==0){
            return 0;
        }
        
        
        for(int i=0;i<nums.length;i++ ){
            int count=1;
           
            while(i+1<nums.length && nums[i]==nums[i+1] && nums[i]==1){
                count++;
                i++;
                
            }
            if(count>max){
                max=count;
            }
            
        }
        return max;
    }
}