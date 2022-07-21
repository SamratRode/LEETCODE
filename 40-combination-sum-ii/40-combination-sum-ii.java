class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ll=new LinkedList<>();
        combinations(0,new ArrayList<>(),ll,target,candidates);
        return ll;
    }
    public void combinations(int ind,List<Integer> l,List<List<Integer>> ll,int target,int[] candidates ){
        if(target==0){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            else if(candidates[i]>target){
                break;
            }
            l.add(candidates[i]);
            combinations(i+1,l,ll,target-candidates[i],candidates);
            l.remove(l.size()-1);
        }
         
    }
}