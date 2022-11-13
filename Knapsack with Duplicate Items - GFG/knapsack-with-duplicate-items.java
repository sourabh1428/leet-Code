//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int dp[][]=new int[N][W+1];
        
        for(int values[]:dp){
            Arrays.fill(values,-1);
        }
        
        
        
        
      return solve(N-1,W,val,wt,dp);
    }
    static int solve(int ind,int sum,int[] val,int [] wt ,int[][]dp){
        
        if(ind==0){
            // if(sum>=wt[ind]){
                return (sum/wt[ind])*val[ind];
            // }
            // else{
            //     return Integer.MIN_VALUE;
            // }
            
        }
        if(dp[ind][sum]!=-1)return dp[ind][sum];
        
        int take=Integer.MIN_VALUE;
        if(sum>=wt[ind]){
            take=val[ind]+solve(ind,sum-wt[ind],val,wt,dp);
        }
        //ntake
        int ntake=0+solve(ind-1,sum,val,wt,dp);
        
        //take
        
        
        return dp[ind][sum]= Math.max(take,ntake);
    }
}