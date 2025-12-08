public class SumOfSubarrayRange {
    
    public long subArrayRanges(int[] nums) {
        long totalRangeSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minVal = nums[i];
            int maxVal = nums[i];

            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                totalRangeSum += (maxVal - minVal);
            }
        }

        return totalRangeSum;
    }

    public static void main(String[] args) {
        SumOfSubarrayRange solution = new SumOfSubarrayRange();
        int[] nums = {1, 2, 3};
        long result = solution.subArrayRanges(nums);
        System.out.println("Sum of Subarray Ranges: " + result); 
    } 
}
