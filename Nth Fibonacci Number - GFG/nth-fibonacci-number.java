//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java



class Solution {

static int mod=(int)Math.pow(10,9)+7;

    static int nthFibonacci(int n){
        // code her
        int first=0;
        int sec=1;
        for(int i=2;i<=n;i++){
            int x=(first+sec)%mod;
            first=sec;
            sec=x;
        }
        return sec;
    }
}