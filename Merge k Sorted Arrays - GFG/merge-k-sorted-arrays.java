//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution

{

    //Function to merge k sorted arrays.

    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 

    {
        PriorityQueue<Pair> minHeap=
        new PriorityQueue<>((a,b) -> a.val-b.val);
        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(new Pair(arr[i][0],i,0));

        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!minHeap.isEmpty())

        {

            int ind=minHeap.peek().ind;

            int r=minHeap.peek().r;

            ans.add(minHeap.poll().val);

            if(ind+1<K)

            {

                minHeap.add(new Pair(arr[r][ind+1],r,ind+1));

            }

        }

        return ans;

    }

}

class Pair

{
    int val,ind,r;
    Pair(int val,int r,int ind)
    {
        this.val=val;

        this.ind=ind;

        this.r=r;

    }

    

}