class Solution {
    public int[] finalPrices(int[] prices) {
        //nse;
        //price arr= curr-nge
           int res[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            res[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    res[i]=prices[i]-prices[j];
                    break;
            }
            }
            
        }
       return res;
        
        
    }
}