//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        //min possible sum
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){if(i!=0)pq.offer(i);}
        long left=0;
        long leftpo=1;
        long right=0;
        long rightpo=1;
        boolean flag=false;
        while(!pq.isEmpty()){
            if(flag==false){
            left=left+leftpo*(long)pq.poll();
            leftpo=leftpo*10;
            flag=true;
                
            }
            else{
             right=right+rightpo*(long)pq.poll();
            rightpo=rightpo*10;
            flag=false;   
            }
        }
        return left+right;
    }
}