class Solution {
	public int minEatingSpeed(int[] piles, int h) {
	   int max=0;
		for(int i=0;i<piles.length;i++){
			max=Math.max(max,piles[i]);
		}
		int n=piles.length;
		if(h==n){
			return max;
		}
		int l=0;
		int high=max;
		int mid;
		int speed=Integer.MAX_VALUE;
		while(l<=high){
			mid=l+(high-l)/2;
			if(ifpossible(mid,piles,h)){
				speed=mid;
				high=mid-1;

			}
			else
				l=mid+1;
		}
		return speed;


	}
	static boolean ifpossible(int mid,int[]piles,int h){
		int time=0;
		for(int i=0;i<piles.length;i++){
			time+=(int)Math.ceil(piles[i]*1.0/mid);
		}
		return time<=h;
	}
}