class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll=new LinkedList<>();
        Arrays.sort(candidates);
        
        combinations(0,candidates,target,ll,new ArrayList<>());
        return ll;
    }
    public void combinations(int ind,int[] candidates,int target,List<List<Integer>> ll,List<Integer> ds){
        if(target==0){
            ll.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            ds.add(candidates[i]);
            combinations(i+1,candidates,target-candidates[i],ll,ds);
            ds.remove(ds.size()-1);
        
        }
    }
}