class Solution {
    
    
    public void solve(int ind,int[] nums,List<List<Integer>>ans,ArrayList<Integer>ds){
        
            ans.add(new ArrayList<>(ds));
        
        for(int i=ind;i<nums.length;i++){
            
            if(i!=ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            solve(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
        
        
        
        
        
    }
    
    
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>arr=new ArrayList<>();
        
        solve(0,nums,arr,new ArrayList<>());
        return arr;
        
    }
}