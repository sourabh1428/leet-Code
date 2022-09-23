class Solution {
    public int[] sortedSquares(int[] nums) {
      ArrayList<Integer> list=new ArrayList<>();
        
        int  n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]*nums[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}