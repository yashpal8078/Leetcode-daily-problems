class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for(int i = 0;i<cardPoints.length;i++){
            total += cardPoints[i];
        }
        int ans =Integer.MIN_VALUE;
        int left = 0;
        int curr = 0;
        int n = cardPoints.length;
        if(n == k) return total;
        for(int right = 0;right < cardPoints.length;right++){
             curr+=cardPoints[right];
             if(right - left + 1 == n- k){
                ans  = Math.max(ans , total - curr);
                curr-= cardPoints[left];
                left++;
             }
        }


        return ans;

    }
}