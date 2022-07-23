class Solution {
    public long zeroFilledSubarray(int[] nums) {
        ArrayList<Long> al=new ArrayList<Long>();
        al.add(Long.valueOf(0));
       
        long count=0;
        if(nums.length==1){
            if(nums[0]==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        
        for (int i = 0; i < nums.length; i++)
        {
             
            // Reset count when 0 is found
            if (nums[i] == 0)
                count++;//increase count
     
            // If 1 is found, increment count
            // and update result if count becomes
            // more.
            else
            {
                
                al.add(count);
                count=0;
            }
        }
        if(count>1){
            al.add(count);
        }
        else if(count==1 && nums[nums.length-1]==0){
            al.add(Long.valueOf(1));
        }
        
        
        // System.out.println(al);
        long sum1=0;
        for(int j=0;j<al.size();j++){
            sum1=sum1+count(al.get(j));
        }
        return sum1;
        
    }
    public long count(long k){
        long sum=(k*(k+1))/2;
        return sum;
    }
}