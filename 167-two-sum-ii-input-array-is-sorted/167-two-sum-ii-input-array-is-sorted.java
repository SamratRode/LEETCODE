class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int low=0;
        int high=numbers.length-1;
        int mid=0;
        
        while(low<high){
            System.out.println(low+" "+high);
            if(numbers[low]+numbers[high]>target){
                high--;
                
            }
            else if(numbers[low]+numbers[high]<target){
                low++;
            }
            else if(numbers[low]+numbers[high]==target){
                res[0]=low+1;
                res[1]=high+1;
                break;
            }
            
        }
        return res;
        
    }
}