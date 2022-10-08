class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int l = 0, r = cardPoints.length - k;

        int currSum = 0;

        for (int i = r; i < n; i++)
            currSum += cardPoints[i];

        int maxSum = currSum;

        while (r < n) {
            currSum += (cardPoints[l++] - cardPoints[r++]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}