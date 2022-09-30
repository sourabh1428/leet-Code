class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList=new ArrayList<>();
        resList.add(new ArrayList<Integer>());
        subsetsHelper(resList,0,nums,new ArrayList<Integer>());
        return resList;
    }
    public void subsetsHelper(List<List<Integer>> resList,int index,int[] nums,ArrayList<Integer> arrList){
        if(index==nums.length) return ;
        for(int i=index;i<nums.length;i++){
            arrList.add(nums[i]);
            resList.add(new ArrayList<Integer>(arrList));
            subsetsHelper(resList,i+1,nums,arrList);
            arrList.remove(arrList.size()-1);
        }
    }
}
//Please