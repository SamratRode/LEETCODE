class Solution {
    public List<String> summaryRanges(int[] nums) {
        int[] nums1=new int[nums.length+1];
        for(int i=0;i<nums1.length;i++){
            if(i==nums1.length-1){
                nums1[i]=10000;
            }
            else{
                nums1[i]=nums[i];
            }
        }
        List<String> l=new ArrayList();
        String s="";
        int count=0;
        for(int i=0;i<nums1.length-1;i++){
            
            
            if(nums1[i]+1==nums1[i+1]){
                if(count==0){
                    s=s+nums1[i]+"->";
                }
                count=1;
                continue;
                
            }
            else{
                s=s+nums1[i];
                l.add(s);
                count=0;
                s="";
                
            }
            // l.add(s);
            
        }
        
        
        return l;
    }
}