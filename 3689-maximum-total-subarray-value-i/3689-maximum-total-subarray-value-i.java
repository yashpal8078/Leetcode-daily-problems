class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum = 0;

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];


        for(int i = 0;i<k;i++){
            sum +=(max-min);
        }


        return sum;
    }
}