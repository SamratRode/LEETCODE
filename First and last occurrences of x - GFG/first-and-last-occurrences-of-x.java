// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> al=new ArrayList<Long>();
        int index=Arrays.binarySearch(arr,x);
        if(index<0){
            index=-index;
        }
        if(index>=arr.length){
            index=0;
        }
        if(arr[index]!=x){
            Long c=(long)-1;
            al.add(c);
            al.add(c);
            return al;
        }
        else{
        long second=index;
        while(index+1<n && arr[index+1]==x){
            second=index+1;
            index++;
        }
        long first=index;
        while( index-1>=0 && arr[index-1]==x){
            first=index-1;
            index--;
        }
        
        al.add(first);
        al.add(second);
        return al;
        }
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends