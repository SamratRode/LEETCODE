class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd=findGCD(numsDivide,numsDivide.length);
        Arrays.sort(nums);
        int min=0;
        int i=0;
        while(i<=nums.length){
            if(i==nums.length){
                return -1;
            }
            else{
                if(gcd%nums[i]==0){
                    return i;
                }
                i++;
            }
        }
        return -1;
        
    }
    
    public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    
    
    
    
    public int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
}