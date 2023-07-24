//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String s[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			int a[] = new int[n];
			s = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				a[i] = Integer.parseInt(s[i]);
			List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
			for(List<Integer> list : ans){
				for(int x : list)
					ot.print(x + " ");
				ot.println();
			}
			if(ans.size() == 0)
			    ot.println();
		}
        ot.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	public List<List<Integer>> CombinationSum2(int a[], int n, int k){
		// Code Here.
		List<List<Integer>>ans=new ArrayList<>();
		List<Integer>ds=new ArrayList<>();
		Arrays.sort(a);
		solve(0,k,a,ds,ans);
		return ans;
	}
	public static void solve(int ind,int targ,int[] arr,List<Integer>ds,List<List<Integer>>ans){
	    if(targ==0){
	        Collections.sort(ds);
	        ans.add(new ArrayList<>(ds));
	        return;
	    }
	    for(int i=ind;i<arr.length;i++){
	        if(i>ind && arr[i]==arr[i-1])continue;
	        if(targ<arr[i])break;
	        ds.add(arr[i]);
	        solve(i+1,targ-arr[i],arr,ds,ans);
	        ds.remove(ds.size()-1);
	    }
	}
}

