//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sum(int n){
        if(n<=0)return 0;
        if(n==1)return 1;
        return (n%10)+sum(n/10);
        
    }
    
    int isDigitSumPalindrome(int N) {
        // code here
        int ans=sum(N);
        return isPal(ans)?1:0; 
    }
    boolean isPal(int n){
        String s=String.valueOf(n);
        int len=s.length();
        
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i))return false;
        }
        return true;
    }
    
}