//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] nums, int n, int target) {
          int start=0;
        int end=nums.length-1;  int res=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                    start=mid+1;
            }
            else{
                end=mid-1;
            }


        }

        start=0;
        end=nums.length-1;
        int occ=-1;
         while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                occ=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                    start=mid+1;
            }
            else{
                end=mid-1;
            }


        }




    

    if(occ==-1 && res ==-1)return 0;
    return occ-res+1;

    }
}