class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ar[]=new int[m+n];
        int i=0,j=0;
        int k=0;
        while(i<m && j<n){
            if (nums1[i] <= nums2[j]){
                ar[k++]=nums1[i++];
            }else{
                ar[k++]=nums2[j++];
            }
        }
        while (i<m){
            ar[k++]=nums1[i++];
        }
        while (j<n){
            ar[k++]=nums2[j++];
        }
        
        for (int a=0;a<m+n;a++){
            nums1[a]=ar[a];
        }
        
        
        
    }
}