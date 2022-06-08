class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int ptr0=0;
        int count=0;
        while(i<m+n && j<n){
            if(nums1[i]==0 && i>=m+count){
                ptr0=i;
                while(ptr0<m+n && j<n){
                    nums1[ptr0]=nums2[j];
                    ptr0++;
                    j++;
                }
            }
            else if(nums1[i]<=nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                int last=m+n-1;
                while(last>i){
                    nums1[last]=nums1[last-1];
                    
                    last--;
                }
                count++;
                
                nums1[i]=nums2[j];
                i++;
                j++;
            }
        }
    }
}