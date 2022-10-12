class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> v = new ArrayList<>();
        for(String s:arr)
            v.add(s);

        for(String s : v)
        {
            if(Collections.frequency(v, s) == 1) // Find the distinct number and decrement the value of k.
                k--;
            if(k == 0)
                return s;   
        }
        
        return "";
    }
}