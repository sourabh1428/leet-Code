class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int arrIndex = 0;
        ArrayList<Integer> tentativeMax = new ArrayList<>();
        int i = 0 , j = 0;
        while(j < nums.length){
            int index = tentativeMax.size()-1;
            while (tentativeMax.size() != 0 && tentativeMax.get(index) < nums[j]){
                tentativeMax.remove(index--);
            }
            tentativeMax.add(nums[j]);
            if (j-i+1<k){
                j++;
            }
            else{
                ans[arrIndex++] = tentativeMax.get(0);
                if (Objects.equals(tentativeMax.get(0), nums[i])){//equals removes the null case
                    tentativeMax.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}