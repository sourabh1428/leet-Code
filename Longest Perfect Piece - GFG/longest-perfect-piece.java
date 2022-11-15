//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        int st = 0;
        
        int ans = 0;
        
        for(int i=0; i<N; i++)
        {
            int x = arr[i];
            
            //Add the element to treemap.
            map.put(x, map.getOrDefault(x, 0)+1);
            
            while(!map.isEmpty() && Math.abs(map.firstKey()-map.lastKey())>1)
            {
                int key = arr[st];
                
                //Remove the window's starting element.
                map.put(key, map.get(key)-1);
                
                //If element does not exist in window.
                if(map.get(key)==0) map.remove(key);
                
                //Shrink the window from the left.
                st++;
            }
            
            ans = Math.max(ans, i-st+1);
            
        }
        
        return ans;
        
    }
};