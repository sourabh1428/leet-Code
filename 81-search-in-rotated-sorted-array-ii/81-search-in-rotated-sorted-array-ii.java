class Solution {
    public boolean search(int[] arr, int target) {
        int peak = check(arr, target);
        int res = binarysearch(arr, target, 0, peak);
        if(res != -1){
            return(true);
        }else{
           int ans = binarysearch(arr, target, peak + 1, arr.length - 1 );
            if (ans != -1){
                return(true);
            }
            return(false);
        }
    }

     static int binarysearch(int[] arr , int target , int low , int high){
        

        while(low <=high) {
            int mid = low + (high - low ) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            }else if (target > arr[mid]){
                low = mid + 1;
            }else{
                return mid ;
            }
        }
        return -1;
    }
    static int check(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2; 

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid -1]) {
                return mid-1;
            }
            //if element at middle,start and end are equal then just skip the duplicates
            if ( arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                //NOTE : what if these element at the start and end where the pivots??
                //check if start is pivot
                if(arr[start] > arr[start +1]){
                    //These means the start is pivot
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end--;
            }
            else if(arr[start] <arr[mid] ||(arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
                return -1;
        }

    
    }
 