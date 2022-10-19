class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int oc=0;
        int i=0; int j=0;
        int ans=0;
        Set<String> set=new HashSet<>();
        while(j<nums.length){
            if(nums[j]%p==0){
                oc++;
            }
            while(oc>k&&i<nums.length){
                oc-=(nums[i]%p==0)?1:0;
                i++;
            }
            int t=j;
            String s="";
            while(t>=i){
                s=nums[t--]+" "+s;
                set.add(s);
            }
            j++;
        }
        return set.size();   
    }
}