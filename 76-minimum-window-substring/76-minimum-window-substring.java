class Solution {
    public String minWindow(String s, String t) {
        
        
        if(s.equals(t)) {
            return s;
        }
        
        HashMap<Character, Integer> pattMap = new HashMap<>();
        
        int i=0, j=0;
        int m=0, n=0;
        int max = s.length();
        
    //map me choti string daldo    
    
        for(int k = 0; k < t.length(); k++) {
            pattMap.put(t.charAt(k), pattMap.getOrDefault(t.charAt(k), 0)+1);
        }
        
        //overall count lelo map k size ka
        
        int count = pattMap.size();
        
        while(i <= j) {
            
            if(count > 0) {
                if(j >= s.length()) {
                    break;
                }
                if(pattMap.containsKey(s.charAt(j))) {
                    pattMap.put(s.charAt(j), pattMap.get(s.charAt(j))-1);
                    if(pattMap.get(s.charAt(j)) == 0) {
                        count--;
                    }
                }
                
                j++;
            } else {
                
                if((j-i) <= max) {
                    m = i;
                    n = j;
                    max = j-i;
                }
                
                if(pattMap.containsKey(s.charAt(i))) {
                    if(pattMap.get(s.charAt(i)) == 0) {
                        count++;
                    }
                    pattMap.put(s.charAt(i), pattMap.get(s.charAt(i))+1);
                }
                
                i++;
            }
        }
        
        return s.substring(m, n);
    }
}