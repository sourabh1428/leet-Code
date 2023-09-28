//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1=m-l+1;
         int n2=r-m;
         int[] a=new int[n1];int []b=new int[n2];
         for(int i=0;i<n1;i++){a[i]=arr[i+l];}
         for(int i=0;i<n2;i++){b[i]=arr[m+i+1];}
         
         int i=0;
         int j=0;
         int k=l;
         
         while(i<n1 && j<n2){
             if(a[i]<=b[j]){
                 arr[k]=a[i];
                 i++;
             }
             else{
                 arr[k]=b[j];
                 j++;
             }
             k++;
         }
         while(i<n1){
             arr[k]=a[i];
             k++;i++;
         }
         while(j<n2){
             arr[k]=b[j];
             k++;j++;
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        
        if(l<r){
            int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
            
            
        }
    }
}
