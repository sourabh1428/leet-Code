class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m * k > n)
            return -1;
        // Now it is possible to make m bouquets 
        int l = 1, r = -1;
        for(int i = 0; i < n; i++)
            r = Math.max(r, bloomDay[i]); // O(n) step
        int mid, ans = -1;
        while(l <= r){
            mid = (l + r) / 2;
            if(isValid(bloomDay, n, m, k, mid)){
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }
    boolean isValid(int bloomDay[], int n, int m, int k, int max){
        // If it's possible to make m bouquets in max number days
        int b = 0, f = 0;
        for(int i = 0;i < n; i++){
            if(bloomDay[i] > max){
                f = 0;
            }
            else {
                f++;
                if(f == k){
                    b++;
                    f = 0; // considering for the next bouquet
                }
            }
        }
        if(b >= m)
            return true;
        return false;
    }
}