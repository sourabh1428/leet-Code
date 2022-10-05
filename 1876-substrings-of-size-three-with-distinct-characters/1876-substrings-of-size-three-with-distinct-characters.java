class Solution {
    public int countGoodSubstrings(String s) {
        // init ans to 0
        int ans = 0;
        
        // init i to 0
        int i = 0;
        // init j to 1
        int j = 1;
        // init k to 2
        int k = 2;
        // while k is less than s length
        while (k < s.length()) {
            // if s char at i is not equal to s char at j
            // AND s char at i is not equal to s char at k
            // AND s char at j is not equal to s char at k
            if (s.charAt(i) != s.charAt(j)
               && s.charAt(i) != s.charAt(k)
               && s.charAt(j) != s.charAt(k)) {
                // increase ans by 1
                ans++;
            }
            // increase i by 1
            i++;
            // increase j by 1
            j++;
            // increase k by 1
            k++;
        }
        
        // return ans
        return ans;
    }
}