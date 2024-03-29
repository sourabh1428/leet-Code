//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        
        // code here
        if(low<high){
    
            int pi=partition(arr,low,high);
    
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);

        }
        
        
    }
    static int partition(int arr[], int l, int h)
    {
        // your code here
            int low=l;
            int high=h;
            
            int pivot=arr[low]; 
            
            
            while(low<high){
                
                while(arr[low]<=pivot && low<h){
                    low++;
                }
                while(arr[high]>pivot && high>l){
                    high--;
                }
            //swap
            
                if(low<high){
                int x=arr[low];
                arr[low]=arr[high];
                arr[high]=x;
                    
                }
            }
            int x=arr[l];
            arr[l]=arr[high];
            arr[high]=x;
        
        return high;
        
    } 
}
