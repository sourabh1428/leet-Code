class Solution {
    public int missingNumber(int[] nums) {
                         
         int n = nums.length;
        int sum = n * (n+1) / 2;
        int restSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            restSum += nums[i];
        }
        int missingNumber = sum - restSum;
        return missingNumber;

    }
}