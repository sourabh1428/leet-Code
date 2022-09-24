class Solution {
    
    public static int[] searchRange(int[] nums, int target) {
     int low = 0;
        int high = nums.length - 1;
        int[] ans = {-1,-1};
        
        //FOR STARTING POINT 
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target )
                low = mid + 1;
            else if(nums[mid] > target)
                high = mid - 1;
            else{
                ans[0] = mid;
                high = mid - 1;
                }
            }
        
        low = 0;
        high = nums.length - 1;
        //FOR ENDING POINT 
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target )
                low = mid + 1;
            else if(nums[mid] > target)
                high = mid - 1;
            else{
                ans[1] = mid;
                low = mid + 1;
                }
            }
        return ans;
        
        
    }
}