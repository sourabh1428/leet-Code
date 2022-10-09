class Solution {
    public int findTheWinner(int n, int k) {
        
        List<Integer> ls = new ArrayList<>();
        
        for(int i=1;i<=n;i++)
        {
            ls.add(i);
        }
        
        int idx = 0;
         k=k-1 ;
         while(ls.size()>1)
        {
            idx = idx + k;
            if(idx>ls.size()-1)
            {
                int s = ls.size();
                idx = idx%s;
            }
            ls.remove(idx);      
        }
        return ls.get(0);
    }
}