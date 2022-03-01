class Solution {
    public int maxProduct(int[] nums) {
//         int big1=0;
//         int big2=0;
//         int l=nums.length;
//         int i=0;
//         while(i<l-1){
//             if(nums[i]>=nums[i+1]){
//                 if(nums[i]>big1 && nums[i+1]>big2){
//                     big1=nums[i];
//                     big2=nums[i+1];
                    
//                 }
//                 else if(nums[i]>big1 && nums[i+1]<big2){
//                     big1=nums[i];
//                 }
//                 else if(nums[i]<big1 && nums[i+1]>big2){
//                     big2=nums[i+1];
//                 }
//             }
//             else if(nums[i]<nums[i+1]){
//                 if(nums[i+1]>big1 && nums[i]>big2){
//                     big1=nums[i+1];
//                     big2=nums[i];
                    
//                 }
//                 else if(nums[i+1]>big1 && nums[i]<big2){
//                     big1=nums[i+1];
//                 }
//                 else if(nums[i+1]<big1 && nums[i]>big2){
//                     big2=nums[i];
//                 }
                
//             }
//             i++;
//         }
//         return (big1-1)*(big2-1);
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}