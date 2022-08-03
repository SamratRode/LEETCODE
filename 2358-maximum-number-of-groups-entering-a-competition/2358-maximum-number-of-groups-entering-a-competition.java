class Solution {
    public int maximumGroups(int[] grades) {
        int low=0;
        int high=1000;
        while(low<high){
            int mid=(low+high+1)/2;
            if(mid*(mid+1)/2>grades.length){
                high=mid-1;
            }
            else{
                low=mid;
            }
        }
        return low;
    }
}