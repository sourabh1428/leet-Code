class Solution {
    public int maxArea(int[] height) {
       
        //initializing two sides
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxA=0;
        while(l<r){
            //storing heights in lh and rh
            int lh=height[l];
            int rh=height[r];
            
            //using heights and length calc area
             
            int curr=(r-l)*Math.min(lh,rh);
            //max of current and previous ones
            maxA=Math.max(maxA,curr);
        
        if(lh<rh)l++;
            else{
                r--;
            }
        
        }
        
        return maxA;
    }
}