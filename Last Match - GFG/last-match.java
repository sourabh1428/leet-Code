//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static int findLastOccurence(String A,String B){
        // code here
        int ans=-1;
        int n=A.length();int m=B.length();
        for(int i=0;i<A.length();i++){
            if(i+m<=n){
                String s=A.substring(i,i+m);
                if(s.equals(B)){
                    ans=i+1;    
                }
                
            }
            }
       
            
        
        return ans;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String A = read.readLine().trim();
             String B = read.readLine().trim();
          

            Solution ob = new Solution();
            System.out.println(ob.findLastOccurence(A,B));
        }
    }
}
// } Driver Code Ends