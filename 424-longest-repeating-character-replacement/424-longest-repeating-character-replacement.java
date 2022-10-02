class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] table= new int[26];
        int result=0;
        int maxF=0;
        for(int r=0,l=0;r<s.length();r++) {
            table[s.charAt(r)-'A']+=1;
            maxF=Math.max(table[s.charAt(r)-'A'],maxF);
            if((r-l+1)-maxF>k) {
                table[s.charAt(l)-'A']-=1;
                l++;
            }
            result=Math.max(result,r-l+1);
        }
        return result;
    }
        
    }
