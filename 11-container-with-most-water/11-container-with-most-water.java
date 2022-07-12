class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int result=Math.min(height[i],height[j])*(j-i);
        while(i<j){
            
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
            result=Math.max(result,Math.min(height[i],height[j])*(j-i));
            
        }
        
        return result;
    }
}