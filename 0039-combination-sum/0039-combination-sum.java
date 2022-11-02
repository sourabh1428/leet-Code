class Solution {
    
    
    public void solve(int ind,int[] arr, int k,List<List<Integer>>wrap,List<Integer>l1){
        
        if(ind==arr.length)
        {
            if(k==0){
                wrap.add(new ArrayList<>(l1));    
                }
            return;
            }
        
        if(arr[ind]<=k){
            l1.add(arr[ind]);
            solve(ind,arr,k-arr[ind],wrap,l1);
            l1.remove(l1.size()-1);
            
           }
        
        solve(ind+1,arr,k,wrap,l1);
    }
    
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>wrap=new ArrayList<>();
        solve(0,candidates,target,wrap,new ArrayList<>());
        
        return wrap;
        
        
    }
}