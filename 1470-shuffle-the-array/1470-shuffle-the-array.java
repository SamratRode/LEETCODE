class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i+=2){
            result[i]=nums[count];
            count++;
        }
        for(int i=1;i<nums.length;i+=2){
            result[i]=nums[count];
            count++;
        }
        return result;
    }
}