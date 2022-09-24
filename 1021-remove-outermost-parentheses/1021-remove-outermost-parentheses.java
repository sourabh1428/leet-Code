class Solution {
    public String removeOuterParentheses(String s) {
        Stack st = new Stack();
StringBuilder ab = new StringBuilder();
for(int i = 0; i < s.length(); i++){
char ch = s.charAt(i);
if(ch == '(' && st.isEmpty()){
st.push(ch);
}
else if(ch == '(' && !st.isEmpty() ){
st.push(ch);
ab.append(ch);
}
else if(ch == ')' && st.size() > 1){
ab.append(ch);
st.pop();
}
else if(ch == ')' && st.size() == 1){
st.pop();
}
}
return ab.toString();
}}