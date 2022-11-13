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
    public int cutRod(int price[], int N) {
       
    int dp[][]=new int[N][N+1];
    
    for(int row[]:dp)
    Arrays.fill(row,-1);
    
    for(int i=0; i<=N; i++){
        dp[0][i] = i*price[0];
    }
    
    for(int ind=1; ind<N; ind++){
        for(int length =0; length<=N; length++){
        
             int notTaken = 0 + dp[ind-1][length];
    
             int taken = Integer.MIN_VALUE;
             int rodLength = ind+1;
             if(rodLength <= length)
                taken = price[ind] + dp[ind][length-rodLength];
        
             dp[ind][length] = Math.max(notTaken,taken);   
        }
    }
    
    return dp[N-1][N];
        
        
        
        
        
        // return solve(n-1,n,price,dp);
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