class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        while(i+j<nums3.length){
            if(i==nums1.length){
                nums3[i+j]=nums2[j];
                j++;
            }
            else if(j==nums2.length){
                nums3[i+j]=nums1[i];
                i++;
            }
            else if(nums1[i]<=nums2[j]){
                nums3[i+j]=nums1[i];
                i++;
            }
            else{
                nums3[i+j]=nums2[j];
                j++;
            }
        }
        // for(int a:nums3){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        if(nums3.length%2==0){
            return Double.valueOf(nums3[(nums3.length/2)-1]+nums3[(nums3.length/2)])/2.0;
        }
        else{
            return Double.valueOf(nums3[nums3.length/2]);
        }
    }
}