class Solution {
    public static int binary(int[] arr, int n, int x) {

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = (s + e) / 2;

      if (arr[m] == x) {
        return m;
      } else if (arr[m] < x) {
        s = m + 1;
      } else {
        e = m - 1;
      }
    }
    return -1;

    }
    
    
    public static int count(int[] arr, int n, int x) {

    // code here
    // get the index of X in array
    int idx = binary(arr, n, x);

    // if X does not exist return 0;
    if (idx == -1) {
      return 0;
    }

    int k = 1;
    int left = idx - 1;

    // check left half for X
    while (left >= 0 && arr[left] == x) {
      k++;
      left--;
    }
    // check right half for X
    int right = idx + 1;
    while (right < n && arr[right] == x) {
      k++;
      right++;
    }

    return k;

  }
    
    
    
    public static int singleNonDuplicate(int[] nums) {
        int o=0;
        for(int i=0;i<nums.length;i++){
                        o=i;
            int x=count(nums,nums.length,nums[i]);
            if( x==1){
                o=nums[i];
                break;
            }
        }
       return o;
    }
}