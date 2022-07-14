class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ll=new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int low=i+1;
            int high=nums.length-1;
            
            while(low<high){
                List<Integer> l=new LinkedList<>();
                // System.out.println(low+" "+high);
                if(nums[low]+nums[high]<(-nums[i])){
                    low++;
                }
                else if(nums[low]+nums[high]>(-nums[i])){
                    high--;
                }
                else{
                    l.add(nums[i]);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    ll.add(l);
                    low++;
                }
            }
        }
        
        List<List<Integer>> lf=new LinkedList<>();
        lf.addAll(ll);
        return lf;
        
    }
}