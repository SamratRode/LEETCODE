class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> hl=new HashSet<>();
        List<List<Integer>> ll=new LinkedList<>();
        List<Integer> ds=new LinkedList<>();
        int[] map=new int[nums.length];
        f(ds,map,hl,nums);
        for(List<Integer> lis:hl){
            ll.add(lis);
        }
        return ll;
    }
    public void f(List<Integer> ds,int[] map,HashSet<List<Integer>> hl,int[] nums){
        if(ds.size()==nums.length){
            hl.add(new LinkedList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(map[i]!=-1){
                ds.add(nums[i]);
                map[i]=-1;
                f(ds,map,hl,nums);
                ds.remove(ds.size()-1);
                map[i]=0;
            }
        }
    }
}