//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    
      static int Prec(char ch) {
    switch (ch) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
  }
    
    
    public static String infixToPostfix(String exp) {
        // Your code here
        StringBuilder ans=new StringBuilder();
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
                
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                    
                }
                
                if(!st.isEmpty() && st.peek()!='('){
                    return "Invalid";
                }
                
                st.pop();
            }
            else{
                while(!st.isEmpty() && Prec(ch)<=Prec(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
    while(!st.isEmpty()){
        if (st.peek() == '(') {
                // Invalid expression: mismatched parentheses
                return "Invalid Expression";
            }
        ans.append(st.pop());
         }
    
    
    return ans.toString();
    
        
    }
    
    
    
    
    
}