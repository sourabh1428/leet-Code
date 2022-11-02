class Solution {
    
    public void solve(int ind,int k,int[] arr,List<List<Integer>>ans,ArrayList<Integer>ds)
    {
        
        if(k==0){
            
            ans.add(new ArrayList<>(ds));
            return;
            
        }
        
        for(int i=ind;i<arr.length;i++){
            
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>k)break;
            
            ds.add(arr[i]);
            
            solve(i+1,k-arr[i],arr,ans,ds);
            
            ds.remove(ds.size()-1);
            
            
        }
        
        
    
        
        
    }
    
    
    
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,target,candidates,ans,new ArrayList<Integer>());
        
        return ans;
    }
    
}