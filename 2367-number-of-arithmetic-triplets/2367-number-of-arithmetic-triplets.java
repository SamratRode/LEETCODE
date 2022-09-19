class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> hs=new HashSet<Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-diff) && hs.contains(nums[i]-(2*diff))){
                count++;
            }
            hs.add(nums[i]);
        }
        return count;
        
        
    }
}