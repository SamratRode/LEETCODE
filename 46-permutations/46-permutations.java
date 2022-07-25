class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll=new LinkedList<>();
        int[] map=new int[nums.length];
        List<Integer> ds=new LinkedList<>();
        f(map,ds,ll,nums);
        return ll;
    }
    public void f(int[] map,List<Integer> ds,List<List<Integer>> ll,int[] nums){
        if(ds.size()==nums.length){
            ll.add(new LinkedList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(map[i]!=-1){
                ds.add(nums[i]);
                map[i]=-1;
                f(map,ds,ll,nums);
                ds.remove(ds.size()-1);
                map[i]=0;
            }
        }
    }
}