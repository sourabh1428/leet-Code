class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0; i<s.length(); i++){
            // increasing count of that char found in s
            count[s.charAt(i)-'a']++;
            // decreasing count of that char found in t
            count[t.charAt(i)-'a']--;
        }
        // every charachter count must be zero
        for(int i=0; i<26; i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}