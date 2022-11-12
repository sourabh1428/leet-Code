//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    static int mod=(int)Math.pow(10,9)+7;

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int dp[][]=new int[n][sum+1];
	    for(int values[]: dp){
	        Arrays.fill(values,-1);
	    }
	    
	    
	    return solve(n-1,sum,arr,dp);
	    
	} 
	
	public int solve(int ind,int sum,int []arr,int[][] dp){
	    
	    if(ind==0){
	        if(sum==0 && arr[ind]==0)return 2;
	        if(sum==0 || arr[0]==sum)return 1;
	        return 0;
	    }
	    if(dp[ind][sum]!=-1)return dp[ind][sum];
	    int ntake=solve(ind-1,sum,arr,dp)%mod;
	    int take=0;
	    if(sum>=arr[ind]){
	        take=solve(ind-1,sum-arr[ind],arr,dp)%mod;
	    }
	    return dp[ind][sum]= (take+ntake)%mod;
	}
}