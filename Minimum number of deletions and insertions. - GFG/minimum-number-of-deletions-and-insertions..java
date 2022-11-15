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
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int ind1=str1.length();
	    int ind2=str2.length();
	    
	    int dp[][]=new int[ind1+1][ind2+1];
	    for(int i=0;i<=ind1;i++)dp[i][0]=0;
	    for(int i=0;i<=ind1;i++)dp[i][0]=0;
	   
	    for(int i=1;i<=ind1;i++){
	        for(int j=1;j<=ind2;j++){
	            if(str1.charAt(i-1)==str2.charAt(j-1)){dp[i][j]=1+dp[i-1][j-1];}
	            else{dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);}
	        }
	    }
	    int lcs=dp[ind1][ind2];
	    return((ind1+ind2)-2*lcs);
	    
	    
	    
	} 
	
}