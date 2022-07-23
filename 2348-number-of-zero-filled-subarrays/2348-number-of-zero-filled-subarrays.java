class Solution
{
    public long zeroFilledSubarray(int[] nums)
    {
        long ans = 0L, cur = 0L;
        for(int i : nums)
        {
            if(i == 0)
                cur++;
            else
            {
                ans += (long)(1L*cur*(cur+1)/2);
                cur = 0L;
            }
        }
        ans += (long)(1L*cur*(cur+1)/2); // If the array ends with 0
        return ans;
    }
}