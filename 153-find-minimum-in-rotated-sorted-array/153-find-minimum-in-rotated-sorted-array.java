class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low + (high-low)/2;
            // System.out.println(mid);
            if(arr[mid]==arr[high]){
                high--;
            }
            else if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[high];
    }
}