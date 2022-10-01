class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        int cz=0;
        int ans=Integer.MIN_VALUE;
        
        
        //applying sliding window
        
        
        
        while(j<n){
            
            if(nums[j]==0){cz++;}
            while(cz>k){
                if(nums[i]==0){
                    cz--;
                }
                
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        
        }
    
        return ans;
        
    }
}