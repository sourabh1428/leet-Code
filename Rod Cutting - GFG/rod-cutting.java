//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int dp[][]=new int[n][n+1];
        
        for(int values[]:dp){
            Arrays.fill(values,-1);
        }
        
        return solve(n-1,n,price,dp);
    }
    public int solve(int ind, int len, int[] price,int[][] dp){
        if(ind==0){
            return len*price[ind];
        }
        if(dp[ind][len]!=-1)return dp[ind][len];
        
        //nottake
        int ntake=0+solve(ind-1,len,price,dp);
        int take=Integer.MIN_VALUE;
        int rodle=ind+1;
        if(rodle<=len){
            take=price[ind]+solve(ind,len-rodle,price,dp);
        }
        
        return dp[ind][len]= Math.max(ntake,take);
        
    }
}