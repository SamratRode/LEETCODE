class Solution {
    public boolean checkPossibility(int[] nums) {
        int i=0;
        if(nums.length<=1){
            return true;
        }
        while(nums[i]<=nums[i+1]){
            if(i==nums.length-2){
                return true;
            }
            
            i++;
        }
        
        if(i>0 && nums[i-1]>nums[i+1])
        nums[i+1]=nums[i];
        else{
            nums[i]=nums[i+1];
        }
        for(int a:nums){
            System.out.print(a+" ");
        }
        for(i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                return false;
            }
        }
        
        return true;
        
    }
}