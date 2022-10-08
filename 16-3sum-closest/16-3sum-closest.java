class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length, result=0,diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int s=i+1,e=n-1;
            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];
                if(Math.abs(diff)>Math.abs(sum-target)){
                    diff=sum-target;
                    result=sum;
                }
                if(sum<target)
                    s++;
                else
                    e--;
            }
        }
        return result;
        
    }
}