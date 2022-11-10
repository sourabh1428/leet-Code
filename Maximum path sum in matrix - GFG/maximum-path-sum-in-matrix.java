//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        int n=N;
       int m =Matrix[0].length;
       int maxi=Integer.MIN_VALUE;
       int dp[][]=new int[n][m];
       
       for(int j=0;j<m;j++){
           dp[0][j]=Matrix[0][j];
       }
       
       for(int i=1;i<n;i++){
           
           for(int j=0;j<m;j++){
               
               int up=Matrix[i][j]+dp[i-1][j];
               int left=Integer.MIN_VALUE;int right=Integer.MIN_VALUE;
               if(j>0)left=Matrix[i][j]+dp[i-1][j-1];
                if(j+1<Matrix[0].length)right=Matrix[i][j]+dp[i-1][j+1];
                
                dp[i][j]=Math.max(up,Math.max(left,right));
        
           }
           
       }
       int curmax=Integer.MIN_VALUE;
       for(int j=0;j<m;j++){
           curmax=Math.max(curmax,dp[n-1][j]);
       }
      
       return curmax;
    }
    
    static int solve(int i,int j,int[][]arr,int[][] dp){
        if(j<0 || j>=arr[0].length)return Integer.MIN_VALUE;
        if(i==0)return arr[0][j];
        if(dp[i][j]!=-1)return dp[i][j];
        
        int up=arr[i][j]+solve(i-1,j,arr,dp);int left=Integer.MIN_VALUE;int right=Integer.MIN_VALUE;
        if(j>=0)left=arr[i][j]+solve(i-1,j-1,arr,dp);
        if(j<arr[0].length)right=arr[i][j]+solve(i-1,j+1,arr,dp);
        
        return dp[i][j]= Math.max(up,Math.max(left,right));
        
        
    }
    
    
    
}