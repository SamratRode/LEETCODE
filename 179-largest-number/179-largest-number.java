class Solution {
    public String largestNumber(int[] nums) {
        String[] conv=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            conv[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(conv,(a,b)->(b+a).compareTo(a+b));
        if(conv[0].equals("0")){
            return "0";
        }
        String res="";
        for(int i=0;i<conv.length;i++){
            res=res+conv[i];
        }
        return res;
    }
}