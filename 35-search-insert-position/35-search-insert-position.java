class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=Arrays.binarySearch(nums,target);
        if(a>=0){
            return a;
        }
        return (a*-1)-1;
    }
}