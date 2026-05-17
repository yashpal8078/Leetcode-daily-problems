class Solution {
    public long[] findPrefixScore(int[] nums) {

        long[] conversion = new long[nums.length];
        int max = 0;
        for(int i  = 0;i<nums.length;i++){
             max  = Math.max(max,nums[i]);
             conversion[i]  = nums[i] + max;
        }

        for(int i = 1;i<conversion.length;i++){
            conversion[i]  = conversion[i-1] + conversion[i];
        }

        return conversion;
        
    }
}