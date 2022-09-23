class StockSpanner {

    Stack<int[]> st;
    int i; //days
    int ans; //total
    
    public StockSpanner() {
        st = new Stack<>();
        i = 0;
        ans =0;
    }
    
    public int next(int price) {
             //decreasing order me bnana hai
        //hill climb krke uska heigh pta krskte na ki niche utarte samy
        while(!st.isEmpty() && st.peek()[0] <= price){
            st.pop();
        }
        ans = st.isEmpty() ? i+1:  i-st.peek()[1];
        st.push(new int[]{price,i});
        i++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */