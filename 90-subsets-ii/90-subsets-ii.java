class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        int i=0;
        ArrayList<Integer> al=new ArrayList<>();
        subsets(i,nums.length,al,hs,nums);
        List<List<Integer>> res=new ArrayList<>();
        for(List<Integer> l:hs){
            res.add(l);
        }
        return res;
        
    }
    public void subsets(int i,int n,ArrayList<Integer> al, HashSet<List<Integer>> hs,int[] nums){
        if(i==n){
            hs.add(new ArrayList<>(al));
            return;
        }
        subsets(i+1,n,al,hs,nums);//not take
        
        al.add(nums[i]);
        subsets(i+1,n,al,hs,nums);
        al.remove(al.size()-1);
    }
}