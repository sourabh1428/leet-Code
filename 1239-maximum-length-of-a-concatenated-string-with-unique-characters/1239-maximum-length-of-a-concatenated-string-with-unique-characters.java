class Solution {
    public int maxLength(List<String> arr) {
        // edge case
        if(arr == null || arr.size() == 0) return 0;
        
        // inintialiazation
        Set<Character> chars = new HashSet();
        return maxLength(arr, 0, chars);
    }
    public int maxLength(List<String> arr, int index, Set<Character> chars){
        // edge case
        if(index >= arr.size()) return 0;
        
        // without considering the current index string
        int currMax = maxLength(arr, index + 1, chars);
        
        // When we consider the current string
        Set<Character> currChars = new HashSet();
        boolean isUnique = true;
        
        // add the chars into a set and check if
        // chars are unique locally and globally
        
        for(char ch : arr.get(index).toCharArray()){
            if(chars.contains(ch) || currChars.contains(ch)){
                isUnique = false;
                break;
            }
            currChars.add(ch);
        }
        // when characters of current string is unique
        if(isUnique){
            chars.addAll(currChars);
            currMax = Math.max(currMax, arr.get(index).length()+maxLength(arr, index+1, chars));
            chars.removeAll(currChars);
                
        }
        return currMax;
    }
}