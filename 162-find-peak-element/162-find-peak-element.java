class Solution {
    public int findPeakElement(int[] nums) {
     ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }int j=0;
        int k=Collections.max(arr);
        for(int i=0;i<n;i++){
            
            if(nums[i]==k){
                
                    j=i;
                
            }
        }
        
        
        
        return j;
    }
}