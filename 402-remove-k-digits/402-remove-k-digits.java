class Solution {
    public String removeKdigits(String num, int k) {
      if (k == num.length()) {
            return "0";
        }
        
        Stack<Character> stk = new Stack<>();
        stk.push(num.charAt(0));
        for (int i = 1; i < num.length(); i++) {
            char ch = num.charAt(i);
            while(stk.size() > 0 && k > 0 && ch < stk.peek()) {
                stk.pop();
                k--;
            }
            
            stk.push(ch);
        }
        
        while (k > 0) {
            stk.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (stk.size() > 0) {
            sb.append(stk.pop());
        }
        
        sb.reverse();
        int i = 0;
        int size = sb.length();
        while (i < size && sb.charAt(0) - '0' == 0) {
            sb.deleteCharAt(0);
            i++;
        }
        
        if (sb.length() == 0) {
            return "0";
        }
        
        return sb.toString();
        
        
    }
}