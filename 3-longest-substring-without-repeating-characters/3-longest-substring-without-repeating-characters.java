class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm = new HashSet<>();
        int i=0;
        int j=0;
        int maxL = 0;
        while(j<s.length()){
            if(!hm.contains(s.charAt(j))){
                hm.add(s.charAt(j));
                maxL = (j-i+1) > maxL ? (j-i+1) : maxL;
                j++;
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    hm.remove(s.charAt(i));
                    i++;
                }
                hm.remove(s.charAt(i));
                i++;
            }
        }
        return maxL;
    }
}