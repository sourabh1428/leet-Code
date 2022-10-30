
    public class Solution {
    public int titleToNumber(String s) {
       int result=0;
        int factor=1;
        
        for(int i=s.length()-1;i>=0;i--){
            result+=factor*(s.charAt(i)-'A'+1);
            factor*=26;
        }
        return result;
    }
}
    
