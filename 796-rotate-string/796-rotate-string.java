class Solution {
    public boolean rotateString(String s, String goal) {
        boolean bool = false;
        if(s.length()!=goal.length()){
            bool = false;
        }
        // contains method checks if string contains sequence of charecters 
        // by taking s+s we can check for all the possibilites 
        else if((s+s).contains(goal)){
            bool = true;
        }
        return bool;
    }
}