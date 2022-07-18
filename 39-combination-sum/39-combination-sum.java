class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        combination(0,candidates,target,ll,new ArrayList<>());
        return ll;
    }
    public void combination(int index,int[] candidates,int target,List<List<Integer>> ll,List<Integer> ds){
        if(index==candidates.length){
            if(target==0){
                ll.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            combination(index,candidates,target-candidates[index],ll,ds);
            ds.remove(ds.size()-1);
        }
        combination(index+1,candidates,target,ll,ds);
        
    }
}
 