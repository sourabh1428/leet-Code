//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int mod=(int)Math.pow(10,9)+7;
    static List<Integer> minPartition(int N)
    {
        int arr[]={1,2,5,10,20,50,100,200,500,2000};
        int n=arr.length;
        
        List<Integer>ds=new ArrayList<>();
        solve(n-1,N,arr,ds);
        return ds;
        
    }
    static int solve(int ind,int sum,int[]arr,List<Integer>ds){
        if(sum==0)return 0;
        if(ind==0){
            if(sum%arr[ind]==0){
                ds.add(arr[ind]);
                return sum/arr[ind];
            }
            else {return mod;}
            
        }int take=mod;int ntake=mod;
         if(sum>=arr[ind]){
            ds.add(arr[ind]);
            take=solve(ind,sum-arr[ind],arr,ds);
        }
        else{
         ntake=0+solve(ind-1,sum,arr,ds);
        }
       
        
        return Math.min(take,ntake);
    }
}