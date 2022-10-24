class Solution {
    int ans = 0;
    public int maxLength(List<String> arr) {
        HashSet<Character> hs = new HashSet<>();    // storing unique characters in it
        helper(arr, 0, 0, hs);
        return ans;
    }
    
    public int helper(List<String> arr, int idx, int count, HashSet<Character> hs){  // count variable store the length of unique concatenated string
        if(idx == arr.size()){
            return count;
        }
        for(int i = idx; i < arr.size(); i++){
            boolean flag = true;
            HashSet<Character> temp = new HashSet<>();
            for(int j = 0; j < arr.get(i).length(); j++){
                if(hs.contains(arr.get(i).charAt(j))){                 // if the ith string has any character which occured before in previous string then made flag false and break the loop
                    flag = false;
                    break;
                }
                temp.add(arr.get(i).charAt(j));              // here we are adding all characters in different hashset to check that any character in ith string occured 2 or more times or not.
                
            }
            if(flag == true && temp.size() == arr.get(i).length()){   // if ith string does not contains any character which occured before and in ith string also does not have any character which occured 2 or more times.
                for(int j = 0; j < arr.get(i).length(); j++){
                    hs.add(arr.get(i).charAt(j));
                }
                ans = Math.max(ans, helper(arr, i + 1, count + arr.get(i).length(), hs));  // if ith string  does not contains any same character then add the length of ith string in count and move to the next string 
                for(int j = 0; j < arr.get(i).length(); j++){
                    hs.remove(arr.get(i).charAt(j));      // in back tracking remove those characters which we have added before
                }
            }else{
                ans = Math.max(ans, helper(arr, i + 1, count, hs));    // if ith string containing any same character then we move on to the next index without including the ith string.
            }
            
        }
        return ans;   // return maximum concatenated unique character string
        
    }
}