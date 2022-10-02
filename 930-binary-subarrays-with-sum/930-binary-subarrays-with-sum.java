class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return helper(nums,goal)-helper(nums,goal-1);
        
        
    }
    private int helper(int[] A,int s){
        if(s<0)return 0;
        
        int i=0,res=0;
        for(int j=0;j<A.length;j++){
            s-=A[j];
            
            while(s<0){
                s+=A[i++];
            }
            res+=j-i+1;
            
        }
        
        return res;
        
        
        
    }
}