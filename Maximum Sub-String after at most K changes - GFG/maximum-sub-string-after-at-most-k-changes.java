//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        return answer(s,s.length(),k);
    }
     static int findLen(String A, int n, int k, char ch)
    {
        int maxlen = 1;
        int cnt = 0;
        int l = 0, r = 0;
          
        // traverse the whole string
        while (r < n) {
          
            /* if character is not same as ch
               increase count */
            if (A.charAt(r) != ch)
                ++cnt;
      
            /* While  count > k  traverse the string
               again until count becomes less than k
               and decrease the count when characters
               are not same */
            while (cnt > k) {
                if (A.charAt(l) != ch)
                    --cnt;
                ++l;
            }
      
            /* length of substring will be rightIndex -
               leftIndex + 1. Compare this with the maximum
               length and return maximum length */
            maxlen = Math.max(maxlen, r - l + 1);
            ++r;
        }
        return maxlen;
    }
      
    // method which returns maximum length of substring
    static int answer(String A, int n, int k)
    {
        int maxlen = 1;
        for (int i = 0; i < 26; ++i) {
            maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'A')));
            maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'a')));
        }
        return maxlen;
    }
}