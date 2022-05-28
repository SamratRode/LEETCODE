class Solution {
    public int missingNumber(int[] nums) {
        int missing=-1;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
            ts.add(nums[i]);
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.addAll(ts);
        for(int i=0;i<=nums.length;i++){
            if(i==nums.length){
                missing=nums.length;
            }
            else{
                if(al.get(i)!=i){
                    missing=i;
                    break;
                }
            }
        }
        return missing;
        
    }
}