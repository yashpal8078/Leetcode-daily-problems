class Solution {

    int[] dp;

    public int maximumJumps(int[] nums, int target) {

        dp = new int[nums.length];

        Arrays.fill(dp, -2);

        return helper(nums, target, 0);
    }

    public int helper(int[] nums, int target, int i) {

        if(i == nums.length - 1) {
            return 0;
        }

        if(dp[i] != -2) {
            return dp[i];
        }

        int max = -1;

        for(int j = i + 1; j < nums.length; j++) {

            if(Math.abs(nums[j] - nums[i]) <= target) {

                int ans = helper(nums, target, j);

                if(ans != -1) {
                    max = Math.max(max, ans + 1);
                }
            }
        }

        return dp[i] = max;
    }
}