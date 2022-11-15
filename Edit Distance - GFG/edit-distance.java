//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n=s.length();
        int m=t.length();
        int[][]dp=new int[n+1][m+1];
        for(int values[]:dp){
            Arrays.fill(values,-1);
        }
        
        
        
        return solve(n,m,s,t,dp);
    }
    public int solve(int n,int m,String s,String t,int[][]dp){
        if(n==0)return m;
        if(m==0)return n;
        
        if(dp[n][m]!=-1)return dp[n][m];
        
        if(s.charAt(n-1)==t.charAt(m-1))return dp[n][m]=0+solve(n-1,m-1,s,t,dp);
        //for delete
        int del=1+solve(n,m-1,s,t,dp);
        int rem=1+solve(n-1,m,s,t,dp);
        int rep=1+solve(n-1,m-1,s,t,dp);
        
        
        return dp[n][m]= Math.min(Math.min(del,rem),rep);
                
        
        
    }
    
}