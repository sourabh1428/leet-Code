class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int arr [] = new int[256]; // Using an integer array for keeping character count.
         int start = 0, end = 0;
         int max = Integer.MIN_VALUE;
        while((start<s.length() && end <s.length()) || start < s.length()-1) {
            if(end < s.length() && arr[s.charAt(end)] == 0){
                arr[s.charAt(end)] = arr[s.charAt(end)]+1;
                end++;
            }else{
                if(end-start > max) 
                    max = Math.max(max, end-start);
                start++;
                end=start;
                arr = new int[256];
            }
        }
        return max;
    }
}