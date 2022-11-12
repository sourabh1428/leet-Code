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
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }

        if(sum%2!=0)return 0;
        int k=sum/2;
        
        int dp[][]=new int[N][k+1];
        for(int values[]:dp){
            Arrays.fill(values,-1);
        }
        
        return solve(N-1,k,arr,dp)?1:0;
        
        
    }
    static boolean solve(int ind, int s, int arr[],int[][]dp){
        if(s==0)return true;
        if(ind==0){
            if(arr[0]==s){return true;}
            else{return false;}
        }
        if(dp[ind][s]!=-1)return dp[ind][s]==0?false:true;
        boolean nt=solve(ind-1,s,arr,dp);
        boolean ta=false;
        if(s>=arr[ind]){
            ta=solve(ind-1,s-arr[ind],arr,dp);
        }
        dp[ind][s]= nt|| ta?1:0;
        return nt||ta; 
    }
}