class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        for(int i = 0;i<cardPoints.length;i++){
            totalSum += cardPoints[i];
        }
        int ans =Integer.MIN_VALUE;
        int left = 0;
        int curr = 0;
        int n = cardPoints.length;
        if(n == k) return totalSum;
        for(int right = 0;right < cardPoints.length;right++){
             curr+=cardPoints[right];
             if(right - left + 1 == n- k){
                ans  = Math.max(ans , totalSum - curr);
                curr-= cardPoints[left];
                left++;
             }
        }


        return ans;

    }
}