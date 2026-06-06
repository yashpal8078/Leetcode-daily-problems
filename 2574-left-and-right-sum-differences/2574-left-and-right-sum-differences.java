class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];

         int sum = 0;
        for(int i = 0;i<nums.length;i++){
           leftSum[i] = sum;
           sum+=nums[i];
        }
        int sum1 = 0;
         for(int i = nums.length-1;i >=0;i--){
          rightSum[i] = sum1;

          sum1+=nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}