class Solution {
    public int lengthOfLongestSubstring(String s) {
        int acquire=0;
        int release=0;
        int max=0;
        HashSet<Character> hash=new HashSet();
        while(acquire<s.length()){
            if(!hash.contains(s.charAt(acquire))){
                hash.add(s.charAt(acquire));
                acquire++;
                max=Math.max(hash.size(),max);
            }
            else{
                hash.remove(s.charAt(release));
                release++;
            }
        }
        return max;
    }
}