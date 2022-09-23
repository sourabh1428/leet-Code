class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        if(l==1) return nums[0];
        int maxSum = Integer.MIN_VALUE, currMax = 0;
        for(int i=0;i<l; i++)
        {
            currMax+= nums[i];
            if(currMax>maxSum) maxSum=currMax;
			//if true -> the previous sum isn't relevant
            if(currMax<0) currMax=0;
        }
        return maxSum;
        
    }
}