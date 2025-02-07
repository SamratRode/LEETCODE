// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] result=new int[arr.length];
        int[] res=new int[2];
        int duplicate=0;
        int missing=0;
        for(int i=0;i<arr.length;i++){
            if(result[arr[i]-1]!=0){
                duplicate=result[arr[i]-1];
                
            }
            result[arr[i]-1]=arr[i];
            
            
        }
        for(int i=0;i<arr.length;i++){
            if(result[i]==0){
               missing=i+1;
               break;
            }
        }
        res[0]=duplicate;
        res[1]=missing;
        return res;
        
    }
}