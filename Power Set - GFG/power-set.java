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
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution

{

    public List<String> AllPossibleStrings(String s)

    {

        

        String out="";

        List<String> ans=new ArrayList<String>();

        solve(s,out,ans);

        ans.remove("");

    Collections.sort(ans);

    return ans;

    }

    // helper function

    public static void solve(String input ,String output,List<String> ans){

       // base case

        if(input.length()==0){

        ans.add(output);

        return;}

        String out1=output;

        String out2=output;

        out2+=input.charAt(0);

        input=input.substring(1);

        solve( input,out1,ans);

        solve( input,out2,ans);

        

    }

 

}