//Recursion 55/68 -> TLE
class Solution {
public int rob(int[] nums) {
int n=nums.length-1;
return f(n,nums);
}
public int f(int n, int[] nums){
if(n==0){
return nums[0];
}
if(n<0){
return 0;
}
int pick=nums[n]+f(n-2,nums);
int nonpick=0+f(n-1,nums);
return Math.max(pick,nonpick);
}
}
//Memoisaation