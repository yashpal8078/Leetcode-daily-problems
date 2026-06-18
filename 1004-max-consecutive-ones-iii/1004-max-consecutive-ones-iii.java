class Solution {
    public int longestOnes(int[] nums, int k) {
        int count0 = 0;
        int start = 0;
        int maxLength = Integer.MIN_VALUE;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                count0++;
            }

            while (count0 > k) {
                if (nums[start] == 0) {
                    count0--;
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}