//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        int dp[][]=new int[N+1][sum+1];
        for(int values[]:dp){
            Arrays.fill(values,-1);
        }
        
        
        return solve(N-1,arr,sum,dp);
    }
    static boolean solve(int N,int arr[],int sum,int[][]dp){
        if(sum==0)return true;
        if(N==0){
         if(sum==arr[0]){return true;}
         else{return false;}
        }
        
        if(dp[N][sum]!=-1)
        return dp[N][sum]==0?false:true;
        
        
        
        boolean nottake=solve(N-1,arr,sum,dp);
        boolean take=false;
        if(sum>=arr[N]){
            take=solve(N-1,arr,sum-arr[N],dp);
            
        }
        dp[N][sum]=nottake||take?1:0;
        return take || nottake;
    }
}