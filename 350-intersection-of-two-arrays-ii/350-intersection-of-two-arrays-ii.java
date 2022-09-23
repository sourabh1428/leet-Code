class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      int[] map = new int[1001];
        int[] res = new int[1001];
        
        for(int i = 0; i < nums1.length; i++){
            map[nums1[i]]++;
        }
        
        int count = 0;
        for(int i = 0;i < nums2.length; i++){
            if(map[nums2[i]] > 0)
            {
                res[count++] = nums2[i];
                map[nums2[i]]--;
            }
        }
        
        return Arrays.copyOfRange(res, 0, count);
        
    }
}