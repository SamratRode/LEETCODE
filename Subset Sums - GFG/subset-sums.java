// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> result=new ArrayList<Integer>();
    void sumS(int i,int sum,ArrayList<Integer> arr){
            if(i==arr.size()){
                result.add(sum);
                return;
                
            }
            else{
                sumS(i+1,sum,arr);
                sum=sum+arr.get(i);
                sumS(i+1,sum,arr);
                sum=sum-arr.get(i);
            }
            return;
        }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        
        sumS(0,0,arr);
        
        return result;
    }
}