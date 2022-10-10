/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int x = 0; x < testcases; x++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] =  new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        if(arr.length <= k){
            for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            }
        }else{
            
            for(int i = 0; i <= k; i++){
                pq.add(arr[i]);
            }
                
            for(int i = k+1; i < arr.length; i++){
                 System.out.print(pq.remove()+" ");
                pq.add(arr[i]);
            }
        }
        while(pq.size() > 0){
            System.out.print(pq.remove()+" ");
        }
        System.out.println();
	}
}
}