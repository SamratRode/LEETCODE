class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long left=0;
        long right=100000000;
        
        while(left<right){
            long mid=(left+right+1)/2;
            long sum=0;
            for(int i=0;i<candies.length;i++){
                sum=sum+(candies[i]/mid);
                
            }
            if(sum>=k){
                left=mid;
            }
            else if(sum<k){
                right=mid-1;
            }
            
        }
        return (int)left;
    }
}