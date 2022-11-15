//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String x,String y,int m,int n)
    {
        //Your code here
        //step-1 lcs
        //step2- lcs(dp)me iterate kro jo common h usko add krdo string me
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)dp[i][0]=0;
        for(int i=0;i<=n;i++)dp[0][i]=0;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1))dp[i][j]=1+dp[i-1][j-1];
                else{
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);    
                }
                
                
            }
        }
        int lcs=dp[m][n];
        String str="";
        while(m>0 && n >0){
            if(x.charAt(m-1)==y.charAt(n-1)){
                str+=x.charAt(m-1);
                m--;n--;
            }
            else if(dp[m-1][n]>dp[m][n-1]){
                str+=x.charAt(m-1);
                m--;
            }
            else{
                str+=y.charAt(n-1);
                n--;
            }
        }
        while(m-->0)str+=x.charAt(m);
        while(n-->0)str+=y.charAt(n);
        
        return str.length();
        
        
        
    }
}