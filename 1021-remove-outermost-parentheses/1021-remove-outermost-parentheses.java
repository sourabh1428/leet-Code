class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder S = new StringBuilder();
       int count=0;
        

        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            int prev=count;
            
            if(c=='(')count++;
            else count--;
            
            if(prev==0&&count==1)continue;
             if(prev==1&&count==0)continue;
            
            S.append(c);
            
        }
        
        return S.toString();
        
    }
}