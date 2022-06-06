// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        // System.out.println(hm);
        // return -1;
        
        for(Map.Entry mapping: hm.entrySet()){
            int value=(int)mapping.getValue();
            if(value>(size)/2){
                return (int)mapping.getKey();
            }
        }
        return -1;
    }
}