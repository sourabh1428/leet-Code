//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        
        for(int val[]:dp){
            Arrays.fill(val,-1);
        }
        
        
        
        
        return solve(x,y,s1,s2,dp);
    }
    static int solve(int i,int j, String s1,String s2,int[][]dp){
        
        if(i==0 || j==0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1+solve(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(solve(i-1,j,s1,s2,dp),solve(i,j-1,s1,s2,dp));
        
    }
    
}