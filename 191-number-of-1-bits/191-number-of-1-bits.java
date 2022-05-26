public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            ++count;
            n=n&(n-1);//right most bit set bit( is set to 0 ..... i.e. 0101010 --> 0101000)
        }
        
        return count;
    }
}